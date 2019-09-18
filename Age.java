import java.util.Scanner;

public class Age {
	public static void main(String[] args) {
		int Minor = 35;
		System.out.print("请输入您的年龄：");
		Scanner scan = new Scanner(System.in);
		
		int age = scan.nextInt();
		
		System.out.printf("你的年龄是：%d",age);
		
		if(age < Minor) {
			System.out.println("年轻是美好的,");
		}
		
		System.out.println("年龄决定了你的精神世界，好好珍惜吧。");
	}
}