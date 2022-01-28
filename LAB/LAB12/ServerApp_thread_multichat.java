import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Scanner;

public class ServerApp {
    ArrayList<BufferedWriter> out = new ArrayList<BufferedWriter>(); // BufferedWriter을 담을 수 있는 ArrayList 생성
    /* constructor */
    ServerApp(){
        try{
            ServerSocket serv = new ServerSocket(50000);  //ServerSocket 생성, 포트번호와 함께
            while(true){
                Socket sock = serv.accept(); // Client가 올 때까지 기다린다. Client가 와야 다음 코드로 진행.

                BufferedReader in = new BufferedReader(new InputStreamReader(sock.getInputStream()));   // 바이트씩 읽어오는 것이 아닌 한 글자를 읽어오기 위해 InputStreamReader 사용
                out.add(new BufferedWriter(new OutputStreamWriter(sock.getOutputStream()))); // Buffer는 한 줄 씩 읽어오기 위해  사용. 없으면 한 글자씩 밖에 읽어오게 됨

                new MyThread(in).start(); // 생성한 MyThread에 BufferedReader in을 보내주며 실행
            }
            /*
                MyThread th = new MyThread().start(); // 이렇게도 실행 시킬 수 있지만 변수 th가 생기기 때문에 위 코드를 더 선호한다.
                th.start();
             */
            /*
            Scanner sc = new Scanner(System.in);
            while(true){
                out.write(sc.nextLine() + "\n");
                out.flush();
            }
            */

            //sock.close(); // socket을 닫아준다
            //serv.close(); // Server를 닫아준다
        }
        catch(IOException e){
            e.printStackTrace(); // 예외발생시 당시 호출 스택의 메서드 정보를 화면에 출력
        }
    }
    class MyThread extends Thread{   // Client에서 언제 보낼지 모르는 문자를 받기위해
        BufferedReader in;
        MyThread(BufferedReader in){
            this.in = in;

        }
        public void run(){
            while(true){
                try{
                    String msg = in.readLine();
                    for(int i = 0; i < out.size(); i += 1){
                        out.get(i).write(msg + "\n");
                        out.get(i).flush();

                    }
                }
                catch(IOException e){
                    e.printStackTrace(); // 예외발생시 당시 호출 스택의 메서드 정보를 화면에 출력
                }

            }
        }
    }
    public static void main(String[] args){
        new ServerApp(); // 객체를 새로 만든다
    }
}
