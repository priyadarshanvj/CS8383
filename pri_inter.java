import java.util.*;
interface pri
{
	void prime();
}
class pri_inter implements pri
{
	public void prime()
	{
		int i,m=0,flag=0;      
		int n;
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter any no.:");
		n=scan.nextInt();   
		scan.close();  
  		m=n/2;      
  		if(n==0||n==1){  
   		System.out.println(n+" is not prime number");      
  		}
		else{  
   		for(i=2;i<=m;i++){      
    		if(n%i==0){      
     		System.out.println(n+" is not prime number");      
     		flag=1;      
     		break;      
    		}      
   		}      
   		if(flag==0)  { System.out.println(n+" is prime number"); }  
  
	}
}
	public static void main(String args[])
	{
		pri obj=new pri_inter();
		obj.prime();
	}
}

