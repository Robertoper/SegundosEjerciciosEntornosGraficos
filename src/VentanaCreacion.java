import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class VentanaCreacion extends JDialog {
    private JPanel pnlBase;
    private JLabel iblNombrePersonaje;
    private JButton btnCrearPersonaje;
    private JTextField txtNombrePersoje;

    public VentanaCreacion(ArrayList<String> listaPersonajes){
        setTitle("Ventana Creacion Personajes");
        setContentPane(pnlBase);
        setBounds(100,100,400,100);
        setVisible(true);
        btnCrearPersonaje.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                listaPersonajes.add(txtNombrePersoje.getText());
                JOptionPane.showMessageDialog(null,"Personaje "+txtNombrePersoje.getText()+" creado perfectamente");
            }
        });
    }
}
