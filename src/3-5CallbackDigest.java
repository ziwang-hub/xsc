import java.io.*;
import java.security.*;

public class CallbackDigest implements Runnable {
   public static void receiveDigest(byte[] digest) {    
	   System.out.println(DatatypeConverter.printHexBinary(digest));
   }
  @Override
  public void run() {
    try {
      String filename="D://test.txt";
      FileInputStream in = new FileInputStream(filename);
      MessageDigest sha = MessageDigest.getInstance("SHA-256");
      DigestInputStream din = new DigestInputStream(in, sha);
      while (din.read() != -1) ; // read entire file
      din.close();
      byte[] digest = sha.digest();
      CallbackDigest.receiveDigest(digest);
    } catch (Exception e) {
      e.printStackTrace();;
    }
  }
  public static void main(String[] args) {	
	      CallbackDigest cb = new CallbackDigest();
	      Thread t = new Thread(cb);
	      t.start();
	  }
}