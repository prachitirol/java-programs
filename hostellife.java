interface StudentFee
{
 double getAmount();
 String getFirstName();
 String getLastName();
 String getAddress();
 String getContact();
}
 class Hostler implements StudentFee
{
  String firstName;
  String lastName;
  String address;
  String contact;
  double amount;

 void setData(String firstName,String lastName,String address,String contact,double amount)
  {
     this.firstName=firstName;
     this.lastName=lastName;
     this.address=address;
     this.contact=contact;
    this.amount=amount;
  }
public String getFirstName()
  {
    return firstName;
  }
public String getLastName() 
 {
    return lastName;
 } 
public String getAddress() 
 {
    return address;
 }
public String getContact() 
 {
    return contact;
 }  
public double getAmount() 
 {
    return amount;
 }
    
}
class NonHostler implements StudentFee
{
  String firstName;
  String lastName;
  String address;
  String contact;
  double amount;

 void setData(String firstName,String lastName,String address,String contact,double amount)
  {
     this.firstName=firstName;
     this.lastName=lastName;
     this.address=address;
     this.contact=contact;
    this.amount=amount;
  }
public String getFirstName()
  {
    return firstName;
  }
public String getLastName() 
  {
    return lastName;
 } 
public String getAddress() 
 {
    return address;
 }
public String getContact() 
 {
    return contact;
 }
public double getAmount() 
 {
    return amount;
 }
    
}
class hostellife
{
  public static void main(String args[])
{
 Hostler H=new Hostler();
 H.setData("Prachi ","Tirole","Indore","6265678432",(20000+45000));
 NonHostler NH= new NonHostler();
 NH.setData("aayushi","tirole","Indore","9753897632",45000);
 System.out.println("Hostler name is "+H.getFirstName());
 System.out.println("Hostler last name is "+H.getLastName());
 System.out.println("Hostler address is "+H.getAddress());
 System.out.println("Hoster contact number is "+H.getContact());
 System.out.println("Hostler fee is"+H.getAmount());
 System.out.println("Non Hostler name is "+NH.getFirstName());
 System.out.println("Non Hostler last name is "+NH.getLastName());
 System.out.println("Non Hostler address is "+NH.getAddress());
 System.out.println("Non Hoster contact number is "+NH.getContact());
 System.out.println("Non Hostler fee is"+NH.getAmount()); 
}
} 
