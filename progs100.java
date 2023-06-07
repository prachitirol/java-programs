import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class progs100{

public static void main(String []args){
try{
Scanner s = new Scanner(new File("pari.txt"));
int count =0;
String arr[]=new String[100];
int i=1;
while(s.hasNextLine()){
String u = s.nextLine();
StringTokenizer st =new StringTokenizer(u," ");
 
 while (st.hasMoreTokens()){
count++;
arr[i]=st.nextToken();
i++;

}
}
s.close();
System.out.println("Reserved string is :");
for(i=count;i>0;i--){
System.out.println(arr[i]+"\t");
}}
catch(FileNotFoundException e){

System.out.println("file not found");
}}}