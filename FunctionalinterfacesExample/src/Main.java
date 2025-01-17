import functionalinterfaceexample.GreetingMessage;
import methodreferencesexample.Shapes;
import methodreferencesexample.Square;

public class Main {
	public static void main(String[] args) {
		
		//GreetingMessage
		GreetingMessage gm = new GreetingMessage() {
			@Override
			public void greet(String name) {
				System.out.println("Hello " + name);	
			}
		};
		gm.greet("Bethan");
		
		//GreetingMessage
		GreetingMessage gm2 = (String name) -> {
			System.out.println("Hello" + name);
		};
		gm.greet("Bethan");
		
		//MessagePrinter
		MessagePrinter mp = () -> {
			System.out.println("This is a message");
		};
		mp.printMessage();
		
		//methodsreference (Lambda)
		Square s = new Square(4);
		
		Shapes shapes = (Square square) -> {
			return s.calculateArea();
		};
		
		System.out.println("Area: " + shapes.getArea(s));
		
		//Methods Reference
		Square s2 = new Square(4);
		
		Shapes shapes2 = Square::calculateArea;
		
		System.out.println("Area: " + shapes2.getArea(s2));
		
		
	}
}
