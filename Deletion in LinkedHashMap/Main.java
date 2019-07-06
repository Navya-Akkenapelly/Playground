import java.util.*;
import java.io.*;
import java.lang.*;
public class Main 
{
    public static void main(String a[])throws IOException
    {
        // type your code here
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       LinkedHashMap<String,Integer> ts = new LinkedHashMap<String,Integer>();
       String name;
       int mark;
       int n = Integer.parseInt(br.readLine());
       System.out.println("Enter the number of values to be inserted in map:" + n);
      for(int i=0;i<n;i++)
      {
        name = br.readLine();
        mark = Integer.parseInt(br.readLine());
        ts.put(name,mark);
      }
      System.out.println(ts);
      String n1 = br.readLine();
      System.out.println("Enter the index to be removed:" + n1);
      ts.remove(n1);
      System.out.println(ts);
      System.out.println("Size of map is :" + " " + ts.size());
    }
}