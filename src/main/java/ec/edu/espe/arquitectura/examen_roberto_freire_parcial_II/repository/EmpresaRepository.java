package ec.edu.espe.arquitectura.examen_roberto_freire_parcial_II.repository;

import ec.edu.espe.arquitectura.examen_roberto_freire_parcial_II.model.Empresa;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EmpresaRepository extends MongoRepository<Empresa, String> {

}
