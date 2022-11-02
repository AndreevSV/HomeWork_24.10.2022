public class Author {
    private final String name; // Инициализируем переменную для name
    private final String surname; // Инициализируем переменную для surname
    private final String author; // Инициализируем переменную для author (полное имя)

    public Author(String name, String surname) { // Создаем объект Author
        this.name = name;
        this.surname = surname;
        this.author = name + " " + surname;
     }

    public String getAuthor() { // Создаем геттер fullName
        return author;
    }

    public String getName() { // Создаем геттер name
        return name;
    }

    public String getSurname() { // Создаем геттер surname
        return surname;
    }

}
