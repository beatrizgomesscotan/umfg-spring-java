package br.edu.umfg.prod.tres.api.demo.entities;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;

public class Cliente {
    private UUID id;
    private String nome;
    private String sobrenome;
    private String documento;

    @JsonCreator
    public Cliente(@JsonProperty("nome") String nome,
                   @JsonProperty("sobrenome") String sobrenome,
                   @JsonProperty("documento")String documento) {
        this.id = UUID.randomUUID(); // AQUI ESTÁ GERANDO UM ID AUTOMATICAMENTE
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.documento = documento;
    }

    public UUID getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public String getDocumento() {
        return documento;
    }
}
