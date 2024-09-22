public class nine {
    public static void main(String[] args) {
		double width = 4.5;
		double height = 7.9;
		System.out.println("The area is:"+area(width,height));
		System.out.println("The perimeter is:"+perimeter(width,height));
	}
	public static double area(double width,double height){
		double area = width*height;
		return area;
	}
	public static double perimeter(double width,double height) {
		double perimeter = 2 * width+2 * height;
		return perimeter;
	}
}
