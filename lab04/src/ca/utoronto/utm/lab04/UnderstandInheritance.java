package ca.utoronto.utm.lab04;
public class UnderstandInheritance {

	public static void main(String[] args) {
		// 6) Review class Square, understand what happens when we execute the following:
		// that is, which methods are called and when...
		
		System.out.println("Starting");
		Square s=new Square();
		// The line above calls the Square() constructor
		// which executes this("blue", 10, 100, 100); which calls
		// the Square(String c, int width, int x, int y) constructor
		// which executes super(c, width, width, x, y); which calls 
		//The Rectangles constructor Rectangle(String c, int width, int height, int x, int y)
		//which inherits super(c, x, y) from the shapes class.
		System.out.println(s.toString());
		//This line calls the toString from the Square s, which is inherited from the rectangle 
		//class method toString, which inherits the data from Shapes toString to print our its properties.
		s.setWidth(20);//Uses the set Width that was inherited from rectangle to adjust the width of the given square.
		s.setX(10);//Uses the inherited setX from the rectangle class, which was inherited from the shape class to adjust the x position of the Square s.  
		
	}

}
