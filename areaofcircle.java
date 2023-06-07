import java.util.Scanner;
class areaofcircle {
    public static void main(String[] args) 
        {
            int r;
           double pi=3.14 ,area;
           Scanner s = new Scanner(System.in);
           System.out.println("enter the radius of circle");
           r=s.nextInt();
           area= pi * r * r;
           System.out.println("area of cicle : " +area); 
        }
                   }