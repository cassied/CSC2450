public class TryItOutWeek2 {
	public static  final double MIN = 2; 
	public static  final int MAX = 5;
	public static  final double REAL = 1;

	public static int y = 7, n = 2;

	public static double x = 20.0, z = 100.0, t = 4;

	public static void reset() {
		y = 7;
		n = 2;
		x = 20.0;
		z = 100.0;
		t = 4;
	}
	public static void main(String[] args) {
		
        System.out.println("Question #1: x = " + (x = y/n + 4)); 
        reset();
        System.out.println("Question #2: x = " + (x *= 3)); 
        reset();
        System.out.println("Question #3: x = " + (x = REAL * y / n)); 
        System.out.println("Question #4: Invalid"); 
        System.out.println("Question #5: x = " + (x = (double) 5/2)); 
        System.out.println("Question #6: x = " + (x = (double) (5/2))); 
        System.out.println("Question #7: x = " + (x = y % 3 + MIN / t + MAX)); 
        reset();
        System.out.println("Question #8: x = " + (x = 3 - 4 * x)); 
        System.out.println("Question #9: z = " + (z = MAX / MIN)); 
        reset(); 
        System.out.println("Question #10: z = " + (z = 2 / 4 * z)); 
        System.out.println("Question #11: Invalid");
        System.out.println("Question #12: y = " + (y = - 10 / 2 % 4)); 
        reset();
        x++;
        System.out.println("Question #13: x = " + x); 
        System.out.println("Question #14: y = " + (--y)); 
		
	}

}
