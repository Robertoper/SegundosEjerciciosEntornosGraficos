import javax.swing.*;

public class PanelesDesplazamiento {
    private JPanel pnlPanel;
    private JScrollPane scpImagen;
    private JLabel IblImagen;

    public static void main(String[] args) {
        JFrame frame = new JFrame("PanelesDesplazamiento");
        frame.setContentPane(new PanelesDesplazamiento().pnlPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(200,200,200,200);
        frame.setVisible(true);
    }
}
