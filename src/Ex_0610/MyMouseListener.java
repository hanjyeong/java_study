package Ex_0610;

import java.awt.*;
import java.awt.event.MouseEvent;

public interface MyMouseListener {
    void mousePressd(MouseEvent e);

    void mouseDragged(MouseEvent e);

    void paintComponent(Graphics g);
}
