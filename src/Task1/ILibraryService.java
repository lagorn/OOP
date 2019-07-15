package Task1;

public interface ILibraryService {
    void addingBook(Library library,Book book);
    void removeBook(Library library,Book book);
    Book findBooks(Library library,Book book);
}
