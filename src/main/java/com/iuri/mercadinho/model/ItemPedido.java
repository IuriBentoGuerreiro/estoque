package com.iuri.mercadinho.model;

import com.iuri.mercadinho.dto.ItemPedidoRequest;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Table(name = "item_pedido")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class ItemPedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "data")
    private LocalDate data;
    @Column(name = "quantidade")
    private Integer quanntidade;

    public static ItemPedido converterParaItemPedido(ItemPedidoRequest pedidoRequest){
        return ItemPedido.builder()
                .data(LocalDate.now())
                .quanntidade(pedidoRequest.getQuanntidade())
                .build();
    }
}
