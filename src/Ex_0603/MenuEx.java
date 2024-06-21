package Ex_0603;

import javax.swing.*;

public class MenuEx extends JFrame {
    MenuEx(){
        setTitle("메뉴 만들기 ");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(250,200);

        createMenu(); //  메뉴를 생성, 프레임에 삽입

        setVisible(true);
    }

    void createMenu(){

        //1. 메뉴 바 생성하기
        JMenuBar mb = new JMenuBar();
        //2. JMenu 요소들 생성하기
        JMenu screenMenu = new JMenu("Screen");
        //3. JMenu에 JMenuItem 생성하기
        screenMenu.add(new JMenuItem("load"));
        screenMenu.add(new JMenuItem("hide"));
        screenMenu.add(new JMenuItem("reshow"));
        screenMenu.addSeparator(); // 분리선 만들기
        screenMenu.add(new JMenuItem("exit"));

        mb.add(screenMenu);
        mb.add(new JMenu("Edit"));
        mb.add(new JMenu("source"));
        mb.add(new JMenu("project"));


        //4. 메뉴바를 프레임에 부착하기
        setJMenuBar(mb);
    }

    public static void main(String[] args) {
        new MenuEx();
    }
}
