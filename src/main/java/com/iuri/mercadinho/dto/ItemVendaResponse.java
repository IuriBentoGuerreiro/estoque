package com.iuri.mercadinho.dto;

import com.iuri.mercadinho.model.ItemVenda;
import com.iuri.mercadinho.model.Produto;
import com.iuri.mercadinho.model.Venda;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ItemVendaResponse {

    private Integer id;
    private Integer quantidade;
    private Integer idProduto;
    private String produtoDescricao;

    public static ItemVendaResponse converterParaResponse(ItemVenda itemVenda){
        return ItemVendaResponse.builder()
                .id(itemVenda.getId())
                .quantidade(itemVenda.getQuantidade())
                .build();
    }
}
