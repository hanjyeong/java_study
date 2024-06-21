package Ex_0603;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuEventEx extends JFrame {

    JLabel imgLabel = new JLabel();

    MenuEventEx(){
        setTitle("[한지형] 메뉴 이벤트 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 윈도우 창 종료시 프로세스 종료
        setSize(300,300);
        createMenu(); // 메뉴 생성하기

        Container cp = getContentPane(); // 프레임의 컨테이너 팬 영역 얻어오기
        cp.add(imgLabel, BorderLayout.CENTER); // 이미지 센터에 부착하기

        setVisible(true); // 컴포넌트 표시
    }
    // 메뉴 생성하는 함수
    void createMenu(){
        JMenuBar mb = new JMenuBar(); // 메뉴 바 생성
        JMenu screenMenu = new JMenu("Screen"); //  메뉴 요소 생성

        JMenuItem[] menuItem = new JMenuItem[4]; // 메뉴 아이템 생성
        String[] itemTitle = {"Load", "Hide", "ReShow", "Exit"};

        MenuAction listener = new MenuAction(); // 메뉴 아이템에 Action 리스너 등록하기
        for(int i=0;i<menuItem.length;i++){
            menuItem[i] = new JMenuItem(itemTitle[i]); // 문자열이 있는 메뉴 아이템 생성하기
            menuItem[i].addActionListener(listener);  // 액션 리스너 등록하기
            screenMenu.add(menuItem[i]); // 메뉴 요소에 메뉴 아이템 부착하기
        }

        mb.add(screenMenu); // 메뉴 요소를 메뉴 바에 부착하기
        setJMenuBar(mb); // 메뉴 바 세팅 완료
    }

    class MenuAction implements ActionListener{

        // 메뉴 아이템에 이벤트가 발생했을 경우 호출될 메서드
        @Override
        public void actionPerformed(ActionEvent e) {
            String cmd = e.getActionCommand(); // 사용자가 선택한 메뉴 아이템의 문자열 리턴

            switch (cmd){
                case "Load":
                    if(imgLabel.getIcon() != null){return;} // 이미 로딩이 되었으면 리턴
                    imgLabel.setIcon(new ImageIcon("images/img0.jpg"));
                    break;
                case "Hide":
                    imgLabel.setVisible(false);
                    break;
                case "ReShow":
                    imgLabel.setVisible(true);
                    break;
                case"Exit":
                    System.exit(0);
                    break;
            }
        }
    }

    public static void main(String[] args) {
        new MenuEventEx();
    }
}

