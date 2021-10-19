
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.Ellipse2D;

/**
 * In dieser Klasse werden zwei Methoden zum Behandeln der Mouseklicks implementiert.
 */

public class MouseClick extends MouseAdapter {

    /**
     * Die Methode wartet auf ein Mouseklick, wenn sie woanders instanziiert wird.
     * Beim Klicken auf der Zeichenflaeche, werden die Koordinaten abgefragt und
     * die Methode paint(); gerufen, um einen Kreis an der Stelle zu zeichnen
     * @param e Mouseklick
     */
    @Override
    public void mouseClicked(MouseEvent e) {
        int x = e.getX();
        int y = e.getY();
        Canvas can2 = (Canvas) e.getSource();
        Graphics g = can2.getGraphics();

        paint(g, x, y, can2);
        int counter = e.getClickCount();
        if (counter == 2) {
            g.clearRect(0, 0, can2.getWidth(), can2.getHeight());
        }
        super.mouseClicked(e);
    }

    /**
     * Methode Paint(); zeichnet einen Kreis auf dem Canvas.
     * @param g graphics Objekt
     * @param x X-Koordinaten
     * @param y Y-Koordinaten
     * @param c Canvas zum Zeichnen
     */
    public void paint(Graphics g, int x, int y, Canvas c) {
        Ellipse2D kreis;
        kreis = new Ellipse2D.Float(x, y, 50.0f, 50.0f);
        Graphics2D g2d = (Graphics2D) g;
        g2d.draw(kreis);
    }
}

