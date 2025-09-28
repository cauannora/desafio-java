package br.com.desafio_israel.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/address")
public class AddressController {

    

    @GetMapping
    public String getAddress() {
        return "Hello World";
    }
}
