package entidades;

public class Alumno{
    public String nombre;
    public String grado;
    public String grupo;
    public Alumno(){
        nombre="No hay nombre";
        grado="No hay nombre";
        grupo="No hay nombre";
    }
    public Alumno(String n, String g1, String g2){
        nombre= n;
        grado= g1;
        grupo= g2;
    }
    
}