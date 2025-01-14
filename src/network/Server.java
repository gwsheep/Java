package network;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    private static final int PORT = 15432;

    public static void main(String[] args) throws IOException {

        ServerSocket serverSocket = new ServerSocket(PORT);
        Socket socket = serverSocket.accept();
        DataInputStream dis = new DataInputStream(socket.getInputStream());
        DataOutputStream dos = new DataOutputStream(socket.getOutputStream());

        while(true) {

            String received = dis.readUTF();
            System.out.println("client -> server : " + received);

            if (received.equals("exit")) {
                break;
            }

            //parsing
            String parsed = received + " edited";
            dos.writeUTF(parsed);
            System.out.println("server -> client : " + parsed);

        }

        dis.close();
        dos.close();
        socket.close();
        serverSocket.close();

        System.out.println("============= 프로그램 종료 ==============");


    }

}
