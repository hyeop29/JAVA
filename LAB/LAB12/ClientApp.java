import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class ClientApp {
    ClientApp(){
        try{
            Socket sock = new Socket("localhost",50000); // Server의 ip주소와 port번호 입력, localhost는 나 자신

            BufferedReader in = new BufferedReader(new InputStreamReader(sock.getInputStream()));   // 바이트씩 읽어오는 것이 아닌 한 글자를 읽어오기 위해 InputStreamReader 사용
            BufferedWriter out = new BufferedWriter(new OutputStreamWriter(sock.getOutputStream()));

            Scanner sc = new Scanner(System.in);
            out.write(sc.nextLine() + "\n");
            out.flush();

            String s;
            while( (s = in.readLine()) != null ){
                System.out.println(s); // 한 줄씩 읽어오기 위해
                out.write(sc.nextLine() + "\n");
                out.flush();
            }

            sc.close();
            sock.close();
        }
        catch(IOException e){
            e.printStackTrace(); // 예외발생시 당시 호출 스택의 메서드 정보를 화면에 출력
        }
    }
    public static void main(String[] args){
        new ClientApp();
    }
}
