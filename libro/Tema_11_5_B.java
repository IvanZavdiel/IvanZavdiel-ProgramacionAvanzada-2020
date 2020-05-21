package libro;
// Prueba de CampoTextoMarco.
import javax.swing.JFrame;

public class Tema_11_5_B {
    public static void main( String args[] )
    {
        Tema_11_5_A campoTextoMarco = new Tema_11_5_A();
        campoTextoMarco.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        campoTextoMarco.setSize( 350, 100 ); // establece el tamaño del marco
        campoTextoMarco.setVisible( true ); // muestra el marco
    }// fin de main
} // fin de la clase PruebaCampoTexto