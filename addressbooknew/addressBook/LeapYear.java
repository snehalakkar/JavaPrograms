import java.util.Scanner;
public class LeapYear
{
public static void main(String[] args)
{
Scanner scan =new Scanner(System.in);

char d;
do
{
try{
System.out.println("Enter the 4 digit year to check it is leap year or not :");
int year=scan.nextInt();
if(year%4==0&&year%10!=0)
{
System.out.println(year+ " is a leap year");
}
else
{
System.out.println(year+ " is not a leap year");
}
}

catch(Exception e)
{
System.out.println("this is not an year");
}


System.out.println("Do you want to continue?,press Y to continue:");
d=scan.next().charAt(0);
if(d!='y' || d!='Y')
{
System.out.println("thank u");

}

}while(d=='y' || d=='Y');
}
}
