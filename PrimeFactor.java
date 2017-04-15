import java.util.Scanner;
public class PrimeFactor
{
public static void main(String[] args)
{
Scanner scan =new Scanner(System.in);
System.out.println("Enter the number to find prime factors");
int n=scan.nextInt();

System.out.println("prime factors are:");
for(int i=1;i<n/2;i++)
{
int count=0;
for(int j=2;j<n/2;j++)
{
if(i%j==0)
{
count++;
}
}
if(count==1)
{
if(n%i==0)
{
System.out.println(i);
}
}
}
}
}
