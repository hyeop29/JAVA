package Test;

import javax.swing.*;
import java.awt.*;

public class MyApp extends JFrame {
    MyApp() {
        setTitle("My First GUI App");   // Tittle 지정
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Frame의 x 누르면 code 종료
        setSize(500,500);

        Container cp = getContentPane();  // ContentPane을 받아온다
        cp.setLayout(new FlowLayout()); // ContentPane의 Layout Manager를 FlowLayout 설정 , 위치를 설정해줄 수 있게 하는 부분

        //cp.setLayout(null);  //  ContentPane의 Layout을 사용하지 않는다. 즉, 크기, 위치 수동으로 개발자가 수동으로 설정해야한다.
        //cp.setBackground(Color.RED); // ContentPane 색깔 지정

        JButton btn = new JButton("First"); // Button 생성

        //btn.setBackground(Color.YELLOW); // Button 색깔 지정
        //btn.setBounds(0, 0, 200, 100);  // Button의 위치와 크기 지정

        JLabel lb = new JLabel("First Label"); // Label 생성

        JTextField tf = new JTextField(20); // TextField 생성. 이 때 크기를 지정해준다

        JCheckBox cb = new JCheckBox("First CheckBox"); // CheckBox 생성. 이때 CheckBox의 항목도 함께 설정해준다.

        JMenuBar mbar = new JMenuBar(); // MenuBar 생성
        JMenu menu1 = new JMenu("File"); // Menu 생성. 이때 Menu의 항목도 설정해준다.
        JMenu menu2 = new JMenu("Edit");
        JMenu menu3 = new JMenu("Source");
        mbar.add(menu1); // 생성한 Menu를 MenuBar에 추가
        mbar.add(menu2);
        mbar.add(menu3);
        JMenuItem mitem1 = new JMenuItem("Open"); // MenuItem 생성
        JMenuItem mitem2 = new JMenuItem("Open"); // MenuItem 생성
        menu1.add(mitem1); // Menu에 MenuItem 추가
        menu1.add(mitem2);
        cp.add(btn); // ContentPane에 생성한 Button 추가
        cp.add(lb); // ContentPane에 생성한 Label 추가
        cp.add(tf); // ContentPane에 생성한 TextField 추가
        cp.add(cb); // ContentPane에 생성한 CheckBox 추가
        cp.add(mbar); // ContentPane에 생성한 MenuBar 추가
    }
    public static void main(String[]  args) {
        new MyApp().setVisible(true);
    }
}
