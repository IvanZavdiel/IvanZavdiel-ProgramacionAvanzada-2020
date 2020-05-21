package libro;
// Prueba de LabelFrame.
import javax.swing.JFrame;

public class Tema_11_4_B 
{
    public static void main( String args[] )
    {
        Tema_11_4_A marcoEtiqueta = new Tema_11_4_A(); // crea objeto Tema_11_4_A
        marcoEtiqueta.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        marcoEtiqueta.setSize( 400, 300 ); // establece el tamaño del marco
        marcoEtiqueta.setVisible( true ); // muestra el marco
    }// fin del main
}// fin de la clase PruebaLabel