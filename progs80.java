import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class progs80{

public static void main(String args[]){
try{
Scanner s = new Scanner(new File("E:\\myfile.txt"));
while(s.hasNextLine()){
String st = s.nextLine();
System.out.println(st.toUpperCase());
}
s.close();
}
catch(FileNotFoundException e){

System.out.println("file not found");
}
}
}