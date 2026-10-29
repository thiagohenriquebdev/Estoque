package br.com.estoque.dto;

import java.time.Instant;

public record ProdutoResponse(
        Long id,
        String nome,
        double price,
        Instant data
) {}
