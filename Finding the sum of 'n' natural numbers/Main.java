import java.util.Scanner;
class Main {
    public static void main(String[] args) 
    {
		// Type your code here
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      
      System.out.println(sum(n));
    }
  public static int sum(int n)
  {
    if(n<0)
    {
      return 0;
    }
    else
    {
      return n+sum(n-1);
    }
  }
}