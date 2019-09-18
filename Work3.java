public class Work3 {
	public static void main(String[] agrs) {
		int res = 0,n1 = 12,n2 = 24,n3 = 16,n4 = 3;
		double d,v1 = 10.0,v2 = 3.1416;
		res = n1 / n4;
		d = n1 / n4;
		System.out.printf("res = %d  d = %.2f\n",res,d);

		res = n3 / n4;
		d = n3 / n4;
		System.out.printf("res = %d  d = %.2f\n",res,d);
		
		d = v1 / n4;
		System.out.printf("d = %.2f\n",d);
		
		d = v1 / v2;
		System.out.printf("d = %.2f\n",d);
		
		res = n1 / n2;
		d = (double)n1 / n2;
		System.out.printf("res = %d  d = %.2f\n",res,d);
		
		d = n1 / (double)n2;
		System.out.printf("d = %.2f\n",d);
		
		d = (double)(n1 / n2);
		System.out.printf("d = %.2f\n",d);

	}
}