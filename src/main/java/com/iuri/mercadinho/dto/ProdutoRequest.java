package com.iuri.mercadinho.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProdutoRequest {

    private String nome;
    private Integer quantidade;
    private BigDecimal preco;
}
