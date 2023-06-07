
import java.io.*;
import java.util.Scanner; 
public class progscombine {
 public static void main(String[] args) throws IOException{
 File file=new File("Z:\\sample.txt"); //filepath
 Scanner sc=new Scanner(file);
 //reading text and converting to UpperCase
 while(sc.hasNextLine())
 {
 System.out.println(sc.nextLine().toUpperCase());
 }
 sc.close();
 //appending text
 FileWriter fw=new FileWriter(file,false); //true if we want to append
 PrintWriter pw=new PrintWriter(fw);
 pw.println("this String will get appended\n ufdhjdslk\ndfgds");
 pw.close();
 }
}