import java.util.Scanner;


public class posneg {

	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner (System.in);
		int num=sc.nextInt();
		if ( num %2!=0)
		{
			System.out.println("odd");
		}
		else
		{
			System.out.println("even");
		}

	}

}
