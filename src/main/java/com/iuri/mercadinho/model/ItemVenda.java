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
    @Column(name = "id")
    private Integer id;
    @Column(name = "quantidade_venda")
    private Integer quantidadeVenda;
    @JoinColumn(name = "produto_id")
    @ManyToOne
    private Produto produtoId;

    public static ItemVenda converterParaItemVenda(ItemVendaRequest itemVendaRequest){
        return ItemVenda.builder()
                .quantidadeVenda(itemVendaRequest.getQuantidadeVenda())
                .produtoId(itemVendaRequest.getProdutoId())
                .build();
    }
}
