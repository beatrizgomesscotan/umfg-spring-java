package br.edu.umfg.prod.tres.api.demo.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController  //Aqui ele identfica que minha classe vai ser controladora
@RequestMapping("/healtchcheck")
public class HealthCheck {
    @GetMapping
    public ResponseEntity<String> get(){
        return ResponseEntity.ok("hello world!!");
    }

}
