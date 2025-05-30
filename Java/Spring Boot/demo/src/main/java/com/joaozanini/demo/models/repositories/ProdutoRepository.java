package com.joaozanini.demo.models.repositories;

import com.joaozanini.demo.models.entities.Produto;
import org.springframework.data.repository.CrudRepository;

public interface ProdutoRepository extends CrudRepository<Produto, Integer> { }
