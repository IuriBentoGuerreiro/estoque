package com.iuri.mercadinho.dto;

import com.iuri.mercadinho.model.ItemPedido;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class VendaRequest {

    private String cliente;
    private List<ItemPedido> itemPedido;
}
