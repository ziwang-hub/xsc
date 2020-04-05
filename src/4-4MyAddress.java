import java.net.*;

public class MyAddress {

  public static void main (String[] args) {
    try {
      InetAddress me = InetAddress.getLocalHost();
      String dottedQuad=me.getHostAddress();
      System.out.println("my address is "+dottedQuad);
    } catch (UnknownHostException ex) {
      System.out.println("Could not find this computer's address.");
    }
  }
}
