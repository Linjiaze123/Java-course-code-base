public class Test {
	public static void main(String[] args) { 
	int lay=7;  
	for(int i=1;i<=lay;i++) {
		for(int k=1;k<=lay-i;k++){ 
			System.out.print(" ");
			}
		for(int j=1;j<=2*i-1;j++) {
			System.out.print("$");
			}
	System.out.println( ); 
		}
	}
}
