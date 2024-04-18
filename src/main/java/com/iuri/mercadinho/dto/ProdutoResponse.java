package com.iuri.mercadinho.dto;

import com.iuri.mercadinho.model.Produto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProdutoResponse {

    private Integer id;
    private String nome;
    private Integer quantidade;
    private BigDecimal preco;

    public static ProdutoResponse converterParaResponse(Produto produto){
        return ProdutoResponse.builder()
                .id(produto.getId())
                .nome(produto.getNome())
                .quantidade(produto.getQuantidade())
                .preco(produto.getPreco())
                .build();
    }
}
