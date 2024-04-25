package com.iuri.mercadinho.model;

import com.iuri.mercadinho.dto.ItemVendaRequest;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "item_venda")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ItemVenda {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @JoinColumn(name = "venda_id")
    @ManyToOne
    private Venda venda;
    @JoinColumn(name = "produto_id")
    @ManyToOne
    private Produto produto;

    public static ItemVenda converterParaItemVenda(ItemVendaRequest itemVendaRequest){
        return ItemVenda.builder()
                .venda(itemVendaRequest.getVenda())
                .produto(itemVendaRequest.getProduto())
                .build();
    }
}
