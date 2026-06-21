package com.pweb.game_view_api.jogador;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "jogador")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Jogador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_jogador")
    private Long idJogador;

    @Column(name = "nome_usuario", nullable = false)
    private String nomeUsuario;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String senha;

    private Integer nivel;

    private Integer experiencia;

    private Integer pontuacao;
}