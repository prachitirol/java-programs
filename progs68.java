
public class progs68 {
 public static void main(String[] args) {
 try
 {
 String ptr=null;
 if(ptr.equals("hello"))
 System.out.println(ptr);
 }
 catch(NullPointerException e)
 {
 System.out.println("null pointer exception caught");
 }
 }
}