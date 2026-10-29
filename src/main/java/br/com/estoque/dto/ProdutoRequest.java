package br.com.estoque.dto;

public record ProdutoRequest(
        String nome,
        double price
) {}
