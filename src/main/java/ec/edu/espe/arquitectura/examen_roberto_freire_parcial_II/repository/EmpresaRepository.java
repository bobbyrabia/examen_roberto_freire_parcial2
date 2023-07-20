package ec.edu.espe.arquitectura.examen_roberto_freire_parcial_II.repository;

import ec.edu.espe.arquitectura.examen_roberto_freire_parcial_II.model.Empresa;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface EmpresaRepository extends MongoRepository<Empresa, String> {
    Empresa findByRuc(String ruc);

}
