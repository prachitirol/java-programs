public class oneThread extends Thread {
public void run()
{
System.out.println(" Bangtan "); 
try {
Thread.sleep(300);
}
catch (InterruptedException ie) {
}
System.out.println(" sunyeondan<3 ");
}
public static void main(String[] args)
{
oneThread c1 = new oneThread(); 
oneThread c2 = new oneThread(); 
c1.start();
c2.start(); 
System.out.println(c1.isAlive());
System.out.println(c2.isAlive());
}
}

