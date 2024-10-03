package co.ucentral.APPUtrivia.persistencia.entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Preguntas")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class preguntas{

    @Id
    private long id;

    private String titulo;

    private String respuestas;
}
