package ec.edu.espe.arquitectura.examen_roberto_freire_parcial_II.model;

import ec.edu.espe.arquitectura.examen_roberto_freire_parcial_II.controller.dto.res.EmpresaResDto;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.util.List;

@Data
@Builder
@Document(collection = "pago_roles")
public class PagoRol {
    @Id
    private String id;
    private Integer mes;
    private Empresa ruc_empresa;
    private String cuentaPrincipal;
    private BigDecimal valor_total;
    private BigDecimal valor_real;
    private List<EmpleadosPago> empleadosPagos;

}
