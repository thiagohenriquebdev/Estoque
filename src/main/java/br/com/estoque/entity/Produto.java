package br.com.estoque.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;


import java.time.Instant;

@Setter
@Getter
@Entity
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private double price;

    private Instant data;

    public Produto() {
    }

    public Produto(double price, Instant data, String nome, Long id) {
        this.price = price;
        this.data = data;
        this.nome = nome;
        this.id = id;
    }
}
