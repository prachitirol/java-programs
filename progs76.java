public class progs76 extends Thread {
 public void run()
 {
 
 }
 public static void main(String[] args) {
 Thread t1=new Thread();
 System.out.println("old priority of thread t1="+t1.getPriority());
 t1.setPriority(9);
 System.out.println("new priority of thread t1="+t1.getPriority());
 } 
}
