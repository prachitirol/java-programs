import java.util.Scanner;
class ifstatement{
public static void main(String args[]){


Scanner a = new Scanner(System.in);
int x,y;
System.out.println("enter the the of x :");
x = a.nextInt();
System.out.println("enter the the of y:" );
y = a.nextInt();
if(x<y)System.out.println(" x is less than y");
x=x*3;
if(x==y)System.out.println("x is equal to y :");
x=x*6;
if(x>y)System.out.println(" x is greater than y :");

}
}