package entities;

public abstract class EntidadBancaria {
    int banco;
    int sucursal;
    int claveSeguridad;
    int numeroProd;
    static int contador;


    static {
        contador = 0;
    }

    public EntidadBancaria() {
        banco = 0;
        sucursal = 0;
        claveSeguridad = 0;
        contador++;
        numeroProd = contador;
    }

}//cierra clase
