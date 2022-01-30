package Test;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Vector;

public class MyApp extends JFrame {
    Vector<Shape> Figure_info = new Vector<Shape> ();

    int start_x, start_y, end_x, end_y;
    String type = "";

    class Shape{

        int start_x, start_y, end_x, end_y;
        String type = "";

        Shape(){

        }
        Shape(String type, int start_x, int start_y, int end_x, int end_y){
            this.type = type;
            this.start_x = start_x;
            this.start_y = start_y;
            this.end_x = end_x;
            this.end_y = end_y;
        }
        void setType(String type){
            this.type = type;
        }
        void setStart_x(int start_x){
            this.start_x = start_x;
        }
        void setStart_y(int start_y){
            this.start_y = start_y;
        }
        void setEnd_x(int end_x){
            this.end_x = end_x;
        }
        void setEnd_y(int end_y){
            this.end_y = end_y;
        }
    }
    MyApp() {
        setTitle("My First GUI App");   // Tittle 지정
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Frame의 x 누르면 code 종료
        //setSize(500,500);

        Container cp = getContentPane();  // ContentPane을 받아온다
        cp.setLayout(null);

        cp.add(new ToolPanel());
        cp.add(new DrawPanel());

        cp.setPreferredSize(new Dimension(1400, 1000));
        pack();
    }
    class ToolPanel extends JPanel{
        ToolPanel(){
            setBounds(0, 0, 500, 1000);

            setLayout(new GridLayout(3,1));
            JButton btn1 = new JButton((new ImageIcon("D:/자바 특강 2022.01/src/Test/원.jpg")));
            JButton btn2 = new JButton(new ImageIcon("D:/자바 특강 2022.01/src/Test/사각형.jpg"));
            JButton btn3 = new JButton(new ImageIcon("D:/자바 특강 2022.01/src/Test/선.jpg"));
            btn1.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent e) {
                    type = "원";
                }
            });
            btn2.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent e) {
                    type = "사각형";
                }
            });
            btn3.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent e) {
                    type = "선";
                }
            });
            add(btn1);
            add(btn2);
            add(btn3);

        }
    }
    class DrawPanel extends JPanel{
        DrawPanel() {
            start_x = start_y = end_x = end_y = 0;
            setBounds(500, 0, 900, 1000);
            setBackground(Color.WHITE);
            addMouseListener(new MyMouseListener());
            addMouseMotionListener(new MyMouseListener());
        }
        public void paintComponent(Graphics g){
            super.paintComponent(g);
            System.out.println(Figure_info.size());
            for(int i = 0; i < Figure_info.size(); i += 1){
                String a = Figure_info.get(i).type;
                if(a == "사각형"){
                    g.drawRect(Figure_info.get(i).start_x, Figure_info.get(i).start_y, Math.abs(Figure_info.get(i).start_x - Figure_info.get(i).end_x), Math.abs(Figure_info.get(i).end_y - Figure_info.get(i).start_y));
                }
                else if(a == "원"){
                    g.drawOval(Figure_info.get(i).start_x, Figure_info.get(i).start_y, Math.abs(Figure_info.get(i).start_x - Figure_info.get(i).end_x), Math.abs(Figure_info.get(i).end_y - Figure_info.get(i).start_y));
                }
                else if(a == "선"){
                    g.drawLine(Figure_info.get(i).start_x, Figure_info.get(i).start_y, Figure_info.get(i).end_x, Figure_info.get(i).end_y);
                }
            }
        }
    }

    class MyMouseListener extends MouseAdapter{
        public void mousePressed(MouseEvent e){
            setStartPoint(e.getX(),e.getY());
        }
        public void mouseReleased(MouseEvent e){
            setEndPoint(e.getX(),e.getY());
            if((type == "원") || (type == "사각형") || (type == "선")){
                Shape s = new Shape();
                s.setType(type);
                s.setStart_x(start_x);
                s.setStart_y(start_y);
                s.setEnd_x(end_x);
                s.setEnd_y(end_y);
                Figure_info.add(s);
            }
            repaint();
        }
        public void mouseDragged(MouseEvent e){
            setEndPoint(e.getX(),e.getY());
            repaint();
        }
    }
    public void setStartPoint(int start_x, int start_y){
        this.start_x = start_x;
        this.start_y = start_y;
    }
    public void setEndPoint(int end_x, int end_y){
        this.end_x = end_x;
        this.end_y = end_y;
    }
    public static void main(String[]  args) {
        new MyApp().setVisible(true);
    }
}
