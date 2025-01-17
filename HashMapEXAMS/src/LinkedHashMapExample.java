import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {
	public static void main(String[] args) {
		// false - order / true - huli ung last na edit
		LinkedHashMap<String, Integer>phonebook = new LinkedHashMap(4, 0.75f, true);
		phonebook.put("Kevin", 123213);
		phonebook.put("Jill", 232324);
		phonebook.put("Brenda", 252525);
		phonebook.put("Gary", 262627);
		System.out.println("Brenda's number " + phonebook.get("Brenda"));
		
		System.out.println("\nList of contacts in phonebook");
		for (Map.Entry<String, Integer> entry: phonebook.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
	}
}
