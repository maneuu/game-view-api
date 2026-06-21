package com.pweb.game_view_api.aliado;

import com.pweb.game_view_api.jogador.Jogador;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "aliado")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Aliado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "fk_id_jogador", nullable = false)
    private Jogador jogador;

    @ManyToOne
    @JoinColumn(name = "fk_id_jogador_aliado", nullable = false)
    private Jogador aliado;
}