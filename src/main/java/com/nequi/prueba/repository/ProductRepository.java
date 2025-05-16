package com.nequi.prueba.repository;

import com.nequi.prueba.model.Producto;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

@Repository
public interface ProductRepository extends ReactiveCrudRepository<Producto, Long> {

    Flux<Producto> findAllBySucursalId(Long id);
}
