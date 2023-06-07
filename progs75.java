class progs75{
void two()
{
int data = 50 / 0; // unchecked exception occurred
// exception propagated to one()
}
void one()
{
try {
two(); // exception handled
}
catch (Exception e) {
System.out.println("Exception handled");
}
throw e;
}
public static void main(String args[])
{
Simple obj = new Simple();
obj.one();
System.out.println("Normal flow...");
}
}
