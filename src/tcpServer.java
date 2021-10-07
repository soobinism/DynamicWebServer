import java.net.*;
import java.io.*;
import java.util.*;     // Date class

public class tcpServer {
    public static void main(String[] args) throws IOException {
        int portNumber = 8000;

        java.util.Date date = new java.util.Date();

        ServerSocket sSocket = new ServerSocket(portNumber);
        //Socket socket = sSocket.accept();

        Socket socket = new Socket();

        InetAddress inetAddress = InetAddress.getByName(null);
        SocketAddress socketAddress = new InetSocketAddress(inetAddress, portNumber);
        //socket.bind(socketAddress);

        int timeout = 10000;

        socket.connect(socketAddress, timeout);

        System.out.println("\nYour IP address is: " + socket.getInetAddress());
        System.out.println("It is now: " + date);
    }
}
