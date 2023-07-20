package ec.edu.espe.arquitectura.examen_roberto_freire_parcial_II.model;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Builder
@Document(collection = "empresas")
public class Empresa {
    @Id
    private String id;
    @Indexed(unique = true)
    private String ruc;
    private String razonSocial;
    private String cuentaPrincipal;
    private List<Empleado> empleados;

}
