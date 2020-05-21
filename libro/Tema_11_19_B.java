package libro;

// Copia el texto seleccionado de un área de texto a otra.
 import javax.swing.JFrame;
 
  public class Tema_11_19_B
  {
  public static void main( String args[] )
  {
    Tema_11_19_A marcoAreaTexto = new Tema_11_19_A();
  marcoAreaTexto.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
  marcoAreaTexto.setSize( 425, 200 ); // establece el tamaño del marco
 marcoAreaTexto.setVisible( true ); // muestra el marco
} // fin de main
 } // fin de la clase DemoAreaTexto