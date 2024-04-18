package com.iuri.mercadinho.repository;

import com.iuri.mercadinho.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Integer> {
}
