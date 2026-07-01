package com.pweb.game_view_api.personagem;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonagemRepository extends JpaRepository<Personagem, Long> {

	List<Personagem> findByJogador_IdJogador(Long idJogador);
}
