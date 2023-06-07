class communityMember
{
  String name;
  String address;
  String contact;
  String date_of_join;
  void setInfo(String name, String address, String contact,String date_of_join)
 {
  this.name=name;
  this.address=address;
  this.contact=contact;
  this.date_of_join= date_of_join;
 }
 String getName()
 {
  return name;
 }
String getAddress()
 {
  return address;
 }
String getContact()
 {
  return contact;
 }
String getDate_of_join()
 {
  return date_of_join;
 }
}
class Employee extends communityMember
{
 String qualification;
 void setQualifications(String qualification)
 {
     this.qualification=qualification;
 }
  String getQualifications()
{
 return qualification;
}
}
 class Students extends communityMember
{
 String qualification;
 void setQualifications(String qualification)
 {
     this.qualification=qualification;
 }
  String getQualifications()
{
 return qualification;
}
}
class progs53
{
  public static void main(String args[])
{
  Employee E= new Employee();
  E.setInfo("prachi","udainagar","6262768150","15jun");
  String N=E.getName();
  String A=E.getAddress();
  String C=E.getContact();
  String D=E.getDate_of_join();
  E.setQualifications("BCA");
  String Q= E.getQualifications();
  System.out.println("\n Qualificatin :"+Q+"\n Name:"+N+"\n Address:"+A+"\n Contact:"+C+"\ndate:"+D);
  Students S=new Students();
  S.setInfo("aryan","udainagar","9756768150","20july");
  String NA=S.getName();
  String AA=S.getAddress();
  String CA=S.getContact();
  String DA=S.getDate_of_join();
  S.setQualifications("MCA");
  String QA= S.getQualifications();
  System.out.println("\n Qualificatin :"+QA+"\n Name:"+NA+"\n Address:"+AA+"\n Contact:"+CA+"\ndate:"+DA);

}
}
