import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControlPasajeros {
    private int pasajeros=0;
    private JButton btnSubir;
    private JPanel panel1;
    private JButton btnBajaPasajero;
    private JButton btnReiniciar;
    private JTextField txtNumeroPasajeros;
    private JLabel IblPasajeros;


    public ControlPasajeros() {
        btnSubir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pasajeros++;
                txtNumeroPasajeros.setText(""+pasajeros);
                if (pasajeros>20){
                    txtNumeroPasajeros.setText("NUMERO MAXIMO DE PLAZAS ALCANZADO");
                }if (pasajeros>=21){
                    pasajeros=20;
                }
            }
        });
        btnBajaPasajero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pasajeros--;
                txtNumeroPasajeros.setText(""+pasajeros);
                if (pasajeros<0){
                    txtNumeroPasajeros.setText("YA NO HAY MAS PASAJEROS EN EL TRAM");
                }if (pasajeros<=-1){
                    pasajeros=0;
                }
            }
        });
        btnReiniciar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pasajeros=0;
                txtNumeroPasajeros.setText(""+pasajeros);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("ControlPasajeros");
        frame.setContentPane(new ControlPasajeros().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
