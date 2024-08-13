package com.iuri.mercadinho.service;

import com.iuri.mercadinho.dto.VendaRequest;
import com.iuri.mercadinho.dto.VendaResponse;
import com.iuri.mercadinho.model.Venda;
import com.iuri.mercadinho.repository.VendaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VendaService {

    @Autowired
    private VendaRepository vendaRepository;

}
