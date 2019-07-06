import java.util.Scanner;
class Main{
   public static int power(int base,int exponent)
  {
    int s =1;
    while (exponent!=0)
    {
     s = s*base;
    --exponent;
    }
    
    return s;
  }
	public static void main (String[] args){
	    // Type your code here
      Scanner sc = new Scanner(System.in);
      int b = sc.nextInt();
      int e = sc.nextInt();
      int m = power(b,e);
      System.out.println(m);
	}
}