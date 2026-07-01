package com.pweb.game_view_api.jogador;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface JogadorRepository extends JpaRepository<Jogador, Long> {

	List<Jogador> findTop10ByOrderByPontuacaoDesc();

	List<Jogador> findByNomeUsuario(String nomeUsuario);
}