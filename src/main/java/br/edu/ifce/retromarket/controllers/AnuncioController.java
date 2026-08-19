package br.edu.ifce.retromarket.controllers;

import br.edu.ifce.retromarket.entities.Completude;
import br.edu.ifce.retromarket.repositories.CompletudeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/anuncios")
public class AnuncioController {

    @Autowired
    private CompletudeRepository completudeRepository;

    @GetMapping("/completudes")
    public List<Completude> buscarCompletudes(){
        return completudeRepository.findAll();
    }

    @PostMapping("/completudes")
    @ResponseStatus(HttpStatus.CREATED)
    public Completude criarCompletude(@RequestBody Completude completude){
        return completudeRepository.save(completude);
    }
}
