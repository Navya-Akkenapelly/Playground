import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int n1 = (n/10000);
      int n2 = (n%10000)/1000;
      int n3 = (n%10000)%1000/100;
      int n4 = (n%10000)%1000%100/10;
      int n5 = (n%10000)%1000%100%10;
      int n6 = n1+n2+n3+n4+n5;
      System.out.println(n6);
	}
}