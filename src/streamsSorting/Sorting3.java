package streamsSorting;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
//Sorting of Book objects based on their title field in ascending order using Java streams.
class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }


    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
public class Sorting3 {

	public static void main(String[] args) {
		List<Book> books = new ArrayList<>();
        books.add(new Book("Java Programming", "John Doe"));
        books.add(new Book("Introduction to Algorithms", "Thomas Cormen"));
        books.add(new Book("Clean Code", "Robert C. Martin"));
        books.add(new Book("Effective Java", "Joshua Bloch"));

        
        List<Book> list = books.stream()
        .sorted(Comparator.comparing(Book::getTitle))
        .collect(Collectors.toList());
        
        System.out.println(list);
	}

}
