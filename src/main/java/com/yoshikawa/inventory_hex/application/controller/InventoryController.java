package com.yoshikawa.inventory_hex.application.controller;

import com.yoshikawa.inventory_hex.application.service.InventoryService;

import com.yoshikawa.inventory_hex.domain.model.TypeInventoryModel;
import org.springframework.web.bind.annotation.*;


import java.util.List;


@RestController
@RequestMapping("/api/estoque")
public class InventoryController {

    private final InventoryService service;


    public InventoryController(InventoryService service) {
        this.service = service;
    }


    @GetMapping
    public List<TypeInventoryModel> listarTodos() {
        return service.listarTodos();
    }


    @GetMapping("/{id}")
    public TypeInventoryModel buscarPorId(@PathVariable Long id) {
        return service.buscarPorId(id);
    }


    @PostMapping
    public TypeInventoryModel criar(@RequestBody TypeInventoryModel item) {
        return service.criar(item);
    }


    @PutMapping("/{id}")
    public TypeInventoryModel atualizar(@PathVariable Long id, @RequestBody TypeInventoryModel item) {
        return service.atualizar(id, item);
    }


    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
    }


    @PostMapping("/{id}/reservar")
    public TypeInventoryModel reservar(@PathVariable Long id, @RequestParam int quantidade) {
        return service.reservar(id, quantidade);
    }
}
