package com.pweb.game_view_api.batalharegistro;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BatalhaRegistroRepository extends JpaRepository<BatalhaRegistro, Long> {

	List<BatalhaRegistro> findByJogador_IdJogador(Long idJogador);

	List<BatalhaRegistro> findByMonstro_IdMonstro(Long idMonstro);
}
