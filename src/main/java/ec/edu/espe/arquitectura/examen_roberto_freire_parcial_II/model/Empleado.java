package ec.edu.espe.arquitectura.examen_roberto_freire_parcial_II.model;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.mongodb.core.index.Indexed;

@Data
@Builder
public class Empleado {

    @Indexed(unique = true)
    private String ci;
    private String apellidos;
    private String nombres;
    private String numeroCuenta;
}
