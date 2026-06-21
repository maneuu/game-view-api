package com.pweb.game_view_api.monstro;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "monstro")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Monstro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_monstro")
    private Long idMonstro;

    @Column(name = "nome_monstro", nullable = false)
    private String nomeMonstro;

    @Column(name = "tipo", nullable = false)
    private String tipo;
}