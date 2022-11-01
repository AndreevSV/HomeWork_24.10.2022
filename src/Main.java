public class Main {
    public static void main(String[] args) {
        Author author = new Author("Кей", "Хорстманн");
        Book book = new Book("Java. Библиотека профессионала. Том 1. Основы", 2019, author);
        System.out.println("book = " + book.bookName + " " + book.publicationYear + " " + author.author);

        Author author2 = new Author("Герберт", "Шилд");
        Book book2 = new Book("Java. Руководство для начинающих. 7-е издание", 2018, author2);
        System.out.println("book2 = " + book2.getBookName() + " " + book2.getPublicationYear() + " " + author2.getAuthor());

        book.setPublicationYear(2022);
        System.out.println("book = " + book.bookName + " " + book.publicationYear + " " + author.author);
    }
}