package ec.edu.espe.arquitectura.examen_roberto_freire_parcial_II.controller.dto.res;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class EmpresaResDto {
    private String ruc;
    private String razonSocial;
    private String cuentaPrincipal;
    private List<EmpleadoResDto> empleados;
}