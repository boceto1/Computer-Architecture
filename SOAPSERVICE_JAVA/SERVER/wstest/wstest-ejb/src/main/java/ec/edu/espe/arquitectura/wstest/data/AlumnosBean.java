package ec.edu.espe.arquitectura.wstest.data;

import ec.edu.espe.arquitectura.wstest.model.Alumno;
import java.util.Collection;
import javax.ejb.EJB;
import javax.ejb.Singleton;
import javax.ejb.Stateless;

@Stateless
@Singleton
public class AlumnosBean {

    @EJB

    private InitDataBean init;

    public Collection<Alumno> obtenerAlumnos() {
        return init.all();
    }

    public Alumno obtenerAlumnoPorId(String cedula) {
        return init.byPK(cedula);
    }

    public void agregarAlumno(Alumno al) {
        init.add(al);
    }

}
