import entidades.Persona;
import entidades.Alumno;
import entidades.Animal;
import entidades.Automovil;
import entidades.Calculadora;
import entidades.Conejo;
import entidades.Gato;
import entidades.Pokemon;
import entidades.Profesor;
import entidades.Reptil;

public class Main2{
    public static void main(String[] args) {
        Persona beto= new Persona(23,170,67.4);
        Alumno juan= new Alumno("JuanOjeda","2ndo","1mm1");
        Animal perro=new Animal("Macho","Pug","Pequeño");
        Automovil march=new Automovil("Nissan","2015",110000);
        Calculadora asus=new Calculadora("Asus","Cientifica",250);
        Conejo blanco=new Conejo("blanco","hembra",3.5);
        Gato negro=new Gato("negro","hembra",4.5);
        Pokemon pikachu=new Pokemon("pikachu","rayo","roca");
        Profesor Osiris= new Profesor("Osiris","doctorado","electronica");
        Reptil lagartija=new Reptil("verde","macho",.256);

        System.out.println();
    }
}