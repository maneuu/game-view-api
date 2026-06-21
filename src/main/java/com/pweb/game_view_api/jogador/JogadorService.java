package com.pweb.game_view_api.jogador;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class JogadorService {

    private final JogadorRepository repository;

    public JogadorService(JogadorRepository repository) {
        this.repository = repository;
    }

    public List<Jogador> all() {
        return this.repository.findAll();
    }

    public Jogador get(Long id) {
        return this.repository.findById(id).orElse(null);
    }

    public Jogador create(Jogador entity) {
        return this.repository.save(entity);
    }

    public Jogador update(Jogador entity) {
        return this.repository.save(entity);
    }

    public void delete(Long id) {
        this.repository.deleteById(id);
    }

    public Jogador patch(Long id, Jogador entity) {

        Jogador jogador = this.repository.findById(id).orElse(null);

        if (jogador == null) {
            return null;
        }

        if (entity.getNomeUsuario() != null) {
            jogador.setNomeUsuario(entity.getNomeUsuario());
        }

        if (entity.getEmail() != null) {
            jogador.setEmail(entity.getEmail());
        }

        if (entity.getSenha() != null) {
            jogador.setSenha(entity.getSenha());
        }

        if (entity.getNivel() != null) {
            jogador.setNivel(entity.getNivel());
        }

        if (entity.getExperiencia() != null) {
            jogador.setExperiencia(entity.getExperiencia());
        }

        if (entity.getPontuacao() != null) {
            jogador.setPontuacao(entity.getPontuacao());
        }

        return this.repository.save(jogador);
    }
}