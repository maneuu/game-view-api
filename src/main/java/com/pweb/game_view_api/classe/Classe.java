package com.pweb.game_view_api.classe;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "classe")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Classe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_classe")
    private Long idClasse;

    @Column(name = "nome_classe", nullable = false)
    private String nomeClasse;

    @Column(name = "tipo", nullable = false)
    private String tipo;
}