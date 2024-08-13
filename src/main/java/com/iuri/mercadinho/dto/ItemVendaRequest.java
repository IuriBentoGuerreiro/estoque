package com.iuri.mercadinho.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ItemVendaRequest {

    private Integer idProduto;
    private Integer idVenda;
    private Integer quantidade;
    private BigDecimal preco;
}
