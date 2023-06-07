import java.util.*;
class perimeter
{
  double circlePerimeter(double r)
  {
     
    return (Math.PI *2 * r);
  }
  public static void main(String args[])
 {
   Scanner s=new Scanner(System.in);
   System.out.println("enter the radius");
   double r= s.nextDouble();
    perimeter ob =new perimeter();
    double A=ob.circlePerimeter(r) ;  
    System.out.println("area is"+A);
 }
}
