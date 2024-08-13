package com.iuri.mercadinho.dto;

import com.iuri.mercadinho.model.ItemVenda;
import com.iuri.mercadinho.model.Venda;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class VendaResponse {

    private Integer id;
    private String cliente;
    private List<ItemVenda> itemVendas;

    public VendaResponse converter(Venda venda){
        return VendaResponse.builder()
                .id(venda.getId())
                .cliente(venda.getCliente())
                .itemVendas(venda.getItemVendas())
                .build();
    }
}
