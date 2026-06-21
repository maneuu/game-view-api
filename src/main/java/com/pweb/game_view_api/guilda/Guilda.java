package com.pweb.game_view_api.guilda;

import com.pweb.game_view_api.jogador.Jogador;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "guilda")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Guilda {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_guilda")
    private Long idGuilda;

    @Column(name = "nome_guilda", nullable = false)
    private String nomeGuilda;

    @ManyToOne
    @JoinColumn(name = "fk_id_jogador", nullable = false)
    private Jogador jogador;
}