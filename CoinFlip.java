import java.util.Scanner;
import java.lang.Math;
public class CoinFlip
{
public static void main(String[] args)
{
Scanner scan =new Scanner(System.in);
System.out.println("Enter the number of times u want to flip the coin:");
int n=scan.nextInt();
int head=0;
int tail=0;


for(int i=0;i<n;i++)
{
double result=Math.random();
if(result>=0.5)
{
head++;
}
else 
{
tail++;
}
}
System.out.println("number of heads:"+head);
System.out.println("number of tails:"+tail);
System.out.println("min is: "+Math.min(head,tail));
System.out.println("max is: "+Math.max(head,tail));
}
}
