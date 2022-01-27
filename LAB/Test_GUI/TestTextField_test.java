package Test;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyApp extends JFrame {
    JButton btn;
    MyApp() {
        setTitle("My First GUI App");   // Tittle 지정
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Frame의 x 누르면 code 종료
        setSize(500,500);

        Container cp = getContentPane();  // ContentPane을 받아온다
        cp.setLayout(new FlowLayout()); // ContentPane의 Layout Manager를 FlowLayout 설정 , 위치를 설정해줄 수 있게 하는 부분

        JTextField tf = new JTextField(20);
        tf.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println(tf.getText());
            }
        });
        cp.add(tf); // 생성한 JTextField을 ContentPane에 추가
    }

    public static void main(String[]  args) {
        new MyApp().setVisible(true);
    }
}
