package entities;

public class CC extends EntidadBancaria {

    public CC() {
        super();
    }

    public CC(int banco, int sucursal, int numeroProd) {
        this.banco = banco;
        this.sucursal = sucursal;
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

    @Override
    public String toString() {
        return "CC{" +
                "banco=" + banco +
                ", sucursal=" + sucursal +
                ", claveSeguridad=" + claveSeguridad +
                ", numeroProd=" + numeroProd +
                '}';
    }
}//cierra CLASE
