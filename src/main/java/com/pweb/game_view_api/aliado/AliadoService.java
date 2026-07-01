package com.pweb.game_view_api.aliado;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class AliadoService {

    private final AliadoRepository repository;

    public AliadoService(AliadoRepository repository) {
        this.repository = repository;
    }

    public List<Aliado> all() {
        return this.repository.findAll();
    }

    public Aliado get(Long id) {
        return this.repository.findById(id).orElse(null);
    }

    public Aliado create(Aliado entity) {
        return this.repository.save(entity);
    }

    public Aliado update(Aliado entity) {
        return this.repository.save(entity);
    }

    public void delete(Long id) {
        this.repository.deleteById(id);
    }

    public Aliado patch(Long id, Aliado entity) {

        Aliado aliado = this.repository.findById(id).orElse(null);

        if (aliado == null) {
            return null;
        }

        if (entity.getJogador() != null) {
            aliado.setJogador(entity.getJogador());
        }

        if (entity.getAliado() != null) {
            aliado.setAliado(entity.getAliado());
        }

        return this.repository.save(aliado);
    }
}
