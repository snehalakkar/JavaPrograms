import java.util.Scanner;
import java.lang.Math;
public class PrimeFactors
{
public static void main(String[] args)
{
Scanner scan =new Scanner(System.in);
System.out.println("Enter the number to find its prime factors");
int n=scan.nextInt();
boolean isprime=true;

for(int i=2;i<n;i++)
{
if(n%i==0)
{
isprime=false;
break;
}
else{
isprime=true;
}
}

if(isprime)
{
System.out.println("number is prime");
}
else
{
System.out.println("number is not prime");
}
}
}

