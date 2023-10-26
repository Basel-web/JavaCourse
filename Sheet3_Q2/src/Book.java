import java.util.Arrays;

public class Book {
    private int ISBN;
    private String name;
    private Author[] arOfAuthors;
    private String publisher;
    private double price;

    public Book(int ISBN, String name, Author[] arOfAuthors, String publisher, double price) {
        this.ISBN = ISBN;
        this.name = name;
        this.arOfAuthors = arOfAuthors;
        this.publisher = publisher;
        this.price = price;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Author[] getArOfAuthors() {
        return arOfAuthors;
    }

    public void setArOfAuthors(Author[] arOfAuthors) {
        this.arOfAuthors = arOfAuthors;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "ISBN=" + ISBN +
                ", name='" + name + '\'' +
                ", arOfAuthors=" + Arrays.toString(arOfAuthors) +
                ", publisher='" + publisher + '\'' +
                ", price=" + price +
                '}';
    }
//    @Override why it gives me an error
    public boolean equals(Book b){
        return b.ISBN == ISBN;
    }
}
