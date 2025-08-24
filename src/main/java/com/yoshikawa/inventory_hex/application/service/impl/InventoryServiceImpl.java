package com.yoshikawa.inventory_hex.application.service.impl;

import com.yoshikawa.inventory_hex.application.service.InventoryService;
import com.yoshikawa.inventory_hex.domain.model.TypeInventoryModel;
import com.yoshikawa.inventory_hex.domain.repository.InventoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class InventoryServiceImpl implements InventoryService {
    private final InventoryRepository repository;


    public InventoryServiceImpl(InventoryRepository repository) {
        this.repository = repository;
    }


    @Override
    public List<TypeInventoryModel> listarTodos() {
        return repository.findAll();
    }


    @Override
    public TypeInventoryModel buscarPorId(Long id) {
        return repository.findById(id).orElseThrow(() -> new RuntimeException("Item não encontrado"));
    }


    @Override
    public TypeInventoryModel criar(TypeInventoryModel item) {
        return repository.save(item);
    }


    @Override
    public TypeInventoryModel atualizar(Long id, TypeInventoryModel item) {
        TypeInventoryModel existente = buscarPorId(id);
        existente.setNome(item.getNome());
        existente.setQuantidade(item.getQuantidade());
        return repository.save(existente);
    }


    @Override
    public void deletar(Long id) {
        repository.deleteById(id);
    }


    @Override
    public TypeInventoryModel reservar(Long id, int quantidade) {
        TypeInventoryModel item = buscarPorId(id);
        if (item.getQuantidade() - item.getReservado() < quantidade) {
            throw new RuntimeException("Quantidade insuficiente em estoque");
        }
        item.setReservado(item.getReservado() + quantidade);
        return repository.save(item);
    }
}
