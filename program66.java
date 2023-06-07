import java.util.Scanner;
class program66{
public static void main(String args[]){
   try
       {int a,b;
Scanner D= new Scanner (System.in);
System.out.println("Enter the value of a");
a = D.nextInt();
System.out.println("Enter the value of b");
b = D.nextInt();
int c =a/b;
System.out.println("Enter the result" +c);}

catch(ArithmeticException e){
System.out.println("Error" +e);}


System.out.println("End of the program..");
} 
}