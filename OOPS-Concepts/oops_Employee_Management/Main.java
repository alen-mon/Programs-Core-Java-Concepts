import java.util.ArrayList;
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
  System.out.print("Enter the title of book 1: ");
String title1 = scanner.nextLine();
System.out.print("Enter the author of book 1: ");
String author1 = scanner.nextLine();
System.out.print("Enter the ISBN of book 1: ");
String isbn1 = scanner.nextLine();

System.out.print("Enter the title of book 2: ");
String title2 = scanner.nextLine();
System.out.print("Enter the author of book 2: ");
String author2 = scanner.nextLine();
System.out.print("Enter the ISBN of book 2: ");
String isbn2 = scanner.nextLine();

Book book1 = new Book(title1, author1, isbn1);
Book book2 = new Book(title2, author2, isbn2);
Book.add_Book(book1);
Book.add_Book(book2);

ArrayList<Book> bookCollection = Book.get_BookCollection();

System.out.println("List of books:");
for (Book book : bookCollection) {
  System.out.println(book.get_Title() + " by " + book.get_Author() + ", ISBN: " + book.get_ISBN());
}

Book.remove_Book(book1);

System.out.println("\nAfter removing " + book1.get_Title() + ":");
System.out.println("List of books:");
for (Book book : bookCollection) {
  System.out.println(book.get_Title() + " by " + book.get_Author() + ", ISBN: " + book.get_ISBN());
}

scanner.close();
}
}
