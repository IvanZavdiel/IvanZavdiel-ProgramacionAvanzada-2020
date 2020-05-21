package libro;
import javax.swing.JFrame;

public class Tema_11_8_B {
        public static void main( String args[] )
      {
        Tema_11_8_A marcoBoton = new Tema_11_8_A(); // crea MarcoBoton
       marcoBoton.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
       marcoBoton.setSize( 300, 110 ); // establece el tamaño del marco
      marcoBoton.setVisible( true ); // muestra el marco
      } // fin de main
}
