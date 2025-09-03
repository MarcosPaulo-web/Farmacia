package com.farmacia.marcos.repository;

import com.farmacia.marcos.model.CargoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CargoRepository extends JpaRepository<CargoModel,Integer> {

    Optional<CargoModel> findByCdCargo(int cdCargo);
    Optional<CargoModel> findAllByCdCargo(int cdCargo);
    //List<CargoModel> findAllCargo(); ???????
}
