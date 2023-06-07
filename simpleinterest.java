import java.util.Scanner;
class simpleinterest{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
float p,r,t,si;
System.out.println("Enter the principal");
p=sc.nextFloat();
System.out.println("Enter the rate");
r=sc.nextFloat();
System.out.println("Enter the time");
t=sc.nextFloat();
si=p*r*t/100;
System.out.println("simpleinterest is:" +si);

}

}