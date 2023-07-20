package ec.edu.espe.arquitectura.examen_roberto_freire_parcial_II.controller;

import ec.edu.espe.arquitectura.examen_roberto_freire_parcial_II.controller.dto.req.EmpresaReqDto;
import ec.edu.espe.arquitectura.examen_roberto_freire_parcial_II.controller.dto.req.PagoRolReqDto;
import ec.edu.espe.arquitectura.examen_roberto_freire_parcial_II.controller.dto.res.EmpresaResDto;
import ec.edu.espe.arquitectura.examen_roberto_freire_parcial_II.controller.dto.res.PagoRolResDto;
import ec.edu.espe.arquitectura.examen_roberto_freire_parcial_II.service.GenerarRolService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/api")
@RequiredArgsConstructor
public class GenerarRolController {
    private final GenerarRolService generarRolService;
    @PostMapping(name = "/generate-payroll")
    public ResponseEntity<PagoRolResDto> generarRol(@RequestBody PagoRolReqDto pagoRolReqDto) {
        return ResponseEntity.ok(this.generarRolService.GenerarRolEmpresaPorMes(pagoRolReqDto));
    }
}
