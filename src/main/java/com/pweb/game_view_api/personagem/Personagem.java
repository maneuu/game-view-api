package com.pweb.game_view_api.personagem;

import com.pweb.game_view_api.classe.Classe;
import com.pweb.game_view_api.jogador.Jogador;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "personagem")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Personagem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_personagem")
    private Long idPersonagem;

    @Column(name = "nome_personagem", nullable = false)
    private String nomePersonagem;

    @ManyToOne
    @JoinColumn(name = "fk_id_jogador", nullable = false)
    private Jogador jogador;

    @ManyToOne
    @JoinColumn(name = "fk_id_classe", nullable = false)
    private Classe classe;

    @Column(name = "descricao")
    private String descricao;

    @Column(name = "arma_principal")
    private String armaPrincipal;

    @Column(name = "habilidades")
    private String habilidades;

    @Column(name = "raca")
    private String raca;
}