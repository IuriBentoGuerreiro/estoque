package com.iuri.mercadinho.controller;

import com.iuri.mercadinho.dto.VendaRequest;
import com.iuri.mercadinho.dto.VendaResponse;
import com.iuri.mercadinho.service.VendaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VendaController {

    @Autowired
    private VendaService vendaService;
}
