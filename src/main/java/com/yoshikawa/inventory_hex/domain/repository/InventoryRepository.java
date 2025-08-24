package com.yoshikawa.inventory_hex.domain.repository;


import com.yoshikawa.inventory_hex.domain.model.TypeInventoryModel;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

@Repository
public interface InventoryRepository {
    List<TypeInventoryModel> findAll();
    Optional<TypeInventoryModel> findById(Long id);
    TypeInventoryModel save(TypeInventoryModel item);
    void deleteById(Long id);
}
