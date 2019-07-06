import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int arr[] = new int[n];
      for( int ind=0;ind<=n-1;ind++)
      {
        arr[ind]= sc.nextInt();
      }
         int  max = arr[0];
     for( int ind=0;ind<=n-1;ind++)
      { 
        if(max<arr[ind])
        {
          max = arr[ind];
        }
        }
             System.out.println(max);

    }
}