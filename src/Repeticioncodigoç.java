import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RepeticioncodigoĆ§ {
    private JPanel pnlBase;
    private JLabel iblCalcularIMC;
    private JLabel iblEdad;
    private JTextField txtEdad;
    private JLabel iblPeso;
    private JTextField txtPeso;
    private JLabel iblEstatura;
    private JTextField txtEstatura;
    private JButton btnCalcular;
    private JLabel iblResultado;
    private JTextField txtResultado;


    private void calcularIMC() {
        double peso= Double.parseDouble(txtPeso.getText());
        double estatura=Double.parseDouble(txtEstatura.getText());
        txtResultado.setText(String.valueOf(peso/(estatura*estatura)));
    }
    public RepeticioncodigoĆ§() {
        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcularIMC();
            }
        });
        txtEdad.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcularIMC();
            }
        });
        txtPeso.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcularIMC();
            }
        });
        txtEstatura.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcularIMC();
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("RepeticioncodigoĆ§");
        frame.setContentPane(new RepeticioncodigoĆ§().pnlBase);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
