package Test;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MyApp extends JFrame {
    JButton btn;
    MyApp() {
        setTitle("My First GUI App");   // Tittle 지정
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Frame의 x 누르면 code 종료
        setSize(500,500);

        Container cp = getContentPane();  // ContentPane을 받아온다
        cp.setLayout(new FlowLayout()); // ContentPane의 Layout Manager를 FlowLayout 설정 , 위치를 설정해줄 수 있게 하는 부분

        btn = new JButton("First Button");
        btn.addMouseListener(new MyMouseListner());

        cp.add(btn); // 생성한 Panel을 ContentPane에 추가
    }

    class MyMouseListner extends MouseAdapter {  //나만의 MyMouseListner 생성
        public void mouseEntered(MouseEvent e) {
            btn.setBackground(Color.RED);
        }
        public void mouseExited(MouseEvent e) {
            btn.setBackground(Color.BLUE);
        }
    }
    public static void main(String[]  args) {
        new MyApp().setVisible(true);
    }
}
