import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ArraysComponentes {
    private JPanel pnlBase;
    private JPanel pnlMaestro;
    private JPanel pnlDetalle;
    private JComboBox cmbGeneraciones;
    private JComboBox[] arrayCheckBoxGeneraciones;


    public ArraysComponentes() {
        pnlDetalle.setLayout(new GridLayout(10,1));
        arrayCheckBoxGeneraciones=new JComboBox[10];

        cmbGeneraciones.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pnlDetalle.removeAll();
                switch (cmbGeneraciones.getSelectedIndex()+1){
                    case 1:
                        dibujarPanelDetalle(1);
                        break;
                    case 2:
                        dibujarPanelDetalle(2);
                        break;
                }
                pnlDetalle.doLayout();
            }
        });

    }
    public void dibujarPanelDetalle(int generacion){
        for (int i=0;i<=arrayCheckBoxGeneraciones.length;i++){
            JCheckBox comprobar=new JCheckBox();
            comprobar.setText("Generacion X -"+generacion+" Pokemon Y "+i);
            pnlDetalle.add(comprobar);
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("ArraysComponentes");
        frame.setContentPane(new ArraysComponentes().pnlBase);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(854,480,854,480);
        frame.setVisible(true);
    }
}
