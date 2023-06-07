public class Thread {
public static void main(String args[]) { Thread t = Thread.currentThread(); System.out.println("Main thread: " + t); t.setName("current"); System.out.println("Current thread: " + t); try {
for (int i = 1; i <= 5; i++) {
 System.out.println(i); Thread.sleep(10);
}
} catch (InterruptedException e) 
{
 System.out.println("Main thread is interrupted");
}
System.out.println("Exiting the Main thread");
}
}
