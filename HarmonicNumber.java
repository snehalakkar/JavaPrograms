import java.util.Scanner;
public class HarmonicNumber
{
public static void main(String[] args)
{
Scanner scan =new Scanner(System.in);
System.out.println("Enter the Nth harmonic number ");
int n=scan.nextInt();
float sum=0;

System.out.println("Harmonic series is:");
for(int i=1;i<=n;i++)
{
System.out.print("1/"+i+ ",");
sum=sum+(float)1/i;
}
System.out.println();
System.out.println("Nth harmonic value is :"+sum);
}
}
