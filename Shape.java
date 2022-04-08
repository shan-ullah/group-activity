package groupActivity6;

public class Shape {
	
	void toPrint() {
		System.out.println("this is shape");
	}
	

}

class Rectangle extends Shape{
	void toPrint() {
		System.out.println("this is rectangular shape");
	}
	void toPrint1() {
		super.toPrint();
	}
}

class Circle extends Shape{
	void toPrint() {
		System.out.println("this is circular shape");
	}
}
class Square extends Rectangle{
	
	void toPrint() {
		System.out.println("square is a rectangle");
	}
	void toPrintRectangle() {
		super.toPrint();
	}
	void toPrintShape() {
		super.toPrint1();
	}
}
