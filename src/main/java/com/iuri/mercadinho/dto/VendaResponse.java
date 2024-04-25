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
    private Integer quanntidadeVenda;
    private List<ItemVenda> vendas;

    public static VendaResponse converterParaResponse(Venda venda){
        return VendaResponse.builder()
                .id(venda.getId())
                .data(LocalDate.now())
                .quanntidadeVenda(venda.getQuantidadeVenda())
                .build();
    }
}
