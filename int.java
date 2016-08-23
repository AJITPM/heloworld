import java.util.Scanner;

public class posneg {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		String c1=(sc.next());
		StringBuffer ko=new StringBuffer(c1);
		ko=ko.reverse();
		System.out.println(ko);

	}

}
