package entidades;

public class Automovil{
    public String Marca;
    public String Modelo;
    public int Precio;
    public Automovil(){
        Marca="No hay Marca";
        Modelo="No hay Modelo";
        Precio=0;
    }
    public Automovil(String n, String g1, int g2){
        Marca= n;
        Modelo= g1;
        Precio= g2;
    }
    
}