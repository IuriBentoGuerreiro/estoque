package com.iuri.mercadinho.model;

import com.iuri.mercadinho.dto.VendaRequest;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Entity
@Table(name = "venda")
@Data
@Builder
@AllArgsConstructor
public class Venda {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String cliente;

    @OneToMany(mappedBy = "venda")
    private List<ItemVenda> itemVendas;

    public Venda(Integer id){
        this.id = id;
    }

    public Venda converter(VendaRequest vendaRequest){
        return Venda.builder()
                .cliente(vendaRequest.getCliente())
                .itemVendas(vendaRequest.getItemVendas())
                .build();
    }
}
