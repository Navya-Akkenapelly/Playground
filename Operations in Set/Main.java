import java.util.*;
import java.io.*;
import java.lang.*;
public class Main 
{
    public static void main(String args[])throws IOException
    {
       // type your code here
      LinkedHashSet<String> a = new  LinkedHashSet<String>();
       BufferedReader br = new  BufferedReader(new InputStreamReader(System.in));
       String month = br.readLine();
       String arr[] = month.split(",");
       
       for(int i=0;i<arr.length;i++){
         a.add(arr[i]);
       }
      System.out.println(a);
      String m = br.readLine();
      System.out.println("Enter the value to be deleted:" + " " + m);
      a.remove(m);
      System.out.println(a);
      String m1 = br.readLine();
      System.out.println("Enter the value to be added:"+ " " + m1); 
      a.add(m1);
      System.out.println(a);
    }
}