package com.pweb.game_view_api.missaoregistro;

import com.pweb.game_view_api.jogador.Jogador;
import com.pweb.game_view_api.missao.Missao;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "missao_registro")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MissaoRegistro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_missao_registro")
    private Long idMissaoRegistro;

    @ManyToOne
    @JoinColumn(name = "fk_id_jogador", nullable = false)
    private Jogador jogador;

    @ManyToOne
    @JoinColumn(name = "fk_id_missao", nullable = false)
    private Missao missao;

    @Column(name = "status", nullable = false)
    private String status;
}