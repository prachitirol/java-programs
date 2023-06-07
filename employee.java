public class Employee {
 String firstname;
 String lastname;
 double salary;
 double yearlysalary;
 //default constructor
 Employee()
 {
 firstname="robert";
 lastname="pattinson";
 salary=80000;
 yearlysalary=salary*12;
 }
 //getters
 public String getfirstname()
 {
 return firstname;
 }
 public String getlastname()
 {
 return this.lastname;
 }
 public Double getsalary()
 {
 return this.salary;
 }
 public Double getyearlysalary()
 {
 return this.yearlysalary;
 }
 //setters
 public void setfirstname(String s)
 {
 this.firstname=s;
 }
 public void setlastname(String s)
 {
 this.lastname=s;
 }
 public void setsalary(double s)
 {
 this.salary=s;
 }
 //yearly salary raise
 public Double raisesalary()
 {
 Double newsalary=(10*yearlysalary)/100+yearlysalary;
 yearlysalary=newsalary;
 return yearlysalary;
 }
 public static void main(String[] args) {
 Employee e1=new Employee();
 Employee e2=new Employee();
 e2.raisesalary();
 System.out.println(e1.getfirstname() + " " + e1.getlastname() + " " + e1.getsalary());
 System.out.println("yearly salary of e2: "+ e2.getyearlysalary());
 System.out.println("raised slary of e2 : "+e2.raisesalary());
 }
}
