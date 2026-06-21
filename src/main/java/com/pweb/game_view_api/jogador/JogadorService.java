package com.pweb.game_view_api.jogador;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class JogadorService {

    private final JogadorRepository repository;

    public List<Jogador> listar() {
        return repository.findAll();
    }

    public Jogador salvar(Jogador jogador) {
        return repository.save(jogador);
    }
}