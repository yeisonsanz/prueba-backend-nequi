package com.nequi.prueba.service;

import com.nequi.prueba.model.Franquisias;
import com.nequi.prueba.repository.FranchiseRepository;
import com.nequi.prueba.repository.ProductRepository;
import com.nequi.prueba.repository.SucursalesRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class FranquisiaService {

    private final FranchiseRepository franchiseRepository;
    private final ProductRepository productRepository;
    private final SucursalesRepository sucursalesRepository;

    public Mono<Franquisias> createFranchise(Franquisias franquisias) {
        return franchiseRepository.save(franquisias);
    }


}
