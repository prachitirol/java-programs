import java.util.Scanner;
class largestsmallestnum{
public static void main(String args[]){




  int counter = 0;
        int number = 0;
        int largest = 0;
        int smallest = 0;

        while (counter < 5) {
            counter++;
            System.out.println("Enter the number");
            Scanner sc=new Scanner(System.in);
            number = sc.nextInt();

            if (number > largest) {
                largest = number;
            } else if (number < largest) {
                smallest = number;
            }
            System.out.println("largest number is: " + largest);
            System.out.println("smallest number is: " + smallest);
        }
     }  
  }