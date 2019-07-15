package Task1;

public class DemoService implements IDemoService {
            public void execute(){
            Library library = new Library();
            ILibraryService iLibraryService = new LibraryService();

            System.out.println("Добавление 5 книг");

            iLibraryService.addingBook(library,new Book("Страуструп, Б.И.", "Язык программирования C++",2012));
            iLibraryService.addingBook(library,new Book(" Монахов, В.В.", "Язык программирования Java и среда NetBeans",2012));
            iLibraryService.addingBook(library,new Book(" Керниган, Б.У.", "Язык программирования С",2013));
            iLibraryService.addingBook(library,new Book(" Кауфман, В.Ш.", "Языки программирования. Концепции и принципы",2011));
            iLibraryService.addingBook(library,new Book(" Гергель, В.П.", "Современные языки и технологии паралелльного программирования",2012));

            System.out.println("Добавление 6 книги");

            iLibraryService.addingBook(library,new Book(" Никколо Макиавелли", "Государь",2017));

            System.out.println("Удаление книги");

            iLibraryService.removeBook(library,new Book(" Керниган, Б.У.", "Язык программирования С",2013));

            System.out.println("Поиск книги");

            Book bookSearch = new Book("Страуструп, Б.И.","Язык программирования C++",2012);

            iLibraryService.findBooks(library, bookSearch);
        }
}
