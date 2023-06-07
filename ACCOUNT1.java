class account
{
  String name;
  double balance;
 public account(String name,double balance)
{	
 this.name=name;
 if(balance>=0)
 {
 this.balance=balance;
}
}
  public void setName(String name)
 {
   this.name=name;
 }
 public String getName()
 {
   return name;
 }
  public void deposite(double Amount)
{
   if(Amount>=0)
  {
    balance=balance+Amount;
  }
}
  public double getBalance()
 {
  return balance;
 }
}

  public class ACCOUNT1
 {
  public static void main(String args[])
  {
    account A=new account("Prachi tirole",10000);
    System.out.println("before deposite total balance is :" + A.getBalance());
    A.deposite(5000.00);
    System.out.println("Account holder name is:" +A.getName());
    System.out.println("after deposite total balance is :" + A.getBalance());
  }
 }
