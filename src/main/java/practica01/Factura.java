package practica01;

public class Factura {

    private String codigo;
    private Tarifa tarifa;
    private Fecha fechEmision;
    private int periodo;
    private double importe;

    public Factura(){
        this.codigo = "";
        this.tarifa = new Tarifa();
        this.fechEmision = new Fecha();
        this.periodo = 0;
        this.importe = 0.0;
    }

    public Factura(String codigo, Tarifa tarifa, Fecha fechEmision, int periodo, double importe) {
        this.codigo = codigo;
        this.tarifa = tarifa;
        this.fechEmision = fechEmision;
        this.periodo = periodo;
        this.importe = importe;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Tarifa getTarifa() {
        return tarifa;
    }

    public void setTarifa(Tarifa tarifa) {
        this.tarifa = tarifa;
    }

    public Fecha getFechEmision() {
        return fechEmision;
    }

    public void setFechEmision(Fecha fechEmision) {
        this.fechEmision = fechEmision;
    }

    public int getPeriodo() {
        return periodo;
    }

    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }
}
