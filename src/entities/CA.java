package entities;

public class CA extends EntidadBancaria {
    public CA(int banco, int sucursal, int numeroProd) {
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
}//cierra CLASE
