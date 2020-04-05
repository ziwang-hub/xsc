import java.io.*;
import java.security.*;

public class ReturnDigest extends Thread {
  private byte[] digest;
  @Override
  public void run() {
    try {
      String filename="D://test.txt";
      FileInputStream in = new FileInputStream(filename);
      MessageDigest sha = MessageDigest.getInstance("SHA-256");
      DigestInputStream din = new DigestInputStream(in, sha);
      while (din.read() != -1) ; // read entire file
      din.close();
      digest = sha.digest();
    } catch (Exception e) {
      e.printStackTrace();
    } 
  }  
  public byte[] getDigest() {
    return digest;
  }
  public static void main(String[] args) {
	      ReturnDigest dr = new ReturnDigest();
	      dr.start();     
	      byte[] digest = dr.getDigest();
	      System.out.println(DatatypeConverter.printHexBinary(digest));
	  }
}