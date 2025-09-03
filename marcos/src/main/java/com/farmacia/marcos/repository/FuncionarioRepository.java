package com.farmacia.marcos.repository;

import com.farmacia.marcos.model.FuncionarioModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface FuncionarioRepository extends JpaRepository<FuncionarioModel,Integer> {

    Optional<FuncionarioModel> findByCdFuncionario(int cdFuncionario);
    Optional<FuncionarioModel> findAllByCdFuncionario(int cdFuncionario);

}
