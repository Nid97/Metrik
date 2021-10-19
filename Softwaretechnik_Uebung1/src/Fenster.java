
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Klasse Fenster erbt von der Klasse Frame und implementiert ein
 * Fenster mit einer grauen Flaeche zum Zeichnen (Canvas)
 * Der Canvas wird in der Mitte des Fensters mit den definierten Werten in Klasse Main positioniert.
 * Es wird noch ein MouseAdapter in einer anderen Klasse implementiert und hier instanziiert.
 */

public class Fenster extends Frame {

    public Fenster(int myWidth, int myHeight) {
        setSize(myWidth, myHeight);
        setVisible(true);
        setLayout(null);
        setTitle("Metrik V1.0.1");

        Canvas can = new Canvas();
        can.setLocation(50,50);
        can.setSize(myWidth-100, myHeight-100);
        can.setBackground(Color.lightGray);
        can.setVisible(true);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

        MouseClick ml = new MouseClick();
        can.addMouseListener(ml);
        add(can);

    }

}

