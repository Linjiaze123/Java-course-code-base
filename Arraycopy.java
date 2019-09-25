public class Arraycopy {
	public static void main(String[] args) {
		int a[] = {1,2,3,4};
		int b[] = {8,9,10,11,12};
		System.arraycopy(a,0,b,1,4);
		for (int i = 0;i < a.length;i++) {
			System.out.print(a[i]+"   ");
		}
		System.out.println();
		for (int j = 0;j < b.length;j++) {
			System.out.print(b[j]+"   ");
		}
	}
}