package co.ucentral.APPUtrivia.persistencia.respositorios;

import jakarta.persistence.Id;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface preguntasRepositorio extends CrudRepository<preguntas,Long> {
}
