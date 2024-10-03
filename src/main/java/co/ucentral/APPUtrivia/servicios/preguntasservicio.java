package co.ucentral.APPUtrivia.servicios;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class preguntasservicio {

    preguntasRepositorio preguntasRepositorio;

    public List<preguntas> obtenerTodos() {
        return (List<preguntas>) preguntasRepositorio.findAll();
    }
}

