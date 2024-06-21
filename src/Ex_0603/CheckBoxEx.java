package Ex_0603;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class CheckBoxEx extends JFrame {

    JCheckBox[] fruits = new JCheckBox[3]; // 체크 박스 배열
    String[] names = {"사과", "배", "체리"}; // 체크 박스 문자열로 사용할 배열

    JLabel sumLabel; // 계산의 합을 출력할 레이블

    CheckBoxEx(){

        setTitle("체크 박스 예제");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(250,200);

        Container cp = getContentPane();
        cp.setLayout(new FlowLayout());

        // 라벨을 만든다
       cp.add( new JLabel("사과 100원, 배 500원, 체리는 1000원")) ;

       // 체크 박스 생성하고 컨텐트 팬에 삽입, Item리스너 등록하기
        MyItemListener listener = new MyItemListener();
        for(int i=0;i<fruits.length;i++){
            fruits[i] = new JCheckBox(names[i]); // names의 문자열로 체크 박스 생성하기
            fruits[i].setBorderPainted(true); // 체크 박스의 외곽선이 보이도록 설정
            cp.add(fruits[i]); // 컨텐트 팬에 삽입하기

            fruits[i].addItemListener(listener); // 체크 박스 Item리스너 등록하기
        }

        // sumLabel 부착하기
        sumLabel = new JLabel("현재 0원 입니다");
        cp.add(sumLabel);


        setVisible(true);
    }

    class MyItemListener implements ItemListener{

        int sum=0; // 가격의 합
        @Override
        public void itemStateChanged(ItemEvent e) {
            // 체크 박스가 눌렸을때 호출될 메서드
            if(e.getStateChange()==ItemEvent.SELECTED){ // 체크 박스가 선택된 경우
                if(e.getItem()==fruits[0]){ // 사과를 선택한 경우
                    sum+=100;
                }
                else if(e.getItem()==fruits[1]){ // 배를 선택한 경우
                    sum+=500;
                }
                else{
                    //체리를 선택한 경우
                    sum+=1000;
                }
            }
            else{ // 체크 박스를 해제한 경우
                if(e.getItem()==fruits[0]){ // 사과를 해제한 경우
                    sum-=100;
                }
                else if(e.getItem()==fruits[1]){ // 배를 해제한 경우
                    sum-=500;
                }
                else{
                    //체리를 해제한 경우
                    sum-=1000;
                }
            }
            sumLabel.setText("현재 " + sum + "원 입니다"); // 합 출력
        }
    }

    public static void main(String[] args) {
        new CheckBoxEx();
    }
}
