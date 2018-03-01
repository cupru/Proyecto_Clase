package practica01;

import java.util.Date;

public class Empresa extends Cliente {

    public Empresa() {
        super();
    }
    public Empresa(String nombre, String NIF, Direccion dir, String email){
        super(nombre, NIF, dir, email);
    }

    public Date getFecha(){
        return this.getFechaAlta();
    }
}
