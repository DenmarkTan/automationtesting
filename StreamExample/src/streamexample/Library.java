package streamexample;

import java.io.PrintStream;
import java.util.ArrayList;

public class Library {
	public static void main(String[] args) {
		ArrayList<Book> books = populateLibrary();
		//normal stream
		//books.stream().filter(book -> { 
		//parallel stream - can add boost
		books.parallelStream().filter(book -> { 	
			return book.getAuthor().startsWith("J");
		}).filter(book -> {
			return book.getTitle().startsWith("E");
		}).forEach(System.out::println);
	}
	static ArrayList<Book> populateLibrary() {
		// TODO Auto-generated method stub
		ArrayList<Book> books = new ArrayList();
		books.add(new Book("Alice Walker", "The Color Purple"));
		books.add(new Book("Alice Walker", "Meridian"));
		books.add(new Book("Toni Morrison", "Jazz"));
		books.add(new Book("Toni Morrison", "Paradise"));
		books.add(new Book("John Steinback", "The Grapes of Wrath"));
		books.add(new Book("John Steinback", "East of Eden"));
		books.add(new Book("Kazuo Ishiguro", "The Remains of the Day"));
		books.add(new Book("Kazuo Ishiguro", "Never Let Me Go"));
		books.add(new Book("Kazuo Ishiguro", "The Buried Giant"));
		books.add(new Book("Jane Austen", "Pride and Prejudice"));
		books.add(new Book("Jane Austen", "Emma"));
		books.add(new Book("Jane Austen", "Persuasion"));
		books.add(new Book("Jane Austen", "Mansfield Park"));
		books.add(new Book("Chinua Achebe", "Things Fall Part"));
		books.add(new Book("Jane Austen", "No Longer at Ease"));
		books.add(new Book("Jane Austen", "Home and Exile"));
		
		return books;
	}

}
