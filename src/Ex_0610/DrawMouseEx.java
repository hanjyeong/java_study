package Ex_0610;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Vector;

public class DrawMouseEx extends JFrame {
    Vector<Point> vStart = new Vector<>();
    Vector<Point> vEnd = new Vector<>();
    Color c = new Color(0, 0, 255); // 초기 색상은 블루

    DrawMouseEx() {
        setTitle("한지형 마우스로 타원그리기");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(new MyPanel());
        setSize(300, 400);
        createMenu();
        setVisible(true);
    }

    void createMenu() {
        JMenuBar mb = new JMenuBar();
        JMenu clearMenu = new JMenu("Clear");
        JMenuItem clearItem = new JMenuItem("clear");

        JMenu colorMenu = new JMenu("Color");
        String[] itemTitle = {"Red", "Blue", "Green"};
        JMenuItem[] colorItem = new JMenuItem[itemTitle.length];

        for (int i = 0; i < colorItem.length; i++) {
            colorItem[i] = new JMenuItem(itemTitle[i]);
            colorItem[i].addActionListener(new MyAction());
            colorMenu.add(colorItem[i]);
        }

        clearItem.addActionListener(new MyAction());
        clearMenu.add(clearItem);

        mb.add(clearMenu);
        mb.add(colorMenu);

        setJMenuBar(mb);
    }

    class MyAction implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String cmd = e.getActionCommand();
            switch (cmd) {
                case "clear":
                    vStart.clear();
                    vEnd.clear();
                    break;
                case "Red":
                    c = new Color(255, 0, 0);
                    break;
                case "Blue":
                    c = new Color(0, 0, 255);
                    break;
                case "Green":
                    c = new Color(0, 255, 0);
                    break;
            }
            repaint();
        }
    }

    class MyPanel extends JPanel {
        public MyPanel() {
            this.addMouseListener(new myMouse());
            this.addMouseMotionListener(new myMouse());
        }

        class myMouse extends MouseAdapter {
            Point startP = null;

            @Override
            public void mousePressed(MouseEvent e) {
                startP = e.getPoint();
            }

            @Override
            public void mouseDragged(MouseEvent e) {
                Point endP = e.getPoint();
                if (startP != null) {
                    vStart.add(startP);
                    vEnd.add(endP);
                }
                startP = endP;
                repaint();
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                startP = null;
            }
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.setColor(c);
            for (int i = 0; i < Math.min(vStart.size(), vEnd.size()); i++) {
                Point s = vStart.get(i);
                Point e = vEnd.get(i);
                g.drawLine(s.x, s.y, e.x, e.y);
            }
        }
    }

    public static void main(String[] args) {
        new DrawMouseEx();
    }
}