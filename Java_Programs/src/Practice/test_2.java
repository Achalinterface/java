package Practice;

interface Shape {
	double getArea();
}

class Rectangle implements Shape {
	private double length;
	private double width;

	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}

	@Override
	public double getArea() {
		return length * width;
	}
}

class Circle implements Shape {
	private double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	@Override
	public double getArea() {
		return Math.PI * radius;
	}
}

class Triangle implements Shape {
	private double base;
	private double height;

	public Triangle(double base, double height) {
		this.base = base;
		this.height = height;
	}

	@Override
	public double getArea() {
		return 0.5 * base * height;
	}
}

public class test_2 {
	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle(5, 2);
		Circle circle = new Circle(4);
		Triangle triangle = new Triangle(5, 10);
		System.out.println("The area of rectangle is: " + rectangle.getArea());
		System.out.println("The area of circle is: " + circle.getArea());
		System.out.println("The area of triangle is: " + triangle.getArea());
	}
}
