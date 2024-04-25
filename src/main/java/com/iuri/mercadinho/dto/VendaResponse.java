package com.iuri.mercadinho.dto;

import com.iuri.mercadinho.model.ItemVenda;
import com.iuri.mercadinho.model.Venda;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class VendaResponse {

    private Integer id;
    private LocalDate data;
    private Integer quanntidade;
    private String cliente;
    private List<ItemVendaRequest> vendas;

    public static VendaResponse converterParaResponse(Venda venda){
        return VendaResponse.builder()
                .id(venda.getId())
                .data(LocalDate.now())
                .quanntidade(venda.getQuantidadeVenda())
                .cliente(venda.getCliente())
                .build();
    }
}
