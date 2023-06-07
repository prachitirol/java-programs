import java.util.Scanner; 
class program67
{
 public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
 int arr[]={2,3,4,6,9,0,5,7,9,10,8};

try{
int a,b;
System.out.println("Enter the value of a");
a = sc.nextInt();
System.out.println("Enter the value of b");
b = sc.nextInt();
int c =a/b;
System.out.println("Enter the result" +c);
 System.out.print("Enter the no. : ");
int y =sc.nextInt ();
System.out.println("Enter the no. "+y+ " is valid"  +arr[y]);
}
 catch(ArrayIndexOutOfBoundsException e){

System.out.println(" Invalid"); 
System.out.println(e);}
catch(ArithmeticException e){
System.out.println("Error" +e);}

} 
}