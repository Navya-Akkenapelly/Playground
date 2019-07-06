import java.util.Scanner;
class Main
{
  public static int sqare(int num)
  {
    int s = num*num;
    return s;
  }
	public static void main (String[] args)
    {
	 // Type your code here  
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int n1 = sqare(n);
      System.out.println(n1);
	} 
}