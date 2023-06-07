import java .util.Scanner;
class exam{
public  static void main (String args[])
 {
float eng, phy, chem, maths, hindi;
double Total,average, Percentage;
Scanner T = new Scanner (System.in);
System.out.println ("Enter the marks of english");
eng=T. nextFloat();
System.out .println ("Enter the marks of phy");
phy=T. nextFloat();
System.out.println("Enter the marks of chem");
chem=T. nextFloat();
System.out.println ("Enter the marks of maths");
maths=T. nextFloat();
System.out.println ("Enter the marks of hindi");
hindi=T. nextFloat();
Total = eng+ phy+chem+maths+hindi;
average= (Total/5.0);
Percentage = (Total/ 500.0) * 100;
System.out.println("Tolal marks = "  +Total);
 System.out.println ("average marks=" + average); 
System.out.println (" Percentage = " +Percentage);
}
}