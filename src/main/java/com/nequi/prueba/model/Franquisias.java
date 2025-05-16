package com.nequi.prueba.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Data
@Table("franquisias")
public class Franquisias {
    @Id
    private Long id;
    private String nombre;
}
