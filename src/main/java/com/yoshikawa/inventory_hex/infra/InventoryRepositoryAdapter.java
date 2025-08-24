package com.yoshikawa.inventory_hex.infra;

import com.yoshikawa.inventory_hex.domain.model.TypeInventoryModel;
import com.yoshikawa.inventory_hex.domain.repository.InventoryRepository;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;


@Component
public class InventoryRepositoryAdapter implements InventoryRepository {
    private final SpringDataEstoqueRepository repository;


    public InventoryRepositoryAdapter(SpringDataEstoqueRepository repository) {
        this.repository = repository;
    }


    @Override
    public List<TypeInventoryModel> findAll() {
        return repository.findAll();
    }


    @Override
    public Optional<TypeInventoryModel> findById(Long id) {
        return repository.findById(id);
    }


    @Override
    public TypeInventoryModel save(TypeInventoryModel item) {
        return repository.save(item);
    }


    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }

}
