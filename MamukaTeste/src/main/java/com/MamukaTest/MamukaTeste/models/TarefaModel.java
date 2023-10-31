package com.MamukaTest.MamukaTeste.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Locale;
import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "tb_tarefa")
public class TarefaModel extends ProjetoModel implements Serializable {
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
    private UUID usuario;
    private UUID projeto;


    @ManyToOne
    @JoinColumn(name = "id_projeto", referencedColumnName = "id")
    private ProjetoModel projetos;

}