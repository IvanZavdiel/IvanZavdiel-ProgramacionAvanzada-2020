package entidades;

public class Reptil{
    public String color;
    public String genero;
    public double peso;
    public Reptil(){
        color="No hay color";
        genero="No hay genero";
        peso=0;
    }
    public Reptil(String g, String r, Double t){
        color= g;
        genero= r;
        peso= t;
    }
    
}