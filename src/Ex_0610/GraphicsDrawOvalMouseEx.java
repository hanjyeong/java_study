package Ex_0610;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class GraphicsDrawOvalMouseEx extends JFrame {
    GraphicsDrawOvalMouseEx() {
        setTitle("한지형 마우스로 타원그리기");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(new MyPanel());
        setSize(300,400);

        setVisible(true);
    }

    class MyPanel extends  JPanel {
        Point start = null, end = null;

        public MyPanel() {
            MyMouseListener listener = new MyMouseListener();

            // 이 패널에 마우스 리스너를 등록한다
            addMouseListener(listener);
            addMouseMotionListener(listener);
        }



        class MyMouseListener extends MouseAdapter {

            @Override
            public void mousePressed(MouseEvent e) {
                start = e.getPoint();
            }

            @Override
            public void mouseDragged(MouseEvent e) {
                end = e.getPoint();
                repaint(); // start와 end 사이의 타원을 그린다
            }
        }

            @Override
            public void paintComponent(Graphics g) {// 패널에 타원 그리기
                super.paintComponent(g);
                if(start==null)
                    return;

                g.setColor(Color.BLUE);
                int x = Math.min(start.x, end.x);
                int y = Math.min(start.y, end.y);
                int width = Math.abs(start.x - end.x);
                int height = Math.abs(start.x - end.x);

                // 타원 그리기
                g.drawOval(x,y,width,height);
            }
        }
    public static void main(String[] args) {
        new GraphicsDrawOvalMouseEx();
    }


    }


