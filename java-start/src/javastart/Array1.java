package javastart;

class Circle {
	
	int radius;
	
	Circle(int radius) {
		
		this.radius = radius;
	}
	
	public double getArea() {
		
		return 3.14 * radius * radius;
	}
}

public class Array1 {

	public static void main(String[] args) {
		
		Circle [] c;
		c = new Circle[5];
		//Circle [] c = new Circle[5];
		for(int i = 0; i < c.length; i++) {
			
			c[i] = 	new Circle(i);
		}
		
		for(int j = 0; j < c.length; j++) {
			
			System.out.println(c[j].getArea());
		}
	}
}
