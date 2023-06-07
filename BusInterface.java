interface fare
{
 double getAmount();
}
class bus implements fare
{
  double fare;
  double food;
  double sleeper;
 void setFare(double fare,double food,double sleeper)
 {
  this.fare=fare;
  this.food=food;
  this.sleeper=sleeper;
 }
public double getAmount()
 {
  return(fare+food+sleeper);
 }
}
class train implements fare
{
  double fare;
  double food;
  double sleeper;
 void setFare(double fare,double food,double sleeper)
 {
  this.fare=fare;
  this.food=food;
  this.sleeper=sleeper;
 }
public double getAmount()
 {
  return(fare+food+sleeper);
 }
}
public class BusInterface
{
  public static void main(String args[])
 {
   bus B=new bus();
   B.setFare(500.0,800.5,400.0);
   train T= new train();
  T.setFare(300.0,588.9,700.0);
  System.out.println("total amount by bus "+B.getAmount());
  System.out.println("total amount by train "+T.getAmount()); 
}
}
