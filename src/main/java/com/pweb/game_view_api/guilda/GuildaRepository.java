package com.pweb.game_view_api.guilda;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface GuildaRepository extends JpaRepository<Guilda, Long> {

	List<Guilda> findByJogador_IdJogador(Long idJogador);
}
