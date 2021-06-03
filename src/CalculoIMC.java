import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculoIMC {
    private JButton btnCalcular;
    private JTextField txtEdad;
    private JTextField txtPeso;
    private JTextField txtEstatura;
    private JTextField txtResultado;
    private JLabel iblCalcularIMC;
    private JLabel IblEdad;
    private JLabel IblPeso;
    private JLabel IblEstatura;
    private JLabel IblResultado;
    private JPanel pnlBase;



    public CalculoIMC() {
        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double peso= Double.parseDouble(txtPeso.getText());
                double estatura=Double.parseDouble(txtEstatura.getText());
                txtResultado.setText(String.valueOf(peso/(estatura*estatura)));

            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("CalculoIMC");
        frame.setContentPane(new CalculoIMC().pnlBase);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
