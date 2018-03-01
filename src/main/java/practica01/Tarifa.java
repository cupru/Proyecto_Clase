package practica01;

public class Tarifa {

    private Double tarifa;

    public Tarifa(){
        this.tarifa = 0.01;
    }

    public Tarifa(Double tarifa){
        this.tarifa = tarifa;
    }

    public Double getTarifa() {
        return tarifa;
    }

    public void setTarifa(Double tarifa) {
        this.tarifa = tarifa;
    }
}
