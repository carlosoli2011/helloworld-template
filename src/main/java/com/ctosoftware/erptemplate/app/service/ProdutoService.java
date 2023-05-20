package com.ctosoftware.erptemplate.app.service;

import com.ctosoftware.erptemplate.app.domain.Produto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class ProdutoService {

    private final Logger logger = LoggerFactory.getLogger(ProdutoService.class);

    public Produto getAllProducts() {
        logger.info("[SERVICE] - Realizando busca de todos os produtos.");
        Produto p = new Produto();
        p.setId(1L);
        p.setName("Teste");
        return p;
    }
}
