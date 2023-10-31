package com.MamukaTest.MamukaTeste.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "tb_projeto")
public class ProjetoModel extends UsuarioModel implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private UUID id;

    private String nome;
    private String status;
    private LocalDate dataInicio;
    private LocalDate dataConclusao;
    private UUID gestor;

    @OneToOne
    @JoinColumn(name = "id_gestor", referencedColumnName = "id_gestor")
    private UsuarioModel usuario;

}