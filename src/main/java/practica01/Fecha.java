package practica01;

public class Fecha {

    private int dia;
    private int mes;
    private int año;
    private int hora;
    private int min;
    private int seg;

    public Fecha(){
        this.dia = 1;
        this.mes = 1;
        this.año = 1970;
        this.hora = 0;
        this.min = 0;
        this.seg = 0;
    }

    public Fecha(int dia, int mes, int año) {
        this.dia = dia;
        this.mes = mes;
        this.año = año;
        this.hora = 0;
        this.min = 0;
        this.seg = 0;
    }

    public Fecha(int dia, int mes, int año, int hora, int min, int seg){
        this.dia = dia;
        this.mes = mes;
        this.año = año;
        this.hora = hora;
        this.min = min;
        this.seg = seg;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getSeg() {
        return seg;
    }

    public void setSeg(int seg) {
        this.seg = seg;
    }

    @Override
    public String toString() {
        String res = "";
        if(this.dia < 10){
            res += 0;
        }
        res += this.dia + "/";
        if(this.mes < 10){
            res += 0;
        }
        res += this.mes + "/" + this.año + "\t";
        if(this.hora < 10){
            res += 0;
        }
        res += ":";
        if(this.min < 10){
            res += 0;
        }
        res += ":";
        if(this.seg < 10){
            res += 0;
        }
        return res;
    }

    private boolean esBisiesto(){
        return (this.año % 4 == 0);
    }

    public boolean comprobarFecha(){
        boolean diaCorrecto = false;
        boolean mesCorrecto = this.mes >= 1 && this.mes <= 12;
        boolean añoCorrecto = this.año > 1970;
        if(mesCorrecto){
            switch (this.mes) {
                case 2:
                    if (esBisiesto()) {
                        diaCorrecto = this.dia >= 1 && this.dia <= 29;
                    } else {
                        diaCorrecto = this.dia >= 1 && this.dia <= 28;
                    }
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    diaCorrecto = this.dia >= 1 && this.dia <= 30;
                    break;
                default:
                    diaCorrecto = this.dia >= 1 && this.dia <= 31;
            }
        }
        return diaCorrecto && mesCorrecto && añoCorrecto;
    }

    public boolean comprobarHora(){
        return ((this.hora >= 0 && this.hora <= 23) && (this.min >= 0 && this.min <= 59) && (this.seg >= 0 && this.seg <= 59));
    }
}
