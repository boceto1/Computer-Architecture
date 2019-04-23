/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.arquitectura.wstest.service;

import ec.edu.espe.arquitectura.wstest.data.AlumnosBean;
import ec.edu.espe.arquitectura.wstest.model.Alumno;
import java.util.Collection;
import javax.ejb.EJB;
import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 *
 * @author Jean Karlo
 */
@WebService(serviceName = "AlumnoWS")
public class AlumnoWS {

    @EJB
    private AlumnosBean ejbRef;

    @WebMethod(operationName = "obtenerAlumnos")
    public Collection<Alumno> obtenerAlumnos() {
        return ejbRef.obtenerAlumnos();
    }

    @WebMethod(operationName = "obtenerAlumnoPorCedula")
    public Alumno obtenerAlumnoPorId(@WebParam(name = "cedula") String cedula) {
        return ejbRef.obtenerAlumnoPorId(cedula);
    }

    @WebMethod(operationName = "agregarAlumno")
    @Oneway
    public void agregarAlumno(@WebParam(name = "al") Alumno al) {
        ejbRef.agregarAlumno(al);
    }
    
}
