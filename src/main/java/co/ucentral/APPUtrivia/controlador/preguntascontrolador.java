package co.ucentral.APPUtrivia.controlador;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@AllArgsConstructor
@RestController
public class preguntascontrolador {
    preguntasservicio preguntasservicio;
    @GetMapping("/")
    public List<preguntas> obtenerTodos(){
       return preguntasservicio.obtenerTodos();
    }
}
