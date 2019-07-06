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
      int n1 = sc.nextInt();;
      int n2 = sc.nextInt();
     int n3 = -1;
      int n4 = -1;
       for(int ind=0;ind<=n-1;ind++)
      {
      if(n1==arr[ind])
      {
      n3 = ind;
    
      }
        if(n2==arr[ind])
      n4 = ind;
       }
      System.out.println(n3);
      System.out.println(n4); 
    }
}