package com.yoshikawa.inventory_hex.domain.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class TypeInventoryModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String nome;
    private int quantidade;
    private int reservado;


    // getters e setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }


    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }


    public int getQuantidade() { return quantidade; }
    public void setQuantidade(int quantidade) { this.quantidade = quantidade; }


    public int getReservado() { return reservado; }
    public void setReservado(int reservado) { this.reservado = reservado; }
}
