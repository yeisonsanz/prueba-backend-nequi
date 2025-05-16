package com.nequi.prueba.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Data
@Table("Sucursales")
public class Sucursales {
    @Id
    private Long id;
    private String name;
    private Long franchiseId;
}
