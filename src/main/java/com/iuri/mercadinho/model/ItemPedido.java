package com.iuri.mercadinho.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Entity
@Data
public class ItemPedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "data")
    private LocalDate data;
    @Column(name = "quantidade")
    private Integer quanntidade;

    @OneToMany(mappedBy = "itemPedido")
    private List<Produto> produtos;
    @ManyToOne
    private Venda venda;
}