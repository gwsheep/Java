package network;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;


public class SocketCloseUtil {

    public static void closeAll(Socket socket, InputStream input, OutputStream output) {
        cloase(input);
        close(output);
        close(socket);
    }

    public static void close(Socket socket) {
        if(socket != null) {
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void close(OutputStream output) {
        if(output != null) {
            try {
                output.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void cloase(InputStream input) {
        if(input != null) {
            try {
                input.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


}
