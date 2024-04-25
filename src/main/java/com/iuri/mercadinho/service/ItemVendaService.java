package com.iuri.mercadinho.service;

import com.iuri.mercadinho.dto.ItemVendaRequest;
import com.iuri.mercadinho.dto.ItemVendaResponse;
import com.iuri.mercadinho.model.ItemVenda;
import com.iuri.mercadinho.repository.ItemVendaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemVendaService {

    @Autowired
    private ItemVendaRepository itemVendaRepository;

    public ItemVendaResponse salvarVenda(ItemVendaRequest itemVendaRequest){
        ItemVenda itemVenda = new ItemVenda();
        itemVenda.setVenda(itemVendaRequest.getVenda());
        itemVenda.setProduto(itemVendaRequest.getProduto());
        itemVenda.setQuantidade(itemVendaRequest.getQuantidade());

        itemVenda = itemVendaRepository.save(itemVenda);

        return ItemVendaResponse.builder()
                .id(itemVenda.getId())
                .venda(itemVenda.getVenda())
                .produto(itemVenda.getProduto())
                .quantidade(itemVenda.getQuantidade())
                .build();
    }
}
