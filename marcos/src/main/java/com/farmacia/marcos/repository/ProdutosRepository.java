package com.farmacia.marcos.repository;

import com.farmacia.marcos.model.ProdutosModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.swing.text.html.Option;
import java.util.Optional;

@Repository
public interface ProdutosRepository extends JpaRepository<ProdutosModel,Integer> {

    Optional<ProdutosModel> findByCdProduto(int cdProduto);
    Optional<ProdutosModel> findAllByCdProduto(int cdProduto);

}
