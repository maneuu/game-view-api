package com.pweb.game_view_api.personagem;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class PersonagemService {

    private final PersonagemRepository repository;

    public PersonagemService(PersonagemRepository repository) {
        this.repository = repository;
    }

    public List<Personagem> all() {
        return this.repository.findAll();
    }

    public List<Personagem> getByIdJogador(Long idJogador) {
        return this.repository.findByJogador_IdJogador(idJogador);
    }

    public Personagem get(Long id) {
        return this.repository.findById(id).orElse(null);
    }

    public Personagem create(Personagem entity) {
        return this.repository.save(entity);
    }

    public Personagem update(Personagem entity) {
        return this.repository.save(entity);
    }

    public void delete(Long id) {
        this.repository.deleteById(id);
    }

    public Personagem patch(Long id, Personagem entity) {

        Personagem personagem = this.repository.findById(id).orElse(null);

        if (personagem == null) {
            return null;
        }

        if (entity.getNomePersonagem() != null) {
            personagem.setNomePersonagem(entity.getNomePersonagem());
        }

        if (entity.getJogador() != null) {
            personagem.setJogador(entity.getJogador());
        }

        if (entity.getClasse() != null) {
            personagem.setClasse(entity.getClasse());
        }

        if (entity.getDescricao() != null) {
            personagem.setDescricao(entity.getDescricao());
        }

        if (entity.getArmaPrincipal() != null) {
            personagem.setArmaPrincipal(entity.getArmaPrincipal());
        }

        if (entity.getHabilidades() != null) {
            personagem.setHabilidades(entity.getHabilidades());
        }

        if (entity.getRaca() != null) {
            personagem.setRaca(entity.getRaca());
        }

        return this.repository.save(personagem);
    }
}
