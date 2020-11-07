import java.util.Scanner;
class bill1
{
	public void domestic(float units)
	{
		float rate;	
		if(units<=100)
			rate=units*1;
		else if((units>100)&&(units<=200))
			rate=units*2.50f;
		else if((units>200)&&(units<=500))
			rate=units*4;
		else
			rate=units*6;
		System.out.println("Amount: "+rate);
	}
}
class bill2
{
	public void commercial(float units)
	{
		float rate;
		if(units<=100)
			rate=units*2;
		else if((units>100)&&(units<=200))
			rate=units*4.50f;
		else if((units>200)&&(units<=500))
			rate=units*6;
		else 
			rate=units*7;
		System.out.println("Amount: "+rate);
	}
}
public class EB_bill{
public static void main(String args[])
{
	float units;
	System.out.println("Enter Consumer name:");
	Scanner scan=new Scanner(System.in);
	String str= scan.nextLine();
	System.out.println("Enter Previous month reading:");
	int pre_read=scan.nextInt();
	System.out.println("Enter this month reading:");
	int this_read=scan.nextInt();
	System.out.println("Enter 1.Domestic 2.Commercial:");
	int type=scan.nextInt();
	scan.close();
	units=this_read-pre_read;
	if(type==1)
	{
		bill1 obj = new bill1();
		obj.domestic(units);
	}
	else
	{
		bill2 obj = new bill2();
		obj.commercial(units);
	}
}
}
			
		