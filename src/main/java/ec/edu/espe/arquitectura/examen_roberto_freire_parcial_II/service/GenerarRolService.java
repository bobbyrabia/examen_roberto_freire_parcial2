package ec.edu.espe.arquitectura.examen_roberto_freire_parcial_II.service;

import ec.edu.espe.arquitectura.examen_roberto_freire_parcial_II.controller.dto.req.EmpleadosPagoReqDto;
import ec.edu.espe.arquitectura.examen_roberto_freire_parcial_II.controller.dto.req.PagoRolReqDto;
import ec.edu.espe.arquitectura.examen_roberto_freire_parcial_II.controller.dto.res.EmpleadosPagoResDto;
import ec.edu.espe.arquitectura.examen_roberto_freire_parcial_II.controller.dto.res.EmpresaResDto;
import ec.edu.espe.arquitectura.examen_roberto_freire_parcial_II.controller.dto.res.PagoRolResDto;
import ec.edu.espe.arquitectura.examen_roberto_freire_parcial_II.model.EmpleadosPago;
import ec.edu.espe.arquitectura.examen_roberto_freire_parcial_II.model.Empresa;
import ec.edu.espe.arquitectura.examen_roberto_freire_parcial_II.model.PagoRol;
import ec.edu.espe.arquitectura.examen_roberto_freire_parcial_II.repository.EmpresaRepository;
import ec.edu.espe.arquitectura.examen_roberto_freire_parcial_II.repository.PagoRolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GenerarRolService {

    private final PagoRolRepository pagoRolRepository;
    private final EmpresaRepository empresaRepository;

    public GenerarRolService(PagoRolRepository pagoRolRepository, EmpresaRepository empresaRepository) {
        this.pagoRolRepository = pagoRolRepository;
        this.empresaRepository = empresaRepository;
    }

    public PagoRolResDto GenerarRolEmpresaPorMes(PagoRolReqDto pagoRolReqDto){
        PagoRol pagoRol=this.pagoRolRepository.save(this.PagoRolReqDtoAPagoRol(pagoRolReqDto));
        PagoRolResDto pagoRolResDto=this.PagoRolAPagoRolResDto(pagoRol);
        return pagoRolResDto;
    }

    public PagoRol PagoRolReqDtoAPagoRol(PagoRolReqDto pagoRolReqDto){
        List<EmpleadosPago> empleadosPagoList=new ArrayList<>();
        for(EmpleadosPagoReqDto empleadosPagoReqDto:pagoRolReqDto.getEmpleadosPagos()){
            EmpleadosPago empleadosPago=EmpleadosPago.builder().numeroCuenta(empleadosPagoReqDto.getNumeroCuenta()).valor(empleadosPagoReqDto.getValor()).estado("PEN").build();
            empleadosPagoList.add(empleadosPago);
        }
        Empresa empresa=this.empresaRepository.findByRuc(pagoRolReqDto.getRuc_empresa().getRuc());
        PagoRol pagoRol=PagoRol.builder().mes(pagoRolReqDto.getMes()).ruc_empresa(empresa).cuentaPrincipal(pagoRolReqDto.getCuentaPrincipal()).empleadosPagos(empleadosPagoList).build();
        return  pagoRol;
    }
    public PagoRolResDto PagoRolAPagoRolResDto(PagoRol pagoRol){
        List<EmpleadosPagoResDto> empleadosPagoResDtos=new ArrayList<>();
        for(EmpleadosPago empleadosPago:pagoRol.getEmpleadosPagos()){
            EmpleadosPagoResDto empleadosPagoResDto=EmpleadosPagoResDto.builder()
                    .numeroCuenta(empleadosPago.getNumeroCuenta())
                    .valor(empleadosPago.getValor())
                    .build();
            empleadosPagoResDtos.add(empleadosPagoResDto);
        }
        PagoRolResDto pagoRolResDto=PagoRolResDto.builder()
                .mes(pagoRol.getMes())
                .ruc_empresa(pagoRol.getRuc_empresa())
                .cuentaPrincipal(pagoRol.getCuentaPrincipal())
                .empleadosPagos(empleadosPagoResDtos).build();
        return  pagoRolResDto;

    }



}
