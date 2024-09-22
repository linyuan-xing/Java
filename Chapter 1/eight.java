public class eight {
    public static void main(String[] args) {
		double radius = 5.5;
		System.out.println("The area is:"+area(radius));
		System.out.println("The perimeter is:"+perimeter(radius));
	}
	public static double area(double radius){
		double area = radius*radius*Math.PI;
		return area;
	}
	public static double perimeter(double radius) {
		double perimeter = 2 * radius * Math.PI;
		return perimeter;
	}
}
