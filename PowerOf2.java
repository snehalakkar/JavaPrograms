import java.util.Scanner;
import java.lang.Math;
public class PowerOf2
{
public static void main(String[] args)
{
Scanner scan =new Scanner(System.in);
System.out.println("Enter the value of power in between 0 to 30 so that to get result in int range");
int n=scan.nextInt();
System.out.println("table of 2 upto range n is:");
if(n<=30)
{
for(int i=0;i<n;i++)
{
System.out.println(Math.pow(2,i));
}
}

else
{
System.out.println("value of n should be upto 30 only to get the result in int range .");
}


}
}

