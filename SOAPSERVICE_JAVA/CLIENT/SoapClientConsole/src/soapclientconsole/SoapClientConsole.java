/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soapclientconsole;

import ec.edu.espe.arquitectura.wstest.service.Alumno;
import ec.edu.espe.arquitectura.wstest.service.AlumnoWS;
import ec.edu.espe.arquitectura.wstest.service.AlumnoWS_Service;
import java.util.List;

/**
 *
 * @author Jean Karlo
 */
public class SoapClientConsole {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Run this command in the root of Soap Client
            wsimport -keep -verbose http://localhost:8080/webservicetaller-web/AlumnoWS?wsdl -d src\clientsoap\
        */
        
        AlumnoWS_Service alumnoServiceI = new AlumnoWS_Service();
        AlumnoWS alumnoService = alumnoServiceI.getAlumnoWSPort();

        List<Alumno> alumnos = alumnoService.obtenerAlumnos();
        Alumno alumno = alumnos.get(0);
        Alumno alumno2 = alumnoService.obtenerAlumnoPorCedula("0400866414");

        System.out.println(alumno.getNombre() + "  " + alumno.getFechaNacimeinto() + "  " + alumno.getGenero());
        System.out.println(alumno2.getNombre() + "  " + alumno2.getFechaNacimeinto() + "  " + alumno2.getGenero());

    }
    
}
