public class Circle {
	public double r; //radius
	public double d; //diameter
	
	public double circumference() {
		return 2*3.14*r;
	}
	
	public double area() {
		return 3.14*r*r;
	}
	
	public static void main(String[] args) {
		
		Circle circleA = new Circle();
		Circle circleB = new Circle();
		
		double areaA, areaB;
		circleA.r = 10;
		circleB.r = 5;
		areaA = circleA.area();
		areaB = circleB.area();
		
		System.out.println("AreaA = " + areaA);
		System.out.println("AreaB = " + areaB);		 
		
	}
}

			
			
			
			