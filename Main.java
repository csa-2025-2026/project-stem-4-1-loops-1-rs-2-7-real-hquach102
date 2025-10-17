import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
    {
    Scanner scan = new Scanner(System.in);
    System.out.println("Give positive integers");

    int sum = 0;
    int scan = 0;

    while(scan != -1)
    {
      scan = scan.nextInt();
      sum += scan;
    }
    sum++;
    System.out.println("The sum is: " + sum);

    
      }
  }
  

