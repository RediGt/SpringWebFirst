package redi.sbdemoapp.spring5webapp.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import redi.sbdemoapp.spring5webapp.model.Author;
import redi.sbdemoapp.spring5webapp.model.Book;
import redi.sbdemoapp.spring5webapp.model.Publisher;
import redi.sbdemoapp.spring5webapp.repositories.AuthorRepository;
import redi.sbdemoapp.spring5webapp.repositories.BookRepository;
import redi.sbdemoapp.spring5webapp.repositories.PublisherRepository;

@Component
public class BootStrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;

    public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository,
                         PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Publisher publisher = new Publisher();
        publisher.setName("SFG Publishing");
        publisher.setCity("St Petersburg");
        publisher.setState("FL");

        publisherRepository.save(publisher);

        System.out.println("Publisher Count: " + publisherRepository.count());


        Author eric = new Author("Eric", "Evans");
        Book ddd = new Book("Domain Driven Design", "123123");
        eric.getBooks().add(ddd);
        ddd.getAuthors().add(eric);

        authorRepository.save(eric);
        bookRepository.save(ddd);

        Author rod = new Author("Rod", "Johnson");
        Book noEJB = new Book("J2EE Development without EJB", "132846");
        rod.getBooks().add(noEJB);
        noEJB.getAuthors().add(rod);

        authorRepository.save(rod);
        bookRepository.save(noEJB);

        //System.out.println("Started in Bootstrap");
        System.out.println("Number of Books: " + bookRepository.count());
    }
}
