package com.iuri.mercadinho.model;

import com.iuri.mercadinho.dto.VendaRequest;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Entity
@Table(name = "venda")
@Data
@Builder
public class Venda {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String cliente;

    @OneToMany(mappedBy = "venda")
    private List<ItemPedido> itemPedido;

    public Venda converter(VendaRequest vendaRequest){
        return Venda.builder()
                .cliente(vendaRequest.getCliente())
                .itemPedido(vendaRequest.getItemPedido())
                .build();
    }
}
