package com.iuri.mercadinho.dto;

import com.iuri.mercadinho.model.ItemVenda;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class VendaRequest {

    private String cliente;
    private List<ItemVenda> itemVendas;
}
