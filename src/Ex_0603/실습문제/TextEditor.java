package Ex_0603.실습문제;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextEditor extends JFrame {
    private JTextArea textArea;

    public TextEditor() {


        setTitle("Text Editor");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // JTextArea 만들기
        textArea = new JTextArea();
        add(new JScrollPane(textArea));

        // 메뉴바 생성하기
        JMenuBar menuBar = new JMenuBar();

        // 파일 생성하기
        JMenu fileMenu = new JMenu("File");
        menuBar.add(fileMenu);

        // Save 메노 아이템 생성하기
        JMenuItem saveItem = new JMenuItem("Save");
        fileMenu.add(saveItem);
        saveItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String input = JOptionPane.showInputDialog(TextEditor.this, "파일이름을 입력하세요");
                if (input == null) {
                    JOptionPane.showMessageDialog(TextEditor.this, "취소했습니다.", "취소", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    textArea.append(input+"\n"); // 줄바꿈

                }
            }
        });

        // Clear 아이템 생성하기
        JMenuItem clearItem = new JMenuItem("Clear");
        fileMenu.add(clearItem);
        clearItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textArea.setText("");
            }
        });


        setJMenuBar(menuBar);
        setVisible(true);
    }

    public static void main(String[] args) {
        // Ensure GUI creation is on the Event Dispatch Thread
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new TextEditor();
            }
        });
    }
}
