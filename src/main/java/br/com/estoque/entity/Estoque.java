package br.com.estoque.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@Entity
public class Estoque {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private List<Produto> produto = new ArrayList<>();

    public Estoque () {
    }

    public Estoque(Long id, String nome, List<Produto> produto) {
        this.id = id;
        this.nome = nome;
        this.produto = produto;
    }
}
