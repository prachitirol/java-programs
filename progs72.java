
public class progs72 {
 public static void main(String[] args) {
 try
 {
 String s=null;
 s.equals("world");
 }
 /* catch(Exception e)
 {
 System.out.println("super class exception caugth");
 }
 */
 catch(NullPointerException e)
 {
 System.out.println(" nullp exception caught");
 }
 catch(Exception e)
 {
 System.out.println("super class exception caught");
 }
 }
}
