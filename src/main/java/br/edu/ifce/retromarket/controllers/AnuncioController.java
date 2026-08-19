package br.edu.ifce.retromarket.controllers;

import br.edu.ifce.retromarket.dtos.AnuncioResponseDTO;
import br.edu.ifce.retromarket.entities.Anuncio;
import br.edu.ifce.retromarket.entities.Completude;
import br.edu.ifce.retromarket.services.AnuncioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/anuncios")
public class AnuncioController {

    @Autowired
    private AnuncioService service;

    @GetMapping("/completudes")
    public List<Completude> buscarCompletudes(){
        return service.buscarCompletudes();
    }

    @PostMapping("/completudes")
    @ResponseStatus(HttpStatus.CREATED)
    public Completude criarCompletude(@RequestBody Completude completude){
        return service.criarCompletude(completude);
    }

    @GetMapping
    public List<AnuncioResponseDTO> listarAnuncios(){
        return service.listarAnuncios();
    }
}
