package com.MamukaTest.MamukaTeste.Repositories;

import com.MamukaTest.MamukaTeste.models.TipoUsuarioModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface TipoUsuarioRepository extends JpaRepository<TipoUsuarioModel, UUID> {
}