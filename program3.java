class program3{
public static void main(String args[]){
int x=10,y=12,a=8,b=5,c=4,largest,smallest;
smallest = x;		// set first integer as the smallest for comparison
if (y < smallest)
smallest = y;
if (a < smallest)
smallest = a;
if (b < smallest)
smallest = b;
if (c < smallest)
smallest = c;
largest = x;	
if (y > largest)
largest = y;
if (a > largest)
largest = a;
if (b > largest)
largest = b;
if (c > largest)
largest = c;
System.out.printf("Smallest integer is:%d ", smallest);	
System.out.printf("Largest integer is :%d", largest);
}

}