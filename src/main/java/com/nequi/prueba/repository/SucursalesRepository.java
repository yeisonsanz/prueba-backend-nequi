package com.nequi.prueba.repository;

import com.nequi.prueba.model.Franquisias;
import com.nequi.prueba.model.Sucursales;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Repository
public interface SucursalesRepository extends ReactiveCrudRepository<Sucursales, Long> {

    Flux<Sucursales> findBySucursalId(Long SucursalId);

}
