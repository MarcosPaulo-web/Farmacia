package com.farmacia.marcos.repository;

import com.farmacia.marcos.model.EmpresaModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EmpresaRespository extends JpaRepository<EmpresaModel,Integer> {

    Optional<EmpresaModel> findByCdEmpresa(int cdEmpresa);
    Optional<EmpresaModel> findAllByCdEmpresa(int cdEmpresa);

}
