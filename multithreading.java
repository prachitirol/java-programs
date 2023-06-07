class MyThread1 extends Thread {
  @Override
  public void run(){
int i=0;
 while(i<3){
System.out.println(" my thread is running");
System.out.println(" yes");
i++;
try {sleep(1000);} catch(Exception e){}
}
}
}
class MyThread2 extends Thread {
  @Override
  public void run(){
int i=0;
 while(i<5){
System.out.println(" my thread is not running");
System.out.println(" no");
i++;
try {sleep(500);} catch(Exception e){}
}
}
}
public class multithreading{

public static void main(String args[]){
MyThread1 t1 = new MyThread1();
MyThread2 t2 = new MyThread2();
t1.start();
t2.start();

}

}