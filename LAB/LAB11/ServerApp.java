import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerApp {
    /* constructor */
    ServerApp(){
        try{
            ServerSocket serv = new ServerSocket(50000);  //ServerSocket 생성, 포트번호와 함께
            Socket sock = serv.accept(); // Client가 올 때까지 기다린다. Client가 와야 다음 코드로 진행.

            BufferedReader in = new BufferedReader(new InputStreamReader(sock.getInputStream()));   // 바이트씩 읽어오는 것이 아닌 한 글자를 읽어오기 위해 InputStreamReader 사용
            BufferedWriter out = new BufferedWriter(new OutputStreamWriter(sock.getOutputStream())); // Buffer는 한 줄 씩 읽어오기 위해  사용. 없으면 한 글자씩 밖에 읽어오게 됨

            Scanner sc = new Scanner(System.in);
            String s;
            while( (s = in.readLine()) != null ){
                System.out.println(s); // 한 줄씩 읽어오기 위해
                out.write(sc.nextLine() + "\n");
                out.flush();
            }

            sock.close(); // socket을 닫아준다
            serv.close(); // Server를 닫아준다
        }
        catch(IOException e){
            e.printStackTrace(); // 예외발생시 당시 호출 스택의 메서드 정보를 화면에 출력
        }


    }    public static void main(String[] args){
        new ServerApp(); // 객체를 새로 만든다
    }
}
