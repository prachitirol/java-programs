import java.util.Scanner;
interface vehicle{
 void getColor(String c);
 void getNumber(int num);
 double getConsumption(float totalDistance,float average);

}
 class TwoWheeler implements vehicle{
 String color;
 int number;
 public void getColor( String c){
 color=c;
} 
public void getNumber(int num){
 number=num;
}
 public double getConsumption(float totalDistance,float average){
 return (totalDistance/average);
}
 public void showDetails(){
System.out.println("Number : " +number);
System.out.println("Color : " +color);

}
}

class FourWheeler implements vehicle{
 String color;
 int number;
 public void getColor( String c){
 color=c;
} 
public void getNumber(int num){
 number=num;
}
 public double getConsumption(float totalDistance,float average){
 return (totalDistance/average);
}
 public void showDetails(){
System.out.println("Number : " +number);
System.out.println("Color : " +color);

}
}
class progs61{
public static void main(String args[]){
Scanner in = new Scanner(System.in);
TwoWheeler obj = new TwoWheeler();
System.out.println(">>two wheeler vehicle");
System.out.println("Color : ");
String color = in.nextLine();
obj.getColor(color);
System.out.println("Number : ");
int num = in.nextInt();
obj.getNumber(num);
System.out.println("total distance travelled (in km) : ");
float distance = in.nextFloat();
System.out.println("Average of vehicle(in km/hr) : ");
float average = in.nextFloat();
System.out.println("vehicle details ");
obj.showDetails();
double fuelconsumed = obj.getConsumption(distance,average);
System.out.println("fuel consumed (in litre): " +fuelconsumed);


}



}



