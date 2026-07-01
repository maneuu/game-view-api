package com.pweb.game_view_api.batalharegistro;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class BatalhaRegistroService {

    private final BatalhaRegistroRepository repository;

    public BatalhaRegistroService(BatalhaRegistroRepository repository) {
        this.repository = repository;
    }

    public List<BatalhaRegistro> all() {
        return this.repository.findAll();
    }

    public List<BatalhaRegistro> getByJogador(Long idJogador) {
        return this.repository.findByJogador_IdJogador(idJogador);
    }

    public List<BatalhaRegistro> getByMonstro(Long idMonstro) {
        return this.repository.findByMonstro_IdMonstro(idMonstro);
    }

    public BatalhaRegistro get(Long id) {
        return this.repository.findById(id).orElse(null);
    }

    public BatalhaRegistro create(BatalhaRegistro entity) {
        return this.repository.save(entity);
    }

    public BatalhaRegistro update(BatalhaRegistro entity) {
        return this.repository.save(entity);
    }

    public void delete(Long id) {
        this.repository.deleteById(id);
    }

    public BatalhaRegistro patch(Long id, BatalhaRegistro entity) {

        BatalhaRegistro batalhaRegistro = this.repository.findById(id).orElse(null);

        if (batalhaRegistro == null) {
            return null;
        }

        if (entity.getJogador() != null) {
            batalhaRegistro.setJogador(entity.getJogador());
        }

        if (entity.getMonstro() != null) {
            batalhaRegistro.setMonstro(entity.getMonstro());
        }

        if (entity.getResultadoBatalha() != null) {
            batalhaRegistro.setResultadoBatalha(entity.getResultadoBatalha());
        }

        return this.repository.save(batalhaRegistro);
    }
}
