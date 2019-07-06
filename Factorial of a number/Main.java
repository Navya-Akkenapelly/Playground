import java.util.Scanner;
class Main{
	public static void main (String[] args){
        // Type your code here
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int n1 = 1;
      for(int count=1;count<=n;count++)
      {
        n1 = n1*count;
      }
      System.out.println(n1);

	}
}