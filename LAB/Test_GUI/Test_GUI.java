package Test;

import javax.swing.*;
import java.awt.*;

class MyFrame extends JFrame{
    MyFrame(){
        setTitle("첫 번째 프레임");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // Frame의 x 표시를 누르면 code 종료
        //setSize(500, 500);

        Container cp = getContentPane();
        cp.setLayout(null);

        cp.add(new ToolPanel());
        cp.add(new DrawPanel());

        cp.setPreferredSize(new Dimension(600, 500)); //title 바 높이를 빼고 설정할 때
        pack(); //
        setResizable(true); // 사용자가 크기 조정 가능하게 한다 , false : 불가능
        setVisible(true);  // 화면에 보여줄 수 있게 한다
    }
    class ToolPanel extends JPanel{
        ToolPanel(){
            setBackground(Color.RED);
            setBounds(0,0,100,500); // 크기와 위치를 한번에 설정해주는 함수

            setLayout(new GridLayout(3,1));
            add(new JButton("원"));
            add(new JLabel(new ImageIcon("D:/자바 특강 2022.01/src/Test/test.jpg")));  // Label에 그림 넣는 법
            add(new TextField(10));
        }
    }
    class DrawPanel extends JPanel{
        DrawPanel(){
            setBackground(Color.YELLOW);
            setBounds(100,0,500,500);
        }
    }
}
public class test4 {
    public static void main(String[] args){
        new MyFrame();
    }
}
