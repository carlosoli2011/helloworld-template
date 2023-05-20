package com.ctosoftware.erptemplate.app.controller;

import com.ctosoftware.erptemplate.app.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/health", method = RequestMethod.GET,
        produces = MediaType.APPLICATION_JSON_VALUE )
public class HealthController {

    @Autowired
    ProdutoService produtoService;

    @GetMapping
    public String getStatusApi() {
        return "API is running! Produto teste: " + produtoService.getAllProducts();
    }
}
