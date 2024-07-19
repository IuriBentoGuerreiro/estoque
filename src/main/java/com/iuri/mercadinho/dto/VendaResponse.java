package com.iuri.mercadinho.dto;

import com.iuri.mercadinho.model.ItemPedido;
import com.iuri.mercadinho.model.Venda;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class VendaResponse {

    private Integer id;
    private String cliente;
    private List<ItemPedido> itemPedido;

    public static VendaResponse converter(Venda venda){
        return VendaResponse.builder()
                .id(venda.getId())
                .cliente(venda.getCliente())
                .itemPedido(venda.getItemPedido())
                .build();
    }
}
