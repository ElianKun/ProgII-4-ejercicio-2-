package entities;

public class TC extends EntidadBancaria {

    public TC(){
        super();
    }

    public TC(int banco, int sucursal, int claveSeguridad, int numeroProd) {
        this.banco = banco;
        this.sucursal = sucursal;
        this.claveSeguridad = claveSeguridad;
        this.numeroProd = numeroProd;
    }

    public int getBanco() {
        return banco;
    }

    public void setBanco(int banco) {
        this.banco = banco;
    }

    public int getSucursal() {
        return sucursal;
    }

    public void setSucursal(int sucursal) {
        this.sucursal = sucursal;
    }

    public int getClaveSeguridad() {
        return claveSeguridad;
    }

    public void setClaveSeguridad(int claveSeguridad) {
        this.claveSeguridad = claveSeguridad;
    }

    @Override
    public String toString() {
        return "TC{" +
                "banco=" + banco +
                ", sucursal=" + sucursal +
                ", claveSeguridad=" + claveSeguridad +
                ", numeroProd=" + numeroProd +
                '}';
    }
}//cierra CLASE
