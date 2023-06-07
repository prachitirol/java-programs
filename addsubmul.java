import java.util.Scanner;
class addsubmul{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
float a,b ,add,sub,mul;
System.out.println("Enter the number of a");
a=sc.nextFloat();
System.out.println("Enter the number of b");
b=sc.nextFloat();
add=a+b;
System.out.println("add of number" +add);
sub=a-b;
System.out.println("sub of number" +sub);
mul=a*b;
System.out.println("mul of number" +mul);
}

}