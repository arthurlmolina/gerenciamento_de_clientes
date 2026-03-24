package com.example.gerenciamento_de_clientes.repositories;

import com.example.gerenciamento_de_clientes.models.ClienteModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<ClienteModel, Long> {
}
