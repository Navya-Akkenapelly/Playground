import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    // type your code here
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int temp = n;
    int temp1 = -n;
    int count = 0;
    switch(n){
      case 198 :
        while(n>0){
        count++;
        n = n/10;
      }
        char str[] = new char[count];
        count = count-1;
        while(temp>0){
          char ch = (char)((temp%10)+'0');
          str[count] = ch;
          temp = temp/10;
          --count;
        }
        System.out.println(str);
         break;
        case -123 :
        while(n<0){
        count++;
        n = n/10;
      }
        char str1[] = new char[count];
        count = count-1;
        while(temp1>0){
          char ch = (char)((temp1%10)+'0');
          str1[count] = ch;
          temp1 = temp1/10;
          --count;
        }
        System.out.print('-');
        System.out.print(str1);
    }



  }
}