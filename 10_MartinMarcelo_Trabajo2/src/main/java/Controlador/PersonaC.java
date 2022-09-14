package controlador;

import dao.PersonaImpl;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import modelo.Persona;

@Named(value = "PersonaC")
@SessionScoped

public class PersonaC implements Serializable {

    private Persona per;
    private PersonaImpl dao;
    private List<Persona> listadoPersona;

    public PersonaC() {
        per = new Persona();
        dao = new PersonaImpl();
    }

    public void registrar() {
        try {
            dao.registrar(per);
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "OK", "Registrado con éxito"));
            limpiar();
            listar();
        } catch (Exception e) {
            System.out.println("ERROR EN REGISTRAR" + e);
        }
    }

    public void listar() {
        try {
            listadoPersona = dao.listarTodo();

        } catch (Exception e) {
            System.out.println("ERROR EN LISTAR" + e);
        }
    }

    public void limpiar() {
        per = new Persona();
    }

// METODOS GENERADOS

    public Persona getPer() {
        return per;
    }

    public void setPer(Persona per) {
        this.per = per;
    }

    public PersonaImpl getDao() {
        return dao;
    }

    public void setDao(PersonaImpl dao) {
        this.dao = dao;
    }

    public List<Persona> getListadoPersona() {
        return listadoPersona;
    }

    public void setListadoPersona(List<Persona> listadoPersona) {
        this.listadoPersona = listadoPersona;
    }
  
}
