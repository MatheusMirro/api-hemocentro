package com.hemocentro.Hemocentro.controller;

import com.hemocentro.Hemocentro.entity.TipodeSangueEntity;
import com.hemocentro.Hemocentro.repository.TipodeSangueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/tiposanguineos")
public class TipodeSangueController {
    @Autowired
    private TipodeSangueRepository tipodeSangueRepository;

    @GetMapping
    public List<TipodeSangueEntity> listall(){
        return tipodeSangueRepository.findAll();
    }
    @GetMapping(path = "/{tipo}")
    public List<TipodeSangueEntity> listTipo(@PathVariable("tipo") String tipo){
        return tipodeSangueRepository.findByTipo(tipo);
    }


}
