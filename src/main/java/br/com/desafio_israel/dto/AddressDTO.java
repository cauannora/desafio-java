package br.com.desafio_israel.dto;

import br.com.desafio_israel.entity.CityEntity;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class AddressDTO {
    private String name;
    private String sigla;
    private List<CityEntity> cityList;

    public AddressDTO(String name, String sigla, List<CityEntity> cityList) {
        this.name = name;
        this.sigla = sigla;
        this.cityList = cityList;
    }
}
