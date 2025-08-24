package com.yoshikawa.inventory_hex.application.service;


import com.yoshikawa.inventory_hex.domain.model.TypeInventoryModel;

import java.util.List;

public interface InventoryService {

    List<TypeInventoryModel> listarTodos();
    TypeInventoryModel buscarPorId(Long id);
    TypeInventoryModel criar(TypeInventoryModel item);
    TypeInventoryModel atualizar(Long id, TypeInventoryModel item);
    void deletar(Long id);
    TypeInventoryModel reservar(Long id, int quantidade);
}
