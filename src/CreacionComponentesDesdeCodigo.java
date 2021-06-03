import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CreacionComponentesDesdeCodigo extends JFrame implements ActionListener {
    private JMenuBar mb1;
    private JMenu mnuControles;
    private JMenu mnuTamaño;
    private JMenu mnuColor;
    private JMenuItem mnuItmBajaRes;
    private JMenuItem mnuItmAltaRes;
    private JMenuItem mnuItmVerde;
    private JMenuItem mnuItmRojo;

    public CreacionComponentesDesdeCodigo() {
        mb1=new JMenuBar();
        mnuControles=new JMenu("Controles");
        mnuTamaño=new JMenu();
        mnuColor=new JMenu();
        mnuItmAltaRes=new JMenuItem();
        mnuItmBajaRes=new JMenuItem();
        mnuItmVerde=new JMenuItem();
        mnuItmRojo=new JMenuItem();

        setJMenuBar(mb1);
        mb1.add(mnuControles);
        mnuControles.add(mnuColor);
        mnuControles.add(mnuTamaño);
        mnuColor.add(mnuItmRojo);
        mnuColor.add(mnuItmVerde);
        mnuTamaño.add(mnuItmAltaRes);
        mnuTamaño.add(mnuItmBajaRes);

        mnuItmAltaRes.addActionListener(this);
        mnuItmBajaRes.addActionListener(this);
        mnuItmRojo.addActionListener(this);
        mnuItmVerde.addActionListener(this);

        mnuColor.setText("Colores");
        mnuTamaño.setText("Tamaño de la ventana");
        mnuItmRojo.setText("Rojo");
        mnuItmVerde.setText("Verde");
        mnuItmBajaRes.setText("Bajar resolucion");
        mnuItmAltaRes.setText("Máxima resolucion");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==mnuItmRojo){
            getContentPane().setBackground(Color.red);
        }
        if (e.getSource()==mnuItmVerde){
            getContentPane().setBackground(Color.green);
        }
        if (e.getSource()==mnuItmAltaRes){
            this.setSize(2000,2000);
        }
        if (e.getSource()==mnuItmBajaRes){
            this.setSize(400,400);
        }
    }

    public static void main(String[] args) {
        CreacionComponentesDesdeCodigo frame=new CreacionComponentesDesdeCodigo();
        frame.setTitle("Creación a partir de codigo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(300,300,300,300);
        frame.setVisible(true);
    }


}
