package br.com.estoque.service;

import br.com.estoque.entity.Produto;
import br.com.estoque.exceptions.GlobalExceptionHandler;
import br.com.estoque.exceptions.ResourceNotFoundException;
import br.com.estoque.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository repository;


    public List<Produto> findAll() {
        return repository.findAll();
    }

    public Produto findById(Long id) {
         return repository.findById(id).orElseThrow(() -> new ResourceNotFoundException(id));
    }

    public Produto Insert(Produto insert) {
       return repository.save(insert);
    }

    public void remove(Long id) {
        repository.deleteById(id);
    }

    public Produto update(Long id ,Produto entity) {
        Produto obj = repository.findById(id).orElseThrow(() -> new ResourceNotFoundException(id));

        obj.setNome(entity.getNome());
        obj.setData(entity.getData());
        obj.setPrice(entity.getPrice());
        return repository.save(obj);

    }


}
