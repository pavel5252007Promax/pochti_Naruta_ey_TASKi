public class Book{
    private String title;
    private String author;
    private int year;
    private boolean isAvailable;
    private int pageCount;

    public Book(){
        this("title", "author", 0, true, 10);
    }
    public Book(String title, String author, int year){
        this(title, author, year, true, 10);
    }
    public Book(String title, String author, int year, boolean isAvailable, int pageCount){
        this.title = title;
        this.author = author;
        this.year = year;
        this.isAvailable = isAvailable;
        this.pageCount = pageCount;
    }
    public void displayInfo(){
        System.out.println("Название книги: " + this.title);
        System.out.println("Автор: " + this.author);
        System.out.println("Ей лет : " + this.year);
        System.out.println("Колчиство страниц: " + this.pageCount);
        if (this.isAvailable){
            System.out.println("Есть в наличие");
        }
        else{
            System.out.println("Нееееееет в наличии");
        }
    }
    public void borrowBook(){
        System.out.println("На книгу епта");
        isAvailable = false;
    }
    public void returnBook(){
        System.out.println("Возвращаю нах");
        isAvailable = true;
    }
    public void updateYear(int newYear){
        year = newYear;

    }
}