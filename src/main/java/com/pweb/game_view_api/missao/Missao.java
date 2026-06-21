package com.pweb.game_view_api.Missao;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "missao")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Missao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_missao")
    private Long idMissao;

    @Column(name = "nome_missao", nullable = false)
    private String nomeMissao;

    @Column(name = "dificuldade", nullable = false)
    private String dificuldade;
}