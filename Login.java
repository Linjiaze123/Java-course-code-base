import java.util.Scanner;

public class Login {
	
	public static void main(String[] ages) {
		Scanner scan = new Scanner(System.in);
		String username;
		String password;
		boolean exam = false;
		
		System.out.print("username:");
		username = scan.nextLine();
		System.out.print("password:");
		password = scan.nextLine();
		
		UserLibrary ver = new UserLibrary();
		exam = ver.UserLibrary(username,password);
		
		if(exam) {
			System.out.println("Login successfully!");
		}else {
			System.out.println("Wrong account name or password!");
		}
	}
}