package com.MamukaTest.MamukaTeste.dtos;

import com.MamukaTest.MamukaTeste.models.TipoModel;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

import java.util.Date;

public record UsuarioDto(
        TipoModel tipo_usuario,
        @NotBlank String nome,
        @NotBlank String cpf,
        Date data_nascimento,
        Boolean status_atividade,
        String departamento,
        String responsavel,
        String perfil,
        String cargo,
        @NotBlank @Email(message = " O email deve estar em um formato valido ") String email,

        @NotBlank String senha

){
}
