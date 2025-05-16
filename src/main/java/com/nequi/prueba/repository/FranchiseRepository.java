package com.nequi.prueba.repository;

import com.nequi.prueba.model.Franquisias;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface FranchiseRepository extends ReactiveCrudRepository<Franquisias, Long> {

}
