package com.MamukaTest.MamukaTeste.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.sql.Date;
import java.time.LocalDate;
import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "tb_usuario")
public class UsuarioModel extends TipoUsuarioModel implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private UUID id;

    private String nome;
    private String cpf;
    private LocalDate dataNascimento;
    private Boolean statusAtividade;
    private String departamento;
    private  UUID responsavel;
    private String perfil;
    private String cargo;
    private String email;
    private UUID id_tipoUsuario;

    @ManyToOne
    @JoinColumn(name = "id_tipoUsuario", referencedColumnName = "id_tipoUsuario")
    private TipoUsuarioModel tipoUsuario;

}