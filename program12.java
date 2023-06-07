import java.util.Scanner;
class swapNumber
{
 public static void main( String args[])
 {
  Scanner sc= new Scanner(System.in);
  System.out.println("enter number first");
  int a = sc.nextInt();
  System.out.println("enter number second");
  int b = sc.nextInt();
  System.out.println("before swapping number"+a );
System.out.println("before swapping number" +b);
  int temp;
  temp = a;
  a = b;
  b = temp;
  System.out.println("after swapping number"+a);
  System.out.println("before swapping number" +b);
   }}
