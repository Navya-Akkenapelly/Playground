import java.util.*;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int num1 = n/10;
      int numm = n%10;
      
      int sum = num1+numm;
      System.out.println(sum);
	}
}