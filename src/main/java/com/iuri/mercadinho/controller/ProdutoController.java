package com.iuri.mercadinho.controller;

import com.iuri.mercadinho.dto.ProdutoRequest;
import com.iuri.mercadinho.dto.ProdutoResponse;
import com.iuri.mercadinho.service.ProdutoService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "Produto")
@RestController
@RequestMapping("/produto")
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @Operation(summary = "Cadastrar produto")
    @PostMapping
    public ProdutoResponse salvar(@RequestBody ProdutoRequest produtoRequest){
        return ProdutoResponse.converter(produtoService.salvar(produtoRequest));
    }

    @Operation(summary = "Pegar produto por id")
    @GetMapping("/{id}")
    public ProdutoResponse pegarPorId(@PathVariable Integer id){
        return ProdutoResponse.converter(produtoService.pegarPorId(id));
    }

    @Operation(summary = "Listar produtos")
    @GetMapping
    public List<ProdutoResponse> listar(){
        return produtoService.listar().stream()
                .map(ProdutoResponse::converter).toList();
    }

    @Operation(summary = "Atualizar produto")
    @PutMapping("/{id}")
    public ProdutoResponse atualizar(@PathVariable Integer id, @RequestBody ProdutoRequest produtoRequest){
        return ProdutoResponse.converter(produtoService.atualizar(id, produtoRequest));
    }

    @Operation(summary = "Deletar produto")
    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Integer id){
         produtoService.deletar(id);
    }
}
