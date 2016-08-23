import java.util.Scanner;


public class posneg {

	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner (System.in);
		String c1=(sc.next());
		char c= c1.charAt(0);
		if ( c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
		{
			System.out.println("vowel");
		}
		else
		{
			System.out.println("consonat");
		}

	}

}
