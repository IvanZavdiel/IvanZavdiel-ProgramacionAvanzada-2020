package libro;

// Prueba de MarcoPanel.
import javax.swing.JFrame;
 
public class Tema_11_18_B extends JFrame
{
public static void main( String args[] )
{
    Tema_11_18_A marcoPanel = new Tema_11_18_A();
marcoPanel.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
marcoPanel.setSize( 450, 200 ); // establece el tamaño del marco
marcoPanel.setVisible( true ); // muestra el marco
} // fin de main
} // fin de la clase Tema_11_18_B