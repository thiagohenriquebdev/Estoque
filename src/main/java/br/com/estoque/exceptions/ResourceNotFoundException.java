package br.com.estoque.exceptions;

public class ResourceNotFoundException extends RuntimeException{


    public ResourceNotFoundException(Long id) {
        super("Produto nao Encontrado" + id);
    }
}
