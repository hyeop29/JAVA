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

        JCheckBox ck = new JCheckBox("First CheckBOX");
        ck.addItemListener((new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if(ck.isSelected()){
                    System.out.println("Selected");
                }
                else{
                    System.out.println("DeSelected");
                }
            }
        }));
        cp.add(ck); // 생성한 CheckBox를 ContentPane에 추가
    }

    public static void main(String[]  args) {
        new MyApp().setVisible(true);
    }
}
