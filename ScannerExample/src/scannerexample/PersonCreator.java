package scannerexample;
import java.util.Scanner;

public class PersonCreator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Name, Age, Phonenumber ");
		String name = scanner.next();
		int age = scanner.nextInt();
		long phoneNumber = scanner.nextLong();
		Person person = new Person(name, age, phoneNumber);
	}
}
