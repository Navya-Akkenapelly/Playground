import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //type your code;
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int array[] = new int[n];
    for(int i = 0;i<=n-1;i++)
    {
      array[i] = sc.nextInt();
    }
   for(int i = 0;i<=(n/2)-1;i++)
    {
     for(int j = 0;j<=(n/2)-i-2;j++)
      if(array[j]>=array[j+1])
         {
           int temp = array[j];
           array[j]=array[j+1];
           array[j+1]=temp;
         }
    }
    for(int i = 0;i<=n-1;i++)
    System.out.print(array[i] + " " );
         
  }
}