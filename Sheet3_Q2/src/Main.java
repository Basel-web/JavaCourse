
public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Basil", "Basil@example.com");
        Author author2 = new Author("Ammar", "Ammar@example.com");
        Author author3 = new Author("Mosa", "Mosa@example.com");
        Author author4 = new Author("Belal", "Belal@example.com");
        Author[] authors1 = {author1, author2};
        Author[] authors2 = {author3, author4};
        for (Author value : authors1) {
            System.out.println(value.toString());
        }
        System.out.println();
        for (Author author : authors2) {
            System.out.println(author.toString());
        }
        Book book1 = new Book(1,"5 Mints Earlier",authors1,"semenz",250);
        Book book2 = new Book(2,"Java for beginners",authors1,"semenz",350);

        System.out.println(book1.toString());
        System.out.println(book2.toString() + "\n");
        System.out.println(book1.equals(book2));
    }
}