package practica01;

import java.util.Date;

public class Llamada implements Fechas{

    private int telefono;
    private Date fecha;
    private double duracion;

    public Llamada(){
        this.telefono = 0;
        this.fecha = new Date();
        this.duracion = 0.0;
    }

    public Llamada(int telefono, Date fecha, double duracion) {
        this.telefono = telefono;
        this.fecha = fecha;
        this.duracion = duracion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }
}
