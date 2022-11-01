package entities;

public class Rectangle {
	
	public double Width;
	public double Heigth;
	
	public double area() {
		return (Width * Heigth);
	}
	public double perimeter() {
		return (2*(Width + Heigth));
	}
	public double diagonal() {
		return Math.sqrt(Heigth * Heigth + Width * Width);
	}

}
