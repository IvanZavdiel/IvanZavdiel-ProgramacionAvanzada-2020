package entidades;

public class Animal{
    public String genero;
    public String raza;
    public String tamaño;
    public Animal(){
        genero="No hay genero";
        raza="No hay raza";
        tamaño="No hay tamaño";
    }
    public Animal(String g, String r, String t){
        genero= g;
        raza= r;
        tamaño= t;
    }
    
}