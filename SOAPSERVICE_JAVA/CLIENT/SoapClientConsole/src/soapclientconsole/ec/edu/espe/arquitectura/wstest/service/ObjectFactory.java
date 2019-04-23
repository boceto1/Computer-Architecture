
package ec.edu.espe.arquitectura.wstest.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ec.edu.espe.arquitectura.wstest.service package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ObtenerAlumnosResponse_QNAME = new QName("http://service.wstest.arquitectura.espe.edu.ec/", "obtenerAlumnosResponse");
    private final static QName _AgregarAlumno_QNAME = new QName("http://service.wstest.arquitectura.espe.edu.ec/", "agregarAlumno");
    private final static QName _ObtenerAlumnoPorCedula_QNAME = new QName("http://service.wstest.arquitectura.espe.edu.ec/", "obtenerAlumnoPorCedula");
    private final static QName _ObtenerAlumnos_QNAME = new QName("http://service.wstest.arquitectura.espe.edu.ec/", "obtenerAlumnos");
    private final static QName _ObtenerAlumnoPorCedulaResponse_QNAME = new QName("http://service.wstest.arquitectura.espe.edu.ec/", "obtenerAlumnoPorCedulaResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ec.edu.espe.arquitectura.wstest.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ObtenerAlumnosResponse }
     * 
     */
    public ObtenerAlumnosResponse createObtenerAlumnosResponse() {
        return new ObtenerAlumnosResponse();
    }

    /**
     * Create an instance of {@link AgregarAlumno }
     * 
     */
    public AgregarAlumno createAgregarAlumno() {
        return new AgregarAlumno();
    }

    /**
     * Create an instance of {@link ObtenerAlumnoPorCedula }
     * 
     */
    public ObtenerAlumnoPorCedula createObtenerAlumnoPorCedula() {
        return new ObtenerAlumnoPorCedula();
    }

    /**
     * Create an instance of {@link ObtenerAlumnos }
     * 
     */
    public ObtenerAlumnos createObtenerAlumnos() {
        return new ObtenerAlumnos();
    }

    /**
     * Create an instance of {@link ObtenerAlumnoPorCedulaResponse }
     * 
     */
    public ObtenerAlumnoPorCedulaResponse createObtenerAlumnoPorCedulaResponse() {
        return new ObtenerAlumnoPorCedulaResponse();
    }

    /**
     * Create an instance of {@link Alumno }
     * 
     */
    public Alumno createAlumno() {
        return new Alumno();
    }

    /**
     * Create an instance of {@link Telefono }
     * 
     */
    public Telefono createTelefono() {
        return new Telefono();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerAlumnosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.wstest.arquitectura.espe.edu.ec/", name = "obtenerAlumnosResponse")
    public JAXBElement<ObtenerAlumnosResponse> createObtenerAlumnosResponse(ObtenerAlumnosResponse value) {
        return new JAXBElement<ObtenerAlumnosResponse>(_ObtenerAlumnosResponse_QNAME, ObtenerAlumnosResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgregarAlumno }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.wstest.arquitectura.espe.edu.ec/", name = "agregarAlumno")
    public JAXBElement<AgregarAlumno> createAgregarAlumno(AgregarAlumno value) {
        return new JAXBElement<AgregarAlumno>(_AgregarAlumno_QNAME, AgregarAlumno.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerAlumnoPorCedula }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.wstest.arquitectura.espe.edu.ec/", name = "obtenerAlumnoPorCedula")
    public JAXBElement<ObtenerAlumnoPorCedula> createObtenerAlumnoPorCedula(ObtenerAlumnoPorCedula value) {
        return new JAXBElement<ObtenerAlumnoPorCedula>(_ObtenerAlumnoPorCedula_QNAME, ObtenerAlumnoPorCedula.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerAlumnos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.wstest.arquitectura.espe.edu.ec/", name = "obtenerAlumnos")
    public JAXBElement<ObtenerAlumnos> createObtenerAlumnos(ObtenerAlumnos value) {
        return new JAXBElement<ObtenerAlumnos>(_ObtenerAlumnos_QNAME, ObtenerAlumnos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerAlumnoPorCedulaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.wstest.arquitectura.espe.edu.ec/", name = "obtenerAlumnoPorCedulaResponse")
    public JAXBElement<ObtenerAlumnoPorCedulaResponse> createObtenerAlumnoPorCedulaResponse(ObtenerAlumnoPorCedulaResponse value) {
        return new JAXBElement<ObtenerAlumnoPorCedulaResponse>(_ObtenerAlumnoPorCedulaResponse_QNAME, ObtenerAlumnoPorCedulaResponse.class, null, value);
    }

}
