package controlador;

import java.io.Serializable;
import java.util.logging.Logger;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

@Named
@ViewScoped

public class Controlador implements Serializable {

    private static final Logger LOG = Logger.getLogger(Controlador.class.getName());

    private String texto;
    private String texto2;
    private String texto3;
    private String texto4;
    private String texto5;
    private String texto6;
    private String texto7;
    private String texto8;
    private int number;

    public void increment() {
        number++;
    }

    public void handleKeyEvent() {
        texto5 = texto5.toUpperCase();
    }

// METODOS GENERADOS    
    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getTexto2() {
        return texto2;
    }

    public void setTexto2(String texto2) {
        this.texto2 = texto2;
    }

    public String getTexto3() {
        return texto3;
    }

    public void setTexto3(String texto3) {
        this.texto3 = texto3;
    }

    public String getTexto4() {
        return texto4;
    }

    public void setTexto4(String texto4) {
        this.texto4 = texto4;
    }

    public String getTexto5() {
        return texto5;
    }

    public void setTexto5(String texto5) {
        this.texto5 = texto5;
    }

    public String getTexto6() {
        return texto6;
    }

    public void setTexto6(String texto6) {
        this.texto6 = texto6;
    }

    public String getTexto7() {
        return texto7;
    }

    public void setTexto7(String texto7) {
        this.texto7 = texto7;
    }

    public String getTexto8() {
        return texto8;
    }

    public void setTexto8(String texto8) {
        this.texto8 = texto8;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

}
