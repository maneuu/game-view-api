package com.pweb.game_view_api.missaoregistro;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MissaoRegistroRepository extends JpaRepository<MissaoRegistro, Long> {

	List<MissaoRegistro> findByJogador_IdJogador(Long idJogador);

	List<MissaoRegistro> findByMissao_IdMissao(Long idMissao);
}
