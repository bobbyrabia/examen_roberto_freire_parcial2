package ec.edu.espe.arquitectura.examen_roberto_freire_parcial_II.service;

import ec.edu.espe.arquitectura.examen_roberto_freire_parcial_II.controller.dto.req.EmpleadoReqDto;
import ec.edu.espe.arquitectura.examen_roberto_freire_parcial_II.controller.dto.req.EmpresaReqDto;
import ec.edu.espe.arquitectura.examen_roberto_freire_parcial_II.controller.dto.res.EmpleadoResDto;
import ec.edu.espe.arquitectura.examen_roberto_freire_parcial_II.controller.dto.res.EmpresaResDto;
import ec.edu.espe.arquitectura.examen_roberto_freire_parcial_II.model.Empleado;
import ec.edu.espe.arquitectura.examen_roberto_freire_parcial_II.model.Empresa;
import ec.edu.espe.arquitectura.examen_roberto_freire_parcial_II.repository.EmpresaRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmpresaService {
    private final EmpresaRepository empresaRepository;

    public EmpresaService(EmpresaRepository empresaRepository) {
        this.empresaRepository = empresaRepository;
    }

    public EmpresaResDto crearEmpresaConEmpleados(EmpresaReqDto empresaReqDto) {
        Empresa empresa=this.empresaRepository.save(this.EmpresaReqDtoAEmpresa(empresaReqDto));
        EmpresaResDto empresaResDto=this.EmpresaAEmpresaResDto(empresa);
        return empresaResDto;
    }

    public Empresa EmpresaReqDtoAEmpresa(EmpresaReqDto empresaReqDto) {
        List<Empleado> empleadosList = new ArrayList<>();
        for (EmpleadoReqDto empleadoReqDto : empresaReqDto.getEmpleados()) {
            Empleado empleado = Empleado.builder()
                    .ci(empleadoReqDto.getCi())
                    .nombres(empleadoReqDto.getNombres())
                    .apellidos(empleadoReqDto.getApellidos())
                    .numeroCuenta(empleadoReqDto.getNumeroCuenta())
                    .build();
            empleadosList.add(empleado);
        }

        Empresa empresa = Empresa.builder().ruc(empresaReqDto.getRuc()).razonSocial(empresaReqDto.getRazonSocial()).cuentaPrincipal(empresaReqDto.getCuentaPrincipal()).empleados(empleadosList).build();
        return empresa;
    }
    public EmpresaResDto EmpresaAEmpresaResDto(Empresa empresa){
        List<EmpleadoResDto> empleadoResDtoList = new ArrayList<>();
        for (Empleado empleado : empresa.getEmpleados()) {
            EmpleadoResDto empleadoResDto = EmpleadoResDto.builder()
                    .ci(empleado.getCi())
                    .nombres(empleado.getNombres())
                    .apellidos(empleado.getApellidos())
                    .numeroCuenta(empleado.getNumeroCuenta())
                    .build();
            empleadoResDtoList.add(empleadoResDto);
        }
        EmpresaResDto empresaResDto = EmpresaResDto.builder().ruc(empresa.getRuc()).razonSocial(empresa.getRazonSocial()).cuentaPrincipal(empresa.getCuentaPrincipal()).empleados(empleadoResDtoList).build();
        return empresaResDto;
    }

}
