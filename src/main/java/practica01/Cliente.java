package practica01;

import java.util.*;

public abstract class Cliente implements Fechas {

    private String nombre;
    private String NIF;
    private Direccion dir;
    private String email;
    private Date fechaAlta;
    private ArrayList<Llamada> llamadas;
    private Map<String, Factura> facturas;
    private Tarifa tarifa;

    public Cliente(){
        this.nombre = "";
        this.NIF = "";
        this.dir = new Direccion();
        this.email = "";
        this.fechaAlta = new Date();
        this.llamadas = new ArrayList<Llamada>();
        this.facturas = new HashMap<String, Factura>();
        this.tarifa = new Tarifa();
    }

    public Cliente(String nombre, String NIF, Direccion dir, String email) {
        this.nombre = nombre;
        this.NIF = NIF;
        this.dir = dir;
        this.email = email;
        this.fechaAlta = new Date();
        this.llamadas = new ArrayList<Llamada>();
        this.facturas = new HashMap<String, Factura>();
        this.tarifa = new Tarifa();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNIF() {
        return NIF;
    }

    public void setNIF(String NIF) {
        this.NIF = NIF;
    }

    public Direccion getDir() {
        return dir;
    }

    public void setDir(Direccion dir) {
        this.dir = dir;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(Date fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public ArrayList<Llamada> getLlamadas(){
        return this.llamadas;
    }

    public void setLlamadas(ArrayList<Llamada> llamadas){
        this.llamadas = llamadas;
    }

    public Map<String, Factura> getFacturas(){
        return this.facturas;
    }

    public void setFacturas(Map<String, Factura> facturas){
        this.facturas = facturas;
    }

    public Tarifa getTarifa() {
        return tarifa;
    }

    public void setTarifa(Tarifa tarifa) {
        this.tarifa = tarifa;
    }
}
