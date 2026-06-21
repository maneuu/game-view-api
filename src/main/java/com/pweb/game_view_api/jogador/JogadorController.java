package com.pweb.game_view_api.jogador;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/jogadores")
@RequiredArgsConstructor
public class JogadorController {

    private final JogadorService service;

    @GetMapping
    public List<Jogador> listar() {
        return service.listar();
    }

    @PostMapping
    public Jogador salvar(@RequestBody Jogador jogador) {
        return service.salvar(jogador);
    }
}