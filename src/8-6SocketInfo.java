import java.net.*;
import java.io.*;

public class SocketInfo {

  public static void main(String[] args) {
      try {
        Socket theSocket = new Socket("www.oreilly.com", 80);
        System.out.println("Connected to " + theSocket.getInetAddress());
       System.out.println(" on port "  + theSocket.getPort());
       System.out.println("from port "+ theSocket.getLocalPort());
       System.out.println(" of " + theSocket.getLocalAddress());
      }  catch (UnknownHostException ex) {
        System.err.println("I can't find " + host);
      } catch (SocketException ex) {
        System.err.println("Could not connect to " + host);
      } catch (IOException ex) {
        System.err.println(ex);
      }
    } 
}