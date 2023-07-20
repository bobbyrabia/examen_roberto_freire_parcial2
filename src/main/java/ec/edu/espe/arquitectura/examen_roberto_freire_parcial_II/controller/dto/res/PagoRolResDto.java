package ec.edu.espe.arquitectura.examen_roberto_freire_parcial_II.controller.dto.res;

import ec.edu.espe.arquitectura.examen_roberto_freire_parcial_II.model.EmpleadosPago;
import ec.edu.espe.arquitectura.examen_roberto_freire_parcial_II.model.Empresa;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;
@Data
@Builder
public class PagoRolResDto {
    private Integer mes;
    private Empresa ruc_empresa;
    private String cuentaPrincipal;
    private List<EmpleadosPagoResDto> empleadosPagos;
}
