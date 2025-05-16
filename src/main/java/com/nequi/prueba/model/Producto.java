package com.nequi.prueba.model;

import lombok.Data;
import org.springframework.data.relational.core.mapping.Table;

@Data
@Table("productos")
public class Producto {
    private Long id;
    private String nombre;
    private Long sucursalId;
}
