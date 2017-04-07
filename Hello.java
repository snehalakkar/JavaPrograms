import java.util.Scanner;
public class Hello
{
public static void main(String[] args)
{
System.out.println("Enter your name:");
Scanner scan =new Scanner(System.in);
String username=scan.next();
System.out.println("Hello "+username+", How are u");
}
}
