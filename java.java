import javax.swing.*;
import java.awt.*;

public class Lienzo extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Convertir a Graphics2D para mejores funciones de dibujo
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(Color.BLUE);

        // Dibujar una línea de ejemplo
        g2d.drawLine(50, 50, 200, 200);

        // Dibujar una función cuadrática simple (ej. y = x^2 adaptada a píxeles)
        for (int x = 0; x < 300; x++) {
            int y = (int) (0.05 * (x - 150) * (x - 150) + 100);
            g2d.fillRect(x, y, 2, 2);
        }
    }

    public static void main(String[] args) {
        JFrame ventana = new JFrame("Gráficos en Java");
        Lienzo lienzo = new Lienzo();

        ventana.add(lienzo);
        ventana.setSize(400, 400);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setVisible(true);
    }
}
