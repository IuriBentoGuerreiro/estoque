package com.iuri.mercadinho.model;

import com.iuri.mercadinho.dto.ProdutoRequest;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Entity
@Table(name = "produto")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "nome")
    private String nome;
    @Column(name = "quantidade")
    private Integer quantidade;
    @Column(name = "preco")
    private BigDecimal preco;

    public static Produto converterParaProduto(ProdutoRequest produtoRequest){
        return Produto.builder()
                .nome(produtoRequest.getNome())
                .preco(produtoRequest.getPreco())
                .build();
    }
}
