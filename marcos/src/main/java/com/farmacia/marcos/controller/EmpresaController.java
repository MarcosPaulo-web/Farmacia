package com.farmacia.marcos.controller;


import com.farmacia.marcos.dto.EmpresaDto;
import com.farmacia.marcos.model.ClienteModel;
import com.farmacia.marcos.model.EmpresaModel;
import com.farmacia.marcos.repository.EmpresaRespository;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/v1/Empresas")
public class EmpresaController {

    @Autowired
    EmpresaRespository empresaRespository;

    @PostMapping
    public ResponseEntity<EmpresaModel> salvar(@RequestBody @Valid EmpresaDto empresaDto) {
        var empresaModel = new EmpresaModel();
        BeanUtils.copyProperties(empresaDto, empresaModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(empresaRespository.save(empresaModel));

    }

    @GetMapping
    public ResponseEntity<List<EmpresaModel>> List (){
        return ResponseEntity.status(HttpStatus.OK).body(empresaRespository.findAll());
    }


    @GetMapping("/{cdEmpresa}")
    public ResponseEntity<Object> getEmpresaByCd(@PathVariable("cdEmpresa") Integer cdEmpresa){
        Optional<EmpresaModel> empresa0 = empresaRespository.findByCdEmpresa(cdEmpresa);

        if (empresa0.isEmpty()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Empresa não encontrada");
        }
        return ResponseEntity.status(HttpStatus.OK).body(empresa0.get());

    }
}
