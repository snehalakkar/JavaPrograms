import java.util.Scanner;
import java.util.Random;
public class Prac1
{
public static void main(String[] args)
{
Scanner scan =new Scanner(System.in);
System.out.println("Enter the limit upto which u want random number");
int n=scan.nextInt();
Random r=new Random();
System.out.println("the random number between 0 to n is :"+r.nextInt(n));
}
}
