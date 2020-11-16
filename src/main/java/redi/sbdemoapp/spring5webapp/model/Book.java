package redi.sbdemoapp.spring5webapp.model;

import java.util.Set;

public class Book {

    private String title;
    private String ison;
    private Set<Author> authors;

    public Book() {
    }

    public Book(String title, String ison, Set<Author> authors) {
        this.title = title;
        this.ison = ison;
        this.authors = authors;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIson() {
        return ison;
    }

    public void setIson(String ison) {
        this.ison = ison;
    }

    public Set<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(Set<Author> authors) {
        this.authors = authors;
    }
}
