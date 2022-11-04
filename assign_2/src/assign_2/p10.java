package assign_2;
import java.util.Scanner;
public class p10{
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter wavelength:");
		int w=s.nextInt();
		if(w>=380 && w<450) {
			System.out.println("Violet");
		}
		else if(w>=450 && w<495) {
			System.out.println("Blue");
		}
		else if(w>=495 && w<570) {
			System.out.println("Green");
		}
		else if(w>=570 && w<590) {
			System.out.println("Yellow");
		}
		else if(w>=590 && w<620) {
			System.out.println("Orange");
		}
		else if(w>=620 && w<750) {
			System.out.println("Red");
		}
		else {
			System.out.println("enter wavelength between 380 and 750");
		}
	}

}
