package repositorios.interfaces;

import entities.Alumno;
import entities.Carrera;
import entities.Inscripcion;
import entities.InscripcionId;

import java.time.LocalDate;
import java.util.List;

public interface RepositorioInscripcion {
    Inscripcion obtenerInscripcion(InscripcionId id);

    void modificarInscripcion(Inscripcion inscripcion);

    void eliminarInscripcion(InscripcionId id);

    void matricularAlumnoCarrera(Alumno alumno, Carrera carrera);

}
