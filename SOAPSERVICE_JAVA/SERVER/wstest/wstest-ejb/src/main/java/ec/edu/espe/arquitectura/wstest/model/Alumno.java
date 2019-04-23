/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.arquitectura.wstest.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author Jean Karlo
 */
public class Alumno implements Serializable {

 private String cedula;
    private String nombre;
    private String genero;
    private Date fechaNacimeinto;
    private List<Telefono> telefonos;

    public Alumno() {
    }

    public Alumno(String cedula, String nombre, String genero) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.genero = genero;
    }
        
    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Date getFechaNacimeinto() {
        return fechaNacimeinto;
    }

    public void setFechaNacimeinto(Date fechaNacimeinto) {
        this.fechaNacimeinto = fechaNacimeinto;
    }
    
    

    public List<Telefono> getTelefonos() {
        return telefonos;
    }

    public void setTelefonos(List<Telefono> telefonos) {
        this.telefonos = telefonos;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + Objects.hashCode(this.cedula);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Alumno other = (Alumno) obj;
        if (!Objects.equals(this.cedula, other.cedula)) {
            return false;
        }
        return true;
    }


    @Override
    public String toString() {
        StringBuilder sb= new StringBuilder("Alumno{" + "cedula=");
        sb.append(cedula);
        sb.append(", nombre=" + nombre + ", genero=" + genero + ", fechaNacimeinto=" + fechaNacimeinto);
        for(Telefono t:this.telefonos){
            sb.append("\n\t");
            sb.append(t.toString());
        }
        
        return sb.append("\n").toString();
    }
    
    
}
