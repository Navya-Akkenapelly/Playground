import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      System.out.println(2);
      System.out.println(3);
      for(int i = 2;i<=n;i++)
      {
        if((i%2!=0)&&(i%3!=0))
        {
          System.out.println(i);
        }
       }
	}
}