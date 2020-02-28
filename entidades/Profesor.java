package entidades;

public class Profesor{
    public String nombre;
    public String gradoacademico;
    public String area;
    public Profesor(){
        nombre="No hay nombre";
        gradoacademico="No hay grado academico";
        area="No hay area";
    }
    public Profesor(String n, String g1, String g2){
        nombre= n;
        gradoacademico= g1;
        area= g2;
    }
    
}