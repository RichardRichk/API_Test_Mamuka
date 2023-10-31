package com.MamukaTest.MamukaTeste.Repositories;

import com.MamukaTest.MamukaTeste.models.UsuarioModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UsuarioRepository extends JpaRepository<UsuarioModel, UUID> {
}