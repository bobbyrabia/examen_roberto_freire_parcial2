package ec.edu.espe.arquitectura.examen_roberto_freire_parcial_II.controller.dto.req;

import ec.edu.espe.arquitectura.examen_roberto_freire_parcial_II.model.EmpleadosPago;
import ec.edu.espe.arquitectura.examen_roberto_freire_parcial_II.model.Empresa;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;
@Data
@Builder
public class PagoRolReqDto {
    private Integer mes;
    private EmpresaPagoRolReqDto ruc_empresa;
    private String cuentaPrincipal;
    private List<EmpleadosPagoReqDto> empleadosPagos;
}
