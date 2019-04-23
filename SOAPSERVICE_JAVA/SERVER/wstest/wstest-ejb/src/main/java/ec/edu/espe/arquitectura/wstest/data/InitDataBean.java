package ec.edu.espe.arquitectura.wstest.data;

import ec.edu.espe.arquitectura.wstest.model.Alumno;
import ec.edu.espe.arquitectura.wstest.model.Telefono;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;


@Singleton
@Startup
public class InitDataBean  {

   private static final Logger LOG = Logger.getLogger(InitDataBean.class.getName()); 
   private Map<String,Alumno> db;
   
    @PostConstruct
    public void postConstruct() {
        LOG.info("Va a cargar los datos");
        List<Alumno> alumnosTmp = this.obtenerAlumnos();
        db = new HashMap<>();
        for (Alumno a : alumnosTmp) {
            db.put(a.getCedula(), a);
            LOG.info("Alumno: " + a.toString());
        }
        LOG.info("Acabo de cargar los datos: Alumnos cargados " + this.db.size());
    }
    
    
    public Collection<Alumno> all() {
        return this.db.values();
    }

    public Alumno byPK(String cedula) {
        return this.db.get(cedula);
    }

    public void add(Alumno alumno) {
        this.db.put(alumno.getCedula(), alumno);
    }

    private List<Alumno> obtenerAlumnos() {
        List<Alumno> alumnos = new ArrayList<>();

        Alumno alumno1 = new Alumno("0400866414", "Cesar Obando", "H");
        Telefono t1 = new Telefono("OFI", "22075259");
        Telefono t2 = new Telefono("MOV", "0997014320");
        List<Telefono> telAl1 = new ArrayList<>();
        telAl1.add(t1);
        telAl1.add(t2);
        alumno1.setTelefonos(telAl1);
        alumno1.setFechaNacimeinto(new Date(1971, 15, 03));
        alumnos.add(alumno1);

        Alumno alumno2 = new Alumno("0400866321", "Jean Obando", "H");
        Telefono t3 = new Telefono("OFI", "22075258");
        Telefono t4 = new Telefono("MOV", "0997014321");
        List<Telefono> telAl2 = new ArrayList<>();
        telAl2.add(t3);
        telAl2.add(t4);
        alumno2.setTelefonos(telAl2);
        alumno2.setFechaNacimeinto(new Date(1996, 20, 11));
        alumnos.add(alumno2);

        Alumno alumno3 = new Alumno("0400866322", "Jean Obando", "H");
        Telefono t5 = new Telefono("OFI", "22075258");
        List<Telefono> telAl3 = new ArrayList<>();
        telAl2.add(t5);
        alumno3.setTelefonos(telAl3);
        alumnos.add(alumno3);

        Alumno alumno4 = new Alumno("0400866325", "Jean Obando", "H");
        Telefono t6 = new Telefono("HOU", "220755656");
        Telefono t7 = new Telefono("OFI", "22075258");
        Telefono t8 = new Telefono("MOV", "0997014321");

        List<Telefono> telAl4 = new ArrayList<>();
        telAl4.add(t6);
        telAl4.add(t7);
        telAl4.add(t8);
        alumno4.setTelefonos(telAl4);
        alumnos.add(alumno4);

        Alumno alumno5 = new Alumno("0400866328", "Jean Obando", "H");
        Telefono t9 = new Telefono("OFI", "22075258");
        Telefono t10 = new Telefono("MOV", "0997014321");
        Telefono t11 = new Telefono("HOU", "22075258");
        Telefono t12 = new Telefono("HOU2", "2207522323");
        List<Telefono> telAl5 = new ArrayList<>();
        telAl5.add(t9);
        telAl5.add(t10);
        telAl5.add(t11);
        telAl5.add(t12);
        alumno5.setTelefonos(telAl5);
        alumnos.add(alumno5);

        return alumnos;
    }
   
   
}
