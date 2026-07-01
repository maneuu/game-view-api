package com.pweb.game_view_api.guilda;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class GuildaService {

    private final GuildaRepository repository;

    public GuildaService(GuildaRepository repository) {
        this.repository = repository;
    }

    public List<Guilda> all() {
        return this.repository.findAll();
    }

    public List<Guilda> getByIdJogador(Long idJogador) {
        return this.repository.findByJogador_IdJogador(idJogador);
    }

    public Guilda get(Long id) {
        return this.repository.findById(id).orElse(null);
    }

    public Guilda create(Guilda entity) {
        return this.repository.save(entity);
    }

    public Guilda update(Guilda entity) {
        return this.repository.save(entity);
    }

    public void delete(Long id) {
        this.repository.deleteById(id);
    }

    public Guilda patch(Long id, Guilda entity) {

        Guilda guilda = this.repository.findById(id).orElse(null);

        if (guilda == null) {
            return null;
        }

        if (entity.getNomeGuilda() != null) {
            guilda.setNomeGuilda(entity.getNomeGuilda());
        }

        if (entity.getJogador() != null) {
            guilda.setJogador(entity.getJogador());
        }

        return this.repository.save(guilda);
    }
}
