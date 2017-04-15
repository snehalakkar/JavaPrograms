import java.util.Scanner;

public class Gambler
{
public static void main(String[] args)
{

Scanner scan =new Scanner(System.in);
System.out.println("Enter initial stake amount :");
int stake=scan.nextInt();

System.out.println("set the goal amount :");
int goal=scan.nextInt();

System.out.println("Enter number of times u want to play :");
int n=scan.nextInt();

game(stake,goal,n);
}


static int win=0,loss=0,wp,lp,bets=0,cash;

public static void game(int stake,int goal,int n)
{

for(int i=0;i<n;i++)
{
 cash=stake;
 while(cash>0 && cash<goal)
 {
 bets++;
  if(Math.random()>=0.5)
  {
  cash++;
  }
else
{
cash--;
}
}
if(cash==goal)
{
win++;
}
else
{
loss++;
}
}


System.out.println("number of wins are :"+win);
wp=(win/n)*100;
lp=(loss/n)*100;
System.out.println("win percentage is: "+wp);
System.out.println("loss percentage is: "+lp);
}
}
