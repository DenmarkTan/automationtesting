import java.util.HashMap;

public class HashMapEx {
public void main(String[] args) {
		
		HashMap<String, Integer> phonebook = new HashMap<>();
		phonebook.put("Kevin", 12345);
		phonebook.put("Jill", 98765);
		phonebook.put("Brenda", 123123);
		phonebook.put("Kevin", 22222);

		
		System.out.println(phonebook);
	}
}
