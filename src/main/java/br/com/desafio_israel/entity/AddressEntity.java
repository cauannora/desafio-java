package br.com.desafio_israel.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Setter
@Getter
public class AddressEntity {
    private UUID id;
    private String name;
    private String sigla;

    public AddressEntity(String name, String sigla) {
        this.name = name;
        this.sigla = sigla;
    }

}
