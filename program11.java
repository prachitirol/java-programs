class  sample
{
  int a;
  char c;
public void add(int a)
{
  System.out.println(a);
}
public void add(int a,char c)
  {
   System.out.println(a + " "+ c);
  }
}
public class program11
 {
 public static void main(String args[])
 {
   sample s= new sample();
   s.add(12);
   s.add(10,'A');
 }
 }
