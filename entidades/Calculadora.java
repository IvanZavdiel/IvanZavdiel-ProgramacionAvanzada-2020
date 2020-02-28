package entidades;

public class Calculadora{
    public String Modelo;
    public String Tipo;
    public int Precio;
    public Calculadora(){
        Modelo="No hay Modelo";
        Tipo="No hay Tipo";
        Precio=0;
    }
    public Calculadora(String n, String g1, int g2){
        Modelo= n;
        Tipo= g1;
        Precio= g2;
    }
    
}