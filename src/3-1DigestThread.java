import java.io.*;
import java.security.DigestInputStream;
import java.security.MessageDigest;
import javax.xml.bind.DatatypeConverter;
public class DigestThread extends Thread {
	  @Override
	  public void run() {
	    try {
	      String filename="D://test.txt";
	      FileInputStream in = new FileInputStream(filename);
	      MessageDigest sha = MessageDigest.getInstance("SHA-256");
	      DigestInputStream din = new DigestInputStream(in, sha);
	      while (din.read() != -1) ;
	      din.close();
	      byte[] digest = sha.digest();	      
	      filename=filename+": "+DatatypeConverter.printHexBinary(digest);
	      System.out.println(filename);
	    } catch (Exception ex) {
	      System.err.println(ex);
	    } 
	  }	  
	  public static void main(String[] args) {
	      Thread t = new DigestThread();
	      t.start();
	      System.out.println("≤‚ ‘À≥–Ú!");
	  }
}