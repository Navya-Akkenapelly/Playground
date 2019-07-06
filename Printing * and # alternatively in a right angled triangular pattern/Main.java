import java.util.Scanner;
class Main { 
	public static void main(String[] args){
  		Scanner in = new Scanner(System.in);
  		// Type your code here
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      for(int row=1;row<=n;row++)
      {
        for(int col=1;col<=row;col++)
        {
          if(((row==1)&&(col%2!=0))||((row==2)&&(col%2==0))||((row==3)&&(col%2==0))||((row==4)&&(col%2!=0))||((row==5)&&(col%2!=0))||((row==6)&&(col%2==0)))
          System.out.print("*");
          else
          System.out.print("#");
        }
      System.out.print("\n");
         }
    }
}