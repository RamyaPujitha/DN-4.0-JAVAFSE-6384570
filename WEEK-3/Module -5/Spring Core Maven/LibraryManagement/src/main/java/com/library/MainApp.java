package main.java.com.library;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ApplicationContext();
        BookService bookService = context.getBean("bookService", BookService.class);
        bookService.addBook("Spring DI Example");
    }
}
