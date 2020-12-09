package port_scan;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;

public class port_scan {
    public static void main(String[] args) throws Exception {
        String host = "192.168.1.1";
        InetAddress inetAddress = InetAddress.getByName(host);

        String hostName = inetAddress.getHostName();
        for (int port = 1; port <= 80; port++) {
            try {
                Socket socket = new Socket(hostName, port);
                String text = hostName + " is listening on port " + port;
                System.out.println(text);
                socket.close();
            } catch (IOException e) {
                // empty catch block
            	System.out.println(port);
            	//break;
            }
        }
    }
}