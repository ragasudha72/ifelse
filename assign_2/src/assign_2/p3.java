package assign_2;
import java.util.Scanner;
public class p3 {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		int l1,l2,l3;
		System.out.println("enter lengths:");
		l1=s.nextInt();
		l2=s.nextInt();
		l3=s.nextInt();
		if(l1==l2 && l2==l3) {
			System.out.println("triangle is equilateral");
		}
		else if(l1!=l2 && l2!=l3 && l1!=l3){
			System.out.println("triangle is scalene");
		}
		else {
			System.out.println("triangle is isosceles");
		}
	}

}
