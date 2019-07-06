import java.util.Scanner;
class Faculty
{
  
  public void salary(int n)
  {
    //write your Faculty class statements
   System.out.println("Base Salary" + ":" + " " + n);
  }
}
class CSE extends Faculty
{
  public void salary(int n)
  {
    //write your CSE class statements
     System.out.println("CSE Faculty" + ":" + " " + (n+3000));
  }
}
class IT extends CSE
{
  public void salary(int n)
  {
    //write your IT class statements
     System.out.println("IT Faculty" + ":" + " " + (n+5000));
  }
}
class ECE extends IT
{
  public void salary(int n)
  {
    //write your ECE class statements
     System.out.println("ECE Faculty" + ":" + " " + (n+4500));
  }
}

class Main
{
  public static void main(String[] args)
  { Faculty obj1 = new Faculty();
   CSE obj2 = new CSE();
   IT obj3 = new IT();
    ECE obj = new ECE();
    //implement your required concept here
  Scanner sc = new Scanner(System.in);
  int n = sc.nextInt();
   obj1.salary(n);
   obj2.salary(n);
   obj3.salary(n);
   obj.salary(n);
  }
}