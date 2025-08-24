package com.yoshikawa.inventory_hex.infra;

import com.yoshikawa.inventory_hex.domain.model.TypeInventoryModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpringDataEstoqueRepository extends JpaRepository<TypeInventoryModel, Long> {
}
