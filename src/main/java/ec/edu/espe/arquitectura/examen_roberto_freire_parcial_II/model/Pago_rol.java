package ec.edu.espe.arquitectura.examen_roberto_freire_parcial_II.model;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.util.List;

@Data
@Builder
@Document(collection = "pago_roles")
public class Pago_rol {
    @Id
    private String id;
    private Integer mes;
    private Empresa ruc_empresa;
    private String cuenta_principal;
    private BigDecimal valor_total;
    private BigDecimal valor_real;
    private List<Empleados_pago> empleados_pagos;

}
