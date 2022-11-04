package assign_2;
import java.util.Scanner;
public class p9 {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter n:");
		int n=s.nextInt();
		if((n%400==0) ||(n%100!=0 && n%4==0)) {
			System.out.println(n+" is leap year");
		}
		else {
			System.out.println(n+" is not leap year");
		}
			
		
	}

}
