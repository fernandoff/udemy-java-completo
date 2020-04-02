package entities;

public class Triangle {
	public double a;
	public double b;
	public double c;
	
	public Triangle() {		
	}
	
	public Triangle(double a, double b, double c) {
	    this.a = a;
	    this.b = b;
	    this.c = c;	    
	}
	
	public double area() {
		double p = (this.a + this.b + this.c) / 2.0;		
		return Math.sqrt(p * (p - this.a) * (p - this.b) * (p - this.c));		
	}
	
	public String toString() {
		return String.format("a = %s \nb = %s \nc = %s", a, b, c);
	}
}


