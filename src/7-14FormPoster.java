import java.io.*;
import java.net.*;
try{
    URL u=new URL("");
    URLConnection uc = u.openConnection();
    uc.setDoOutput(true);
    OutputStream raw=uc.getOutputStream();
    OutputStream buffered=new BufferedOutputStream(raw);
    OutputStreamWriter out=new OutputStreamWriter(buffered, "UTF-8"));
    out.write("");
      out.write("\r\n");
      out.flush();
    out.close();
}catch(IOException ex){
}
