package com.nequi.prueba.controller;

import com.nequi.prueba.model.Franquisias;
import com.nequi.prueba.repository.FranchiseRepository;
import com.nequi.prueba.repository.SucursalesRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/franquisias")
@RequiredArgsConstructor
public class FranquisiasController {

    final FranchiseRepository franchiseRepository;

    @PostMapping
    public Mono<Franquisias> createFranquisia(@RequestBody Franquisias franquisias) {
        return franchiseRepository.save(franquisias);
    }

}
