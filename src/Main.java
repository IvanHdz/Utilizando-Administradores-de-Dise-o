
import javax.swing.JFrame;

/**
 *
 * @author Viruz
 */
public class Main {

    public static void main(String[] args) {
        AdminDiseño ventana = new AdminDiseño();
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Ventana v = new Ventana();
        v.setVisible(true);
    }
}
