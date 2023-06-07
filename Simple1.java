8.wap in java to demonstrate string tokenizer class.

import java.util.StringTokenizer; 
public class Simple1{
public static void main(String args[]){
StringTokenizer st = new StringTokenizer("I Am A Girl "," ");
 while (st.hasMoreTokens()) {
 
System.out.println(st.nextToken());

}

}

}
