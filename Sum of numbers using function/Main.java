import java.util.Scanner;
class Main{
  public static int sum(int d)
  {
   int s =((d+1)*d)/2;
    
    return s;
  }
	public static void main (String[] args){
	    // Type your code here
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int n1 = sum(n);
      System.out.println(n1);
	}
}