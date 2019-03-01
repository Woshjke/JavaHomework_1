package lab3.task4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Library {
    private String libraryName;
    private String adress;
    private ArrayList<Book> books;

    public void showBooks() {
        books.forEach(Book::info);
    }

    public int getNumOfBooks() {
        return books.size();
    }

    public int getNumOfAuthors(ArrayList<Book> books) {
        Set<String> uniqAuthors = new HashSet<>();

        for (Book iter : books) {
            uniqAuthors.add(iter.getAuthor());
        }

        return uniqAuthors.size();
    }

    public void showBooksPublishedInPeriod(int dateAfter, int dateBefore) {
        if (dateAfter <= dateBefore || dateAfter < 0 || dateBefore < 0) {
            System.out.println("Invalid params!");
        }
        for (Book iter : books) {
            if (iter.getYear() >= dateAfter && iter.getYear() <= dateBefore) {
                iter.info();
            }
        }
    }


}

