package com.pweb.game_view_api.batalharegistro;

import com.pweb.game_view_api.jogador.Jogador;
import com.pweb.game_view_api.monstro.Monstro;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "batalha_registro")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BatalhaRegistro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_batalha")
    private Long idBatalha;

    @ManyToOne
    @JoinColumn(name = "fk_id_jogador", nullable = false)
    private Jogador jogador;

    @ManyToOne
    @JoinColumn(name = "fk_id_monstro", nullable = false)
    private Monstro monstro;

    @Column(name = "resultado_batalha", nullable = false)
    private String resultadoBatalha;
}