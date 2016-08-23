import java.util.Scanner;


public class posneg {

	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner (System.in);
		String c1=(sc.next());
		StringBuffer oo=new StringBuffer(c1);
		oo=oo.reverse();
		System.out.println(oo);

	}

}
