public class Book {
    String bookName; // Инициализируем переменную названия кники
    int publicationYear; //Инициализируем переменную года публикации
    Author author;

    public Book(String bookName, int publicationYear, Author author) {
        this.bookName = bookName;
        this.publicationYear = publicationYear;
        this.author = author;
    }

    public String getBookName() { // Устаналиваем геттер на название книги
        return bookName;
    }

    public void setPublicationYear(int publicationYear) { // Устанавливаем сеттер на дату публикации
        this.publicationYear = publicationYear;
    }

    public int getPublicationYear() { // Устанавливаем геттер на дату публикации
        return publicationYear;
    }



}
