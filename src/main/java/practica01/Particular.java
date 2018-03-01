package practica01;

import java.util.Date;

public class Particular extends Cliente {

    private String apellidos;

    public Particular(){
        super();
        this.apellidos = "";
    }

    public Particular(String nombre, String NIF, Direccion dir, String email, String apellidos) {
        super(nombre, NIF, dir, email);
        this.apellidos = apellidos;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Date getFecha(){
        return this.getFechaAlta();
    }
}
