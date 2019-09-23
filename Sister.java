import java.util.Scanner;

public class Sister {
	public static void main(String[] ages) {
		System.out.print("Age:");
		Scanner scan = new Scanner(System.in);
		
		int age = scan.nextInt();
		if(age < 18) {
			age = 1;
		} else if(age >= 18) {
			age = 2;
		}
		switch(age) {
			case 1:
				System.out.print("small Sister Hello!");
				break;
			case 2:
				System.out.print("old Sister Hello!");
				break;
			default:
				break;
		}
	}
}