package br.com.estoque.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.util.ArrayList;
import java.util.List;
import jakarta.persistence.OneToMany;

@Setter
@Getter
@Entity
public class Estoque {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @OneToMany
    private List<Produto> produto = new ArrayList<>();

    public Estoque () {
    }

    public Estoque(Long id, String nome, List<Produto> produto) {
        this.id = id;
        this.nome = nome;
        this.produto = produto;
    }
}
