
public class progs69 {
 public static void main(String[] args) {
 try {
 
 String s="1 2345"; //string pool area
 int number=Integer.parseInt(s);
 System.out.println(number);
 } catch (NumberFormatException e) {
 System.out.println("Number format exception caught");
 }
 }
}