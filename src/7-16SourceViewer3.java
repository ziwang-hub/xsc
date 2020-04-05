import java.io.*;
import java.net.*;

public class SourceViewer3 {

  public static void main (String[] args) {
      try {
        // Open the URLConnection for reading
        URL u = new URL("http://www.oreilly.com");
        HttpURLConnection uc = (HttpURLConnection) u.openConnection();
        int code = uc.getResponseCode();
        String response = uc.getResponseMessage();
        System.out.println("HTTP/1.x " + code + " " + response);
        try (InputStream in = new BufferedInputStream(uc.getInputStream())) {       
          // chain the InputStream to a Reader
          Reader r = new InputStreamReader(in);
          int c;
          while ((c = r.read()) != -1) {
            System.out.print((char) c);
          }
        }
      } catch (Exception ex) {
        System.err.println(args[0] + " is not a parseable URL");
      } 
    } 
}