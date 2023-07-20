package ec.edu.espe.arquitectura.examen_roberto_freire_parcial_II.controller.dto.res;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class EmpleadoResDto {
    private String ci;
    private String apellidos;
    private String nombres;
    private String numeroCuenta;
}
