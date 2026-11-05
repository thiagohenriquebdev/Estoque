package br.com.estoque.resources;

import br.com.estoque.entity.Produto;
import br.com.estoque.service.ProdutoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping (value = "/produto")
public class ProdutoResource {


    private final ProdutoService service;

    public ProdutoResource(ProdutoService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<Produto>> findByAll() {
        List<Produto> list = service.findAll();
        return ResponseEntity.ok().body(list);

    }

    @GetMapping (value = "/{id}")
    public ResponseEntity<Produto> findById(@PathVariable Long id) {
        Produto obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }

    @PostMapping
    public ResponseEntity<Produto>insert(@RequestBody Produto obj) {
        obj=service.insert(obj);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/id").buildAndExpand(obj.getId()).toUri();

        return ResponseEntity.created(uri).body(obj);
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<Produto> update(@PathVariable Long id , @RequestBody Produto obj) {
        obj = service.update(id,obj);
        return  ResponseEntity.ok(obj);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Produto>delete (@PathVariable Long id) {
        service.remove(id);

        return ResponseEntity.noContent().build();
    }

}
