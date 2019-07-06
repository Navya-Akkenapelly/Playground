import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
        //Try your code here
      Scanner sc = new Scanner(System.in);
      int option = sc.nextInt();
      switch(option)
      {
        case 1:
          int side = sc.nextInt();
          int square = side*side;
          System.out.println(square);
          break;
        case 2 :
          int heigth = sc.nextInt();
          int bridth = sc.nextInt();
          int rec = heigth*bridth;
          System.out.println(rec);
          break;
        case 3:
          int base = sc.nextInt();
          int heigh = sc.nextInt();
          int tri = (base*heigh)/2;
          System.out.println(tri);
          break;
        case 4:
          int radius = sc.nextInt();
          double cir = 3.14 * radius * radius;
          System.out.println(cir);
      }
    }
}