import java.util.Scanner;
class progs46
{
  public static void main(String args[])
 {
     Scanner s= new Scanner(System.in);
     System.out.println("enter first number");
     int a=s.nextInt();
     System.out.println("enter second number");
     int b=s.nextInt();
     System.out.println("enter third number");
     int c=s.nextInt();
   int sum=(a+b+c);
    System.out.println("sum is"+sum);
    int product=(a*b*c);
   System.out.println("product is "+product);
   float avg=sum/3;
   System.out.println("average is"+avg);
   if(a>b&&a>c)
   { 
      System.out.println("a is greater then b and c");
   }
  if(b>c&&b>a)
   { 
      System.out.println("b is greater then a and c");
   }
 if(c>b&&c>a)
   { 
      System.out.println("cis greater then b and a");
   }
if(a<b&&a<c)
   { 
      System.out.println("a is smaller then b and c");
   }
if(b<a&&b<c)
   { 
      System.out.println("b is smaller then a and c");
   }
if(c<a&&c<b)
   { 
      System.out.println("c is smaller then b and a");
   }
 }
}