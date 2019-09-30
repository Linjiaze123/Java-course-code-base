public class Arraycopy2 {
	public static void main(String[] args) {
		int array[] = {1,2,3,4,5,6,7,8,9,10};
		int array2[] = {0,0,0,0,0,0,0,0,0,0};
		System.arraycopy(array,0,array2,0,5);
		System.out.print("array2:");
		for(int i = 0;i < array2.length;i++) {
			System.out.print(array2[i]+" ");
		}
	}
}