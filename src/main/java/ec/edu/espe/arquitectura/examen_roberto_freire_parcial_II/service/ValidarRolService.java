package ec.edu.espe.arquitectura.examen_roberto_freire_parcial_II.service;

import ec.edu.espe.arquitectura.examen_roberto_freire_parcial_II.controller.dto.res.PagoRolResDto;
import ec.edu.espe.arquitectura.examen_roberto_freire_parcial_II.model.PagoRol;
import ec.edu.espe.arquitectura.examen_roberto_freire_parcial_II.repository.EmpresaRepository;
import ec.edu.espe.arquitectura.examen_roberto_freire_parcial_II.repository.PagoRolRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ValidarRolService {
    private final EmpresaRepository empresaRepository;
    private final PagoRolRepository pagoRolRepository;

    public ValidarRolService(EmpresaRepository empresaRepository, PagoRolRepository pagoRolRepository) {
        this.empresaRepository = empresaRepository;
        this.pagoRolRepository = pagoRolRepository;
    }

//    public List<PagoRolResDto> ValidarProcesoGenerarRoles(Integer mes, String ruc){
//
//
//    }


}
