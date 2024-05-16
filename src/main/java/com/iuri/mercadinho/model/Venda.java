package com.iuri.mercadinho.model;

<<<<<<< HEAD
import com.iuri.mercadinho.dto.ItemVendaRequest;
import com.iuri.mercadinho.dto.VendaRequest;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
=======
import jakarta.persistence.*;
import lombok.Data;

>>>>>>> 8dd4299 (implementa Venda e VendaRepository)
import java.util.List;

@Entity
@Table(name = "venda")
<<<<<<< HEAD
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
=======
@Data
>>>>>>> 8dd4299 (implementa Venda e VendaRepository)
public class Venda {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
<<<<<<< HEAD
    @Column(name = "id")
    private Integer id;
    @Column(name = "data")
    private LocalDate data;
    @Column(name = "quantidade_venda")
    private Integer quantidadeVenda;
    @Column(name = "cliente")
    private String cliente;
    @OneToMany
    @JoinColumn(name = "vendas")
    private List<ItemVenda> itemVenda;

    public static Venda converterParaVenda(VendaRequest vendaRequest){
        return Venda.builder()
                .data(LocalDate.now())
                .quantidadeVenda(vendaRequest.getQuanntidadeVenda())
                .cliente(vendaRequest.getCliente())
                .build();
    }
=======
    private Integer id;
    private String cliente;
    @OneToMany
    private List<ItemPedido> itemPedido;
>>>>>>> 8dd4299 (implementa Venda e VendaRepository)
}
