package assign_2;
import java.util.Scanner;
public class p7 {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter month:");
		String month=s.nextLine();
		System.out.println("Enter date:");
		int date=s.nextInt();
		if(date==20) {
			System.out.println("Spring");
		}
		else if(date==22) {
			System.out.println("Fall");
		}
		else if(date==21) {
			String str2="June";
			if(month.equals(str2)) {
				System.out.println("Summer");
			}
			else
			{
				System.out.println("Winter");
			}
		}
	}
}
