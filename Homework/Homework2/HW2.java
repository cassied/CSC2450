
public class HW2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1=8; 
		int n2=6;
		int n3=9;
		int n4=maxFunction(n1, n2, n3); 
		System.out.println("Maximum Value = "+n4); 
		double x1=10.0; 
		double x2=2.0; 
		double x3=9.0;
		double x4=maxFunction(x1, x2, x3); 
		System.out.println("Maximum Value= "+ x4); 
	}

	public static int maxFunction(int a, int b, int c){
		int max=0; 
		if ((a>b && a>c)||(a==b && a>c)||(a==c && a>b)||(a==b && a==c))max=a; 
		if ((b>c && b>a)||(b==c && b>a))max=b; 
		if (c>a && c>b)max=c; 
		return max;
}
	public static double maxFunction(double a, double b, double c){
		double max=0; 
		if ((a>b && a>c)||(a==b && a>c)||(a==c && a>b)||(a==b && a==c))max=a; 
		if ((b>c && b>a)||(b==c && b>a))max=b; 
		if (c>a && c>b)max=c; 
		return max;

	}

}
