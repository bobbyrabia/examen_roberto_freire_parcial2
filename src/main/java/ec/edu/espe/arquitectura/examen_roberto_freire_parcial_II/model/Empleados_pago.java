package ec.edu.espe.arquitectura.examen_roberto_freire_parcial_II.model;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;

import java.math.BigDecimal;

@Data
@Builder
public class Empleados_pago {
    private String numero_cuenta;
    private BigDecimal valor;
    private String estado;
}
