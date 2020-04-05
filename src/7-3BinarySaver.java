import java.io.*;
import java.net.*;

public class BinarySaver {

  public static void main (String[] args) {
      try {
        URL root = new URL("https://ss0.bdstatic.com/70cFvHSh_Q1YnxGkpoWK1HF6hhy/it/u=906317755,3325414259&fm=26&gp=0.jpg");
        saveBinaryFile(root);
      } catch (Exception ex) {
        System.err.println(ex);
      }
    }

  public static void saveBinaryFile(URL u) throws IOException {
    URLConnection uc = u.openConnection();
    String contentType = uc.getContentType();
    int contentLength = uc.getContentLength();
    if (contentType.startsWith("text/") || contentLength == -1 ) {
      throw new IOException("This is not a binary file.");
    }

    try (InputStream raw = uc.getInputStream()) {
      InputStream in  = new BufferedInputStream(raw);
      byte[] data = new byte[contentLength];
      int offset = 0;
      while (offset < contentLength) {
         int bytesRead = in.read(data, offset, data.length - offset);
         if (bytesRead == -1) break;
         offset += bytesRead;
      }      
      String filename = u.getFile();
      filename = filename.substring(filename.lastIndexOf('/') + 1);
      try (FileOutputStream fout = new FileOutputStream(filename)) {
        fout.write(data);
        fout.flush();
      }
  } 
}
 }