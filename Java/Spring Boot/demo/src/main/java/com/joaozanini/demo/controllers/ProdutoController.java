package com.joaozanini.demo.controllers;

import com.joaozanini.demo.models.entities.Produto;
import com.joaozanini.demo.models.repositories.ProdutoRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(path = "/api/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoRepository produtoRepository;

    @RequestMapping(method ={RequestMethod.POST, RequestMethod.PUT})
    public @ResponseBody Produto novoProduto(@RequestBody @Valid Produto produto) {
        return produtoRepository.save(produto);
    }

    @GetMapping
    public Iterable<Produto> obterProdutos() {
        return produtoRepository.findAll();
    }

    @GetMapping(path = "/{id}")
    public Optional<Produto> obterProdutosPorId(@PathVariable int id) {
        return produtoRepository.findById(id);
    }
    

//    @PutMapping
//    public Produto alterarProduto(@Valid Produto produto) {
//        return produtoRepository.save(produto);
//    }

    @DeleteMapping(path = "/{id}")
    public void excluirProduto(@PathVariable int id) {
        produtoRepository.deleteById(id);
    }
}
