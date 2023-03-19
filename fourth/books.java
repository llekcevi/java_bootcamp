package fourth;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.io.*;

// upotrijebiti Set za uklanjanje duplikata u mapi
// upotrijebiti List za spremanje sortirane liste a-z po naslovu

public class books {
    public static void main(String[] args) throws IOException {
        Map<String, String> library = new HashMap<>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your favorite books and authors. Enter 'stop' to finish.");

        while (true) {
            System.out.println("Book title:");
            String book = scanner.nextLine();
            System.out.println("Author name:");
            String author = scanner.nextLine();
            if (book.equals("stop") || author.equals("stop")) {
                break;
            }

            library.put(book, author);
        }
        scanner.close();

        for (String _book : library.keySet()) {
            String _author = library.get(_book);
            System.out.println(_book + " by " + _author);
        }
    }

}
