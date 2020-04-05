import java.net.*;

public class URISplitter {

  public static void main(String args[]) {
      try {
        URI u = new URI("http://www.xml.com/pub/a/2003/09/17/stax.html#id=_hdc");
        System.out.println("The URI is " + u);
        if (u.isOpaque()) {
          System.out.println("This is an opaque URI."); 
          System.out.println("The scheme is " + u.getScheme());        
          System.out.println("The scheme specific part is " 
              + u.getSchemeSpecificPart());        
          System.out.println("The fragment ID is " + u.getFragment());        
        } else {
          System.out.println("This is a hierarchical URI."); 
          System.out.println("The scheme is " + u.getScheme());        
          System.out.println("The path is " + u.getPath());        
          System.out.println("The query string is " + u.getQuery());        
          System.out.println("The fragment ID is " + u.getFragment()); 
        }      
      } catch (URISyntaxException ex) {
        System.err.println(" does not seem to be a URI.");
      }
   } 
}