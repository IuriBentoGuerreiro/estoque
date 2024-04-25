package com.iuri.mercadinho.dto;

import com.iuri.mercadinho.model.ItemVenda;
import com.iuri.mercadinho.model.Produto;
import com.iuri.mercadinho.model.Venda;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ItemVendaResponse {

    private Integer id;
    private Integer quantidadeVenda;
    private Venda venda;
    private Produto produtoId;

    public static ItemVendaResponse converterParaResponse(ItemVenda itemVenda){
        return ItemVendaResponse.builder()
                .id(itemVenda.getId())
                .quantidadeVenda(itemVenda.getQuantidadeVenda())
                .produtoId(itemVenda.getProdutoId())
                .build();
    }
}
