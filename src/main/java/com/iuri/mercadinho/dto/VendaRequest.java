package com.iuri.mercadinho.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class VendaRequest {

    private LocalDate data;
    private Integer quanntidadeVenda;
    private String cliente;
    private List<ItemVendaRequest> vendas;
}
