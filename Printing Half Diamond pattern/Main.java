import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int val = 1;
      for(int row=1;row<=n;row++)
         {
        for(int space=1;space<=(n-row);space++)
        {
          System.out.print(" ");
        }
         for(int col=1;col<=val;col++)
        {
           System.out.print("*");
           
       }
        val=val+2;
           System.out.print("\n");
      }
	}
}