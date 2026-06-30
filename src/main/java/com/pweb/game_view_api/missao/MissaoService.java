package com.pweb.game_view_api.missao;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class MissaoService {

    private final MissaoRepository repository;

    public MissaoService(MissaoRepository repository) {
        this.repository = repository;
    }

    public List<Missao> all() {
        return this.repository.findAll();
    }

    public Missao get(Long id) {
        return this.repository.findById(id).orElse(null);
    }

    public Missao create(Missao entity) {
        return this.repository.save(entity);
    }

    public Missao update(Missao entity) {
        return this.repository.save(entity);
    }

    public void delete(Long id) {
        this.repository.deleteById(id);
    }

    public Missao patch(Long id, Missao entity) {

        Missao missao = this.repository.findById(id).orElse(null);

        if (missao == null) {
            return null;
        }

        if (entity.getNomeMissao() != null) {
            missao.setNomeMissao(entity.getNomeMissao());
        }

        if (entity.getDificuldade() != null) {
            missao.setDificuldade(entity.getDificuldade());
        }

        return this.repository.save(missao);
    }
}
