package ec.edu.espe.arquitectura.examen_roberto_freire_parcial_II.controller.dto.res;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
@Data
@Builder
public class EmpleadosPagoResDto {
    private String numeroCuenta;
    private BigDecimal valor;

}
