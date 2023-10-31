package com.MamukaTest.MamukaTeste.Repositories;

import com.MamukaTest.MamukaTeste.models.TarefaModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface TarefaRepository extends JpaRepository<TarefaModel, UUID> {
}