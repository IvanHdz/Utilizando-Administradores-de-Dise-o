
/**
 *
 * @author Viruz
 */
import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class AdminDiseño extends JFrame {

    public AdminDiseño() {

        super("Viruz Blog: Administradores de Diseño");
        setSize(500, 500);
        setBackground(Color.DARK_GRAY);
        setLocation(250, 150);

        JPanel p = new JPanel();
        p.setLayout(new GridLayout(2, 2));
        p.setBorder(new javax.swing.border.MatteBorder(null));

        JPanel p1 = new JPanel();
        p1.setLayout(new FlowLayout());
        p1.add(new Button("Aceptar"));
        p1.add(new Button("Cancelar"));
        p1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        JPanel p2 = new JPanel();
        p2.setLayout(new BorderLayout());
        p2.add(new Button("Aceptar"), "North");
        Button boton1 = new Button("Cancelar");
        p2.add(boton1, BorderLayout.SOUTH);
        p2.add(new Button("Centro"), "Center");
        p2.add(new Button("Este"), "East");
        p2.add(new Button("Oeste"), "West");
        p2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        JPanel p3 = new JPanel();
        CardLayout cL = new CardLayout();
        p3.setLayout(cL);
        p3.add(new Button("Primer"), "First");
        p3.add(new Button("Centro"), "Second");
        cL.show(p3, "First");

        for (int i = 0; i < 1000000000; i++) {
            i = i + 1;
        }
        cL.next(p3);

        JPanel p4 = new JPanel();
        p4.setLayout(new GridLayout(5, 5));

        for (int i = 1; i < 26; i++) {
            p4.add(new Button("" + i));
        }

        add(p);
        p.add(p1);
        p.add(p2);
        p.add(p3);
        p.add(p4);
        setVisible(true);
    }
}
