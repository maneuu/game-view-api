package com.pweb.game_view_api.monstro;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class MonstroService {

    private final MonstroRepository repository;

    public MonstroService(MonstroRepository repository) {
        this.repository = repository;
    }

    public List<Monstro> all() {
        return this.repository.findAll();
    }

    public Monstro get(Long id) {
        return this.repository.findById(id).orElse(null);
    }

    public Monstro create(Monstro entity) {
        return this.repository.save(entity);
    }

    public Monstro update(Monstro entity) {
        return this.repository.save(entity);
    }

    public void delete(Long id) {
        this.repository.deleteById(id);
    }

    public Monstro patch(Long id, Monstro entity) {

        Monstro monstro = this.repository.findById(id).orElse(null);

        if (monstro == null) {
            return null;
        }

        if (entity.getNomeMonstro() != null) {
            monstro.setNomeMonstro(entity.getNomeMonstro());
        }

        if (entity.getTipo() != null) {
            monstro.setTipo(entity.getTipo());
        }

        return this.repository.save(monstro);
    }
}
