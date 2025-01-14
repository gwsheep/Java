package network;

import javax.sound.sampled.Port;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;


public class Client {

    private static final int PORT = 15432;

    public static void main(String[] args) throws IOException {

        try (Socket socket = new Socket("localhost", PORT);
             DataInputStream dis = new DataInputStream(socket.getInputStream());
             DataOutputStream dos = new DataOutputStream(socket.getOutputStream())) {

            Scanner sc = new Scanner(System.in);
            while (true) {
                //to 서버
                String toSend = sc.nextLine();
                dos.writeUTF(toSend);
                System.out.println("client -> server : " + toSend);
                if(toSend.equals("exit")){
                    break;
                }
                //from 서버
                String received = dis.readUTF();
                System.out.println("server -> client : " + received);

                
        } catch (IOException e) {

        }
        dis.close();
        dos.close();
        socket.close();
        System.out.println("============= 프로그램 종료 ==============");


    }

}
