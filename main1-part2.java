package Traning;
import java.util.*;
public class Avg {
public int n=0;
public double sum=0;
public double count=0;

	public void love()
	{
		int i;
		 n=0;
		double avg=0;
		double sum=0;
		Scanner in=new Scanner(System.in);
		System.out.printf("\nEnter How Many Number Do you want? :");
		n=in.nextInt();
		for(i=1;i<=n;i++)
		{
			System.out.printf("\nEnter Number::");
			avg=in.nextDouble();
			sum=sum+avg;
			
			
		}
		
		System.out.printf("\n\nValues were added Successfully");
		System.out.printf("\nTotal Sum :%.2f",sum);
		
	}
}
