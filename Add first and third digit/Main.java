import java.util.Scanner;
class Main{
	public static void main (String[] args) {
		// Type your code here
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt(); 
      int num = (n/100);
      int numm = (n%100)%10;
      int sum = num+numm;
      System.out.println(sum);
	}
}