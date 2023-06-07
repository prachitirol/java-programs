  class progs40
{
 String firstName;
 String lastName;
 double salary; 
   employee ()
 {
   firstName="PRACHI TIROLE";
 lastName="TIROLE";
 salary=80000;
 

  public void setFirstName( String firstName)
  {
    this.firstName=firstName;
  }
  public void setLastName(String lastName)
  {
   this.lastName=lastName;
  }
 public void setSalary( double salary)
 {  if(salary>=0)
  {   this.salary=salary;
  }
 }
  public String getFirstName()
  {
    return firstName;
  }
  
  public String getLastName()
  {
    return lastName;
  }
 public double getSalary()
 {
    return salary;
 }
}    
 public class AssignTwo2
{
  public static void main(String args[])
{
   employee E= new employee("Saloni","Jaiswal",40000);
   employee EMP= new employee("Payal","Jaiswal",50000);
   System.out.println( "first name is "+E.getFirstName());
   System.out.println( "last name is "+E.getLastName());
      double IT=E.getSalary();
   System.out.println( "Monthly salary is "+IT);
   System.out.println( "first name is "+EMP.getFirstName());
   System.out.println( "last name is "+EMP.getLastName());
   double IP=EMP.getSalary();
  System.out.println( "Monthly salary is "+IP);
  if(IT>=0)
 {
   double PERCENT=((IT/100)*1);
   PERCENT=PERCENT*10;
  System.out.println("before the salary raise"+IT);
   IT=IT+PERCENT;
  System.out.println("after salary raise the ten percent"+IT);
 
 }
 if(IP>=0)
 {
   double PERCEN=((IP/100)*1);
   PERCEN=PERCEN*10;
  System.out.println("before the salary raise"+IP);
   IP=IP+PERCEN;
  System.out.println("after salary raise the ten percent"+IP);
 
 } 
}
}