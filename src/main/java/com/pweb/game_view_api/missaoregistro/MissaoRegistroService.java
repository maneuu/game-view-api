package com.pweb.game_view_api.missaoregistro;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class MissaoRegistroService {

    private final MissaoRegistroRepository repository;

    public MissaoRegistroService(MissaoRegistroRepository repository) {
        this.repository = repository;
    }

    public List<MissaoRegistro> all() {
        return this.repository.findAll();
    }

    public List<MissaoRegistro> getByJogador(Long idJogador) {
        return this.repository.findByJogador_IdJogador(idJogador);
    }

    public List<MissaoRegistro> getByMissao(Long idMissao) {
        return this.repository.findByMissao_IdMissao(idMissao);
    }

    public MissaoRegistro get(Long id) {
        return this.repository.findById(id).orElse(null);
    }

    public MissaoRegistro create(MissaoRegistro entity) {
        return this.repository.save(entity);
    }

    public MissaoRegistro update(MissaoRegistro entity) {
        return this.repository.save(entity);
    }

    public void delete(Long id) {
        this.repository.deleteById(id);
    }

    public MissaoRegistro patch(Long id, MissaoRegistro entity) {

        MissaoRegistro missaoRegistro = this.repository.findById(id).orElse(null);

        if (missaoRegistro == null) {
            return null;
        }

        if (entity.getJogador() != null) {
            missaoRegistro.setJogador(entity.getJogador());
        }

        if (entity.getMissao() != null) {
            missaoRegistro.setMissao(entity.getMissao());
        }

        if (entity.getStatus() != null) {
            missaoRegistro.setStatus(entity.getStatus());
        }

        return this.repository.save(missaoRegistro);
    }
}
