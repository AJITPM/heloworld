import java.util.Scanner;


public class posneg {

	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner (System.in);
	int a[]=new int[5];
	int m=0,k=0;
	for(int i=0;i<5;i++)
	{
		a[i]=sc.nextInt();
	}
	for( int i=0;i<5;i++)
	{
			if(a[i]==a[k])
			{
				m=a[i];
				break;
			}
			else
			{
				k++;
			}
		
		
	}
	System.out.println(m);
		
	}

}
