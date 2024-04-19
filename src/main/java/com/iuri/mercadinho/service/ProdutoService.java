package com.iuri.mercadinho.service;

import com.iuri.mercadinho.dto.ProdutoRequest;
import com.iuri.mercadinho.model.Produto;
import com.iuri.mercadinho.repository.ProdutoRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.webjars.NotFoundException;

import java.util.List;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    public Produto salvar(ProdutoRequest produtoRequest){
        return produtoRepository.save(Produto.converterParaProduto(produtoRequest));
    }

    public Produto pegarPorId (Integer id){
        return produtoRepository.findById(id).orElseThrow(
                ()-> new NotFoundException("Recurso não encontrado")
        );
    }

    public List<Produto> listar(){
        return produtoRepository.findAll();
    }

    public Produto atualizar(Integer id, ProdutoRequest produtoRequest){
        Produto produtoSalvo = pegarPorId(id);
        BeanUtils.copyProperties(produtoRequest, produtoSalvo, "id");
        return produtoRepository.save(produtoSalvo);
    }

    public void deletar(Integer id){
        produtoRepository.deleteById(id);
    }
}
