package ifelse;

import java.util.Scanner;

public class Age
{
public static void main(String[] args)
{
    int age;
    Scanner sc=new Scanner(System.in);

    System.out.println("Enter age");
    age=sc.nextInt();
    if(age>=18)
    {
        System.out.println("eligible");
    }
    else
    {
        System.out.println("not eligible");
    }


}
  }
