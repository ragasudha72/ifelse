package assign_2;
import java.util.Scanner;
public class p1 {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter num:");
		int n=s.nextInt();
		if(n%2==0) {
			System.out.println(n+" is even");}
			else{
				System.out.println(n+" is odd");
		}
		
	}

}
