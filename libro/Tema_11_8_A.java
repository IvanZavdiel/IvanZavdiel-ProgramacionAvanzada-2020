package libro;
// Creación de objetos JButton
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Tema_11_8_A extends JFrame
{
    private JButton botonJButtonSimple; // botón con texto solamente
    private JButton botonJButtonElegante; // botón con iconos

    // MarcoBoton agrega objetos JButton a JFrame
    public Tema_11_8_A()
    {
        super( "Prueba de botones" );
        setLayout( new FlowLayout() ); // establece el esquema del marco

        botonJButtonSimple = new JButton( "Boton simple" ); // botón con texto
        add( botonJButtonSimple ); // agrega botonJButtonSimple a JFrame

        Icon insecto1 = new ImageIcon( getClass().getResource( "insecto1.jpg" ) );
        Icon insecto2 = new ImageIcon( getClass().getResource( "insecto2.jpg" ) );
        botonJButtonElegante = new JButton( "Boton elegante", insecto1 ); // establece la imagen
        botonJButtonElegante.setRolloverIcon( insecto2 ); // establece la imagen de susticutcion
        add( botonJButtonElegante ); // agrega botonJButtonElegante a JFrame

        // crea nuevo ManejadorBoton para manejar los eventos de botón
        ManejadorBoton manejador = new ManejadorBoton();
        botonJButtonElegante.addActionListener( manejador );
        botonJButtonSimple.addActionListener( manejador );
    }// fin del constructor de MarcoBoton

    // clase interna para manejar eventos de botón
    private class ManejadorBoton implements ActionListener
    {
        // maneja evento de botón
        public void actionPerformed( ActionEvent evento )
        {
            JOptionPane.showMessageDialog( Tema_11_8_A.this, String.format("Usted oprimio: %s", evento.getActionCommand() ) );
        } // fin del método actionPerformed
    }// fin de la clase interna privada ManejadorBoton
}// fin de la clase MarcoBoton