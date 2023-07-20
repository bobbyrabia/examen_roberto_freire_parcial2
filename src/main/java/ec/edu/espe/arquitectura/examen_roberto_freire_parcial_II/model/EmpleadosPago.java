package ec.edu.espe.arquitectura.examen_roberto_freire_parcial_II.model;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
public class EmpleadosPago {
    private String numeroCuenta;
    private BigDecimal valor;
    private String estado;
}
