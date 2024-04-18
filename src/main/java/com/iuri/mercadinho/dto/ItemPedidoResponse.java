package com.iuri.mercadinho.dto;

import com.iuri.mercadinho.model.ItemPedido;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ItemPedidoResponse {

    private Integer id;
    private LocalDate data;
    private Integer quanntidade;

    public static ItemPedidoResponse converterParaResponse(ItemPedido pedido){
        return ItemPedidoResponse.builder()
                .id(pedido.getId())
                .data(LocalDate.now())
                .quanntidade(pedido.getQuanntidade())
                .build();
    }
}
