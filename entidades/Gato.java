package entidades;

public class Gato{
    public String color;
    public String genero;
    public double peso;
    public Gato(){
        color="No hay color";
        genero="No hay genero";
        peso=0;
    }
    public Gato(String g, String r, Double t){
        color= g;
        genero= r;
        peso= t;
    }
    
}