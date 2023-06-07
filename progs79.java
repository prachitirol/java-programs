import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class progs78{

public static void main(String[]args){
try{
Scanner s = new Scanner(new File(args[0]));
while(s.hasNextLine()){
System.out.println(s.nextLine());
}
s.close();
}
catch(FileNotFoundException e){

System.out.println("file not found");
}
}
}