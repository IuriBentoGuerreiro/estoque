package com.iuri.mercadinho.model;

import com.iuri.mercadinho.dto.ItemVendaRequest;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

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
    @Column(name = "quantidade")
    private Integer quantidade;
    @Column(name = "preco")
    private BigDecimal preco;
    @ManyToOne
    @JoinColumn(name = "id_produto", referencedColumnName = "id")
    private Produto produto;
    @ManyToOne
    @JoinColumn(name = "id_venda", referencedColumnName = "id")
    private Venda venda;

    public static ItemVenda converter(ItemVendaRequest itemVendaRequest){
        return ItemVenda.builder()
                .quantidade(itemVendaRequest.getQuantidade())
                .preco(itemVendaRequest.getPreco())
                .produto(new Produto(itemVendaRequest.getIdProduto()))
                .venda(new Venda(itemVendaRequest.getIdVenda()))
                .build();
    }
}
