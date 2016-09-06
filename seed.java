
public class seed {

	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		String num = sc.nextLine();
		int sum = 1;
		for(int i = 0;i<num.length();i++)
		{
			sum = sum * Integer.parseInt(String.valueOf(num.charAt(i)));
		}
		int result= 1;
		result=sum *Integer.parseInt(num);
		System.out.println("seed of 123 is"+result);
	}

}
