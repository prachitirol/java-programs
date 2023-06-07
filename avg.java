import java. util.Scanner;
class avg{
   public static void main (String args[])
{
   
   Scanner x= new Scanner(System.in);
   System.out.println("enter the first number:"); 
    double a=x.nextDouble();
   System.out.println("enter the second number:"); 
   double b=x.nextDouble();
   System.out.println("enter the third number:"); 
   double c=x.nextDouble();  
   x.close();
System.out.println("enter the avg number:" +avg(a,b,c)); 
    
}
 public static double avg(double x,double y,double z)
{
return(x+y+z)/3;
}

}