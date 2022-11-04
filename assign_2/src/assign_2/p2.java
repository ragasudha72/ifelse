package assign_2;
import java.util.Scanner;
public class p2 {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter char:");
		char c=s.next().charAt(0);
		if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U') {
			System.out.println(c+" is vowel");}
			else if(c=='y'){
				System.out.println("sometimes y is vowel and sometimes it is consonant");}
			else {
				System.out.println(c+" is consonant");
			}
				
				
			}
		}
		
	


