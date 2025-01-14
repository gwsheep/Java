package network;


import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class NetworkSample {

    public static void main(String[] args) throws UnknownHostException {

        InetAddress localhost = Inet4Address.getByName("localhost");
        System.out.println(localhost);;


    }






}
