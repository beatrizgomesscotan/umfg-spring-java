package br.edu.umfg.prod.tres.api.demo.controllers;

import br.edu.umfg.prod.tres.api.demo.entities.Cliente;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/cliente")

public class ClienteController {
    private ArrayList<Cliente> lista = new ArrayList<Cliente>();

    // aqui pega os dados do cliente @RequestBody
    // Cliente cliente ele indica que  é um Cliente e cria um objeto
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Cliente> post(@RequestBody Cliente cliente){
        this.lista.add(cliente);
        return ResponseEntity.ok(cliente);
    }


}
