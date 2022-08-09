package E6;

import java.util.ArrayList;

public class Author extends Book{
    private String name;
    private String email;
    private char gender;

    public Author(String name, ArrayList<Author> authors, double price) {
        super(name, authors, price);
    }
}
