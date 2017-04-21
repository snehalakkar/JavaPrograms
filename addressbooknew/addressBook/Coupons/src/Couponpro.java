import java.util.Random;
import java.util.Scanner;

public class Couponpro {
	public static void main(String[] args) {
		System.out.println("enter the number of ticket required");
		Scanner scan =new Scanner(System.in);
		int n=scan.nextInt();

		calcRandom(n);


	}


	public static void calcRandom(int n)
	{   
		int count=0;
		int count1=0;
		Random rm=new Random();
		int arr[]=new int[n];
		int result=0;
		int p=0;
		
		do
		{
			result=rm.nextInt(100);
			count++;
			
			
	
			for(int i=0;i<count;i++)
			{
				if(count1==0)
				{
					if(result!=arr[i])
					{
						arr[i]= result;
						count1++;
						System.out.println(arr[i] +" ");
					}	
					p++;
				}
				
			}
			count1=0;
			
		}
while(p<n*2.5);
		System.out.println(p);
		System.out.println("count is:"+count);
	}

}

