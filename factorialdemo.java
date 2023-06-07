import java.util.Scanner;
class factorialdemo{
public static void main (String args[]){

int i,fact=1;
int num;
Scanner s= new Scanner(System.in);
System.out.println("Enter the num:");
num=s.nextInt();
 for(i=1;i<=100;i++){
fact=fact * i;
System.out.println("factorial num:");
}
}

}