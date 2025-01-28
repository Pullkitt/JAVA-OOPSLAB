package exp1;
import java.util.Scanner;

public class areas {

	    public static double calcArea(double length, double width) {
	        return length * width;
	    }

	    public static double calcArea(double side) {
	        return side * side;
	    }

	
	    public static double calcArea(double radius, boolean isCircle) {
	        if (isCircle) {
	            return Math.PI * radius * radius;
	        } else {
	            return 0;
	        }
	    }

	    public static double calcArea(double base, double height, boolean isTriangle) {
	        if (isTriangle) {
	            return 0.5 * base * height;
	        } else {
	            return 0;
	        }
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the length of the rectangle: ");
	        double length = scanner.nextDouble();
	        System.out.print("Enter the width of the rectangle: ");
	        double width = scanner.nextDouble();
	        double rectangleArea = calcArea(length, width);
	        System.out.println("Area of Rectangle: " + rectangleArea);

	        System.out.print("Enter the side of the square: ");
	        double side = scanner.nextDouble();
	        double squareArea = calcArea(side);
	        System.out.println("Area of Square: " + squareArea);

	        System.out.print("Enter the radius of the circle: ");
	        double radius = scanner.nextDouble();
	        double circleArea = calcArea(radius, true);
	        System.out.println("Area of Circle: " + circleArea);

	      
	        System.out.print("Enter the base of the triangle: ");
	        double base = scanner.nextDouble();
	        System.out.print("Enter the height of the triangle: ");
	        double height = scanner.nextDouble();
	        double triangleArea = calcArea(base, height, true);
	        System.out.println("Area of Triangle: " + triangleArea);

	        scanner.close();
	    }
	}

