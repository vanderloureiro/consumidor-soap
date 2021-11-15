package com.consumidorsoap.controller;

import com.consumidorsoap.bindings.ConsultaCEPResponse;
import com.consumidorsoap.client.CorreiosClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CorreiosController {


    public CorreiosController() {
    }

    @GetMapping("{cep}")
    public ConsultaCEPResponse buscarDetalhes(@PathVariable String cep) {
        // return this.correiosClient.buscarDetalhesCep(cep);
        return null;
    }

}
