package com.iuri.mercadinho.dto;

import com.iuri.mercadinho.model.Venda;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class VendaResponse {

    private Integer id;
    private LocalDate data;
    private Integer quanntidade;

    public static VendaResponse converterParaResponse(Venda pedido){
        return VendaResponse.builder()
                .id(pedido.getId())
                .data(LocalDate.now())
                .quanntidade(pedido.getQuanntidade())
                .build();
    }
}
