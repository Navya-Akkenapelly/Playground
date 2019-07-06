import java.util.*;
import java.io.*;
import java.lang.*;
public class Main 
{
    public static void main(String a[])throws IOException
    {
        // type your code here
      List<String> l = new LinkedList<String>();
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      String month = br.readLine();
      String arr[] = month.split(",");
      for(int i = 0;i<arr.length;i++)
      {
        l.add(arr[i]);
      }
      System.out.println(l);
      System.out.println("Size of the linked list:" + " "+ l.size());
      System.out.println("Is LinkedList empty?"+ " "  + l.isEmpty());
      String n = br.readLine();
      System.out.println("Does LinkedList contains" + " " + n + "?");
      System.out.println(l.contains(n));
    }
}