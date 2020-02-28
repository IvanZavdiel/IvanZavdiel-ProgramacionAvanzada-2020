package entidades;

public class Conejo{
    public String color;
    public String genero;
    public double peso;
    public Conejo(){
        color="No hay color";
        genero="No hay genero";
        peso=0;
    }
    public Conejo(String g, String r, Double t){
        color= g;
        genero= r;
        peso= t;
    }
    
}