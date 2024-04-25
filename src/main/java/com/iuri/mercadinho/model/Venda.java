package com.iuri.mercadinho.model;

import com.iuri.mercadinho.dto.VendaRequest;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

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
    @Column(name = "quantidade_venda")
    private Integer quantidadeVenda;
    @OneToMany
    @JoinColumn(name = "vendas")
    private List<ItemVenda> itemVenda;

    public static Venda converterParaVenda(VendaRequest vendaRequest){
        return Venda.builder()
                .data(LocalDate.now())
                .quantidadeVenda(vendaRequest.getQuanntidadeVenda())
                .build();
    }
}
