package com.MamukaTest.MamukaTeste.Repositories;

import com.MamukaTest.MamukaTeste.models.ProjetoModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;


public interface ProjetoRepository extends JpaRepository<ProjetoModel, UUID> {
}
