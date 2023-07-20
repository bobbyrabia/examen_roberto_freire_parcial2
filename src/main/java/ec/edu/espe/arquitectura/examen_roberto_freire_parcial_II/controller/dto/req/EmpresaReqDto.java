package ec.edu.espe.arquitectura.examen_roberto_freire_parcial_II.controller.dto.req;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class EmpresaReqDto {
    private String ruc;
    private String razonSocial;
    private String cuentaPrincipal;
    private List<EmpleadoReqDto> empleados;

}
