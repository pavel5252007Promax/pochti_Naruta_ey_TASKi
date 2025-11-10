public class mainBook {
    public static void main(String[] args) {
        Book book = new Book();
        Book book1 = new Book("ЧУЧУКА", "ЛЕПС", 52, true, 36);
        book1.displayInfo();
        System.out.println("/////////////////////////////////");
        book1.borrowBook();
        System.out.println("/////////////////////////////////");
        book1.displayInfo();
        System.out.println("/////////////////////////////////");
        book1.updateYear(404);
        book1.returnBook();
        book1.displayInfo();
    }
}