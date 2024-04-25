package com.iuri.mercadinho.dto;

import com.iuri.mercadinho.model.Produto;
import com.iuri.mercadinho.model.Venda;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ItemVendaRequest {

    private Integer quantidadeVenda;
    private Produto produtoId;
}
