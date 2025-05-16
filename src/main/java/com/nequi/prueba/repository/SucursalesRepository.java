package com.nequi.prueba.repository;

import com.nequi.prueba.model.Sucursales;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface SucursalesRepository extends ReactiveCrudRepository<Sucursales, Long> {
}
