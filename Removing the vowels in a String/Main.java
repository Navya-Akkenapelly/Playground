import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //type your code here
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    StringBuilder sb = new StringBuilder(str);
    int len = sb.length();
    StringBuilder temp = new StringBuilder("");
    for(int id = 0;id<=len-1;id++)
    {
      if((str.charAt(id)!='a')&&(str.charAt(id)!='e')&&(str.charAt(id)!='i')&&(str.charAt(id)!='o')&&(str.charAt(id)!='u')||(str.charAt(id)==' '))
      {
       temp.append(str.charAt(id));
      }
    }
    System.out.println(temp);
   

  }
}