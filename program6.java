import java.util.Scanner;
class program6
{
  public static void main(String args[])
 {
 int i,n,product=1;
 Scanner sc=new Scanner(System.in);
 System.out.println("enter the number");
 n=sc.nextInt();
 for(i=1;i<=n;i++)
  if(i%2==1)
  {
   product=product*i; 
  }
 System.out.println("the product of odd integer is"+product);
 }
}