package Task1;

public class LibraryService implements ILibraryService{
    @Override
    public void addingBook(Library library,Book book){
        for (int i = 0; i < library.getBooks().length ; i++) {
            if(library.getBooks()[i]==null){
                library.getBooks()[i] = book;
            }
        }
    }
    @Override
    public void removeBook(Library library,Book book){
        for (int i = 0; i < library.getBooks().length ; i++) {
            if(library.getBooks()[i]==null){continue;}
            else if (library.getBooks().equals(book)) {
                library.getBooks()[i]= null;
            }
        }
    }
    @Override
    public Book findBooks(Library library,Book book){
        for (int i = 0; i < library.getBooks().length; i++) {
            if(library.getBooks().equals(book)){
                return library.getBooks()[i];
            }
        }
        return null;
    }
}


