import java.util.*;
import java.io.*;
import java.lang.*;
public class Main 
{
    public static void main(String args[])throws IOException
    {
      //type your code here
       ArrayList<String> a = new ArrayList<String>();
       BufferedReader br = new  BufferedReader(new InputStreamReader(System.in));
       int n = 1;
       while(n!=0)
       {
         System.out.println("Choose any one:");
        System.out.println("1.Insert");
         System.out.println("2.delete");
         System.out.println("3.Display");
         System.out.println("4.Exit");
         int ch = Integer.parseInt(br.readLine());
         switch(ch)
         {
           case 1 : 
                    String month = br.readLine();
                    String arr[] = month.split(",");
                    for(int i=0;i<arr.length;i++){
                      a.add(arr[i]);
                    }
                   break;
           case 2 : int ch1 = Integer.parseInt(br.readLine());
                    System.out.println("Enter the index value to be deleted:" + ch1);
                    
                    a.remove(ch1);
                    break;
           case 3:  System.out.println(a);
                    break;
           case 4 : n = 0;break;
         }
       }
    }
}