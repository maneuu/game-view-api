package com.pweb.game_view_api.classe;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ClasseService {

    private final ClasseRepository repository;

    public ClasseService(ClasseRepository repository) {
        this.repository = repository;
    }

    public List<Classe> all() {
        return this.repository.findAll();
    }

    public Classe get(Long id) {
        return this.repository.findById(id).orElse(null);
    }

    public Classe create(Classe entity) {
        return this.repository.save(entity);
    }

    public Classe update(Classe entity) {
        return this.repository.save(entity);
    }

    public void delete(Long id) {
        this.repository.deleteById(id);
    }

    public Classe patch(Long id, Classe entity) {

        Classe classe = this.repository.findById(id).orElse(null);

        if (classe == null) {
            return null;
        }

        if (entity.getNomeClasse() != null) {
            classe.setNomeClasse(entity.getNomeClasse());
        }

        if (entity.getTipo() != null) {
            classe.setTipo(entity.getTipo());
        }

        return this.repository.save(classe);
    }
}
