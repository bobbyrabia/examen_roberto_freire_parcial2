package ec.edu.espe.arquitectura.examen_roberto_freire_parcial_II.controller.dto.req;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.mongodb.core.index.Indexed;
@Data
@Builder
public class EmpleadoReqDto {

    private String ci;
    private String apellidos;
    private String nombres;
    private String numeroCuenta;
}
