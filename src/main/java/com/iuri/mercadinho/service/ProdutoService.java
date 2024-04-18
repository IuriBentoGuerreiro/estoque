package com.iuri.mercadinho.service;

import com.iuri.mercadinho.dto.ProdutoRequest;
import com.iuri.mercadinho.exception.NotFoundException;
import com.iuri.mercadinho.model.Produto;
import com.iuri.mercadinho.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
        pegarPorId(id);
        return produtoRepository.save(Produto.converterParaProduto(produtoRequest));
    }

    public void deletar(Integer id){
        produtoRepository.deleteById(id);
    }
}
