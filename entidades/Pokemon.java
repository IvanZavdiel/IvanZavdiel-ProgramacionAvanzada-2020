package entidades;

public class Pokemon{
    public String tipo;
    public String naturaleza;
    public String debilidad;
    public Pokemon(){
        tipo="No hay tipo";
        naturaleza="No hay naturaleza";
        debilidad="No hay debilidad";
    }
    public Pokemon(String g, String r, String t){
        tipo= g;
        naturaleza= r;
        debilidad= t;
    }
    
}