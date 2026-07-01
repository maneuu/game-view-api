package com.pweb.game_view_api.aliado;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AliadoRepository extends JpaRepository<Aliado, Long> {

	List<Aliado> findByJogador_IdJogador(Long idJogador);
}
