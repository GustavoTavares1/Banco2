package com.bancoacesso.repostiory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bancoacesso.models.Produtos;

public interface ProdutosRepository extends JpaRepository<Produtos,Integer> {

}
