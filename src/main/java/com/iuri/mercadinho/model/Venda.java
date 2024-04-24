package com.iuri.mercadinho.model;

import com.iuri.mercadinho.dto.VendaRequest;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Table(name = "venda")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Venda {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "data")
    private LocalDate data;
    @Column(name = "quantidade")
    private Integer quanntidade;

    public static Venda converterParaItemPedido(VendaRequest pedidoRequest){
        return Venda.builder()
                .data(LocalDate.now())
                .quanntidade(pedidoRequest.getQuanntidade())
                .build();
    }
}
