package ec.edu.espe.arquitectura.examen_roberto_freire_parcial_II.controller;

import ec.edu.espe.arquitectura.examen_roberto_freire_parcial_II.controller.dto.req.EmpresaReqDto;
import ec.edu.espe.arquitectura.examen_roberto_freire_parcial_II.controller.dto.res.EmpresaResDto;
import ec.edu.espe.arquitectura.examen_roberto_freire_parcial_II.service.EmpresaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/api")
@RequiredArgsConstructor
public class EmpresaController {
    private final EmpresaService empresaService;

    @PostMapping(name = "/create-enterprise")
    public ResponseEntity<EmpresaResDto> crearEmpresa(@RequestBody EmpresaReqDto empresaReqDto) {
        return ResponseEntity.ok(this.empresaService.crearEmpresaConEmpleados(empresaReqDto));
    }
}
