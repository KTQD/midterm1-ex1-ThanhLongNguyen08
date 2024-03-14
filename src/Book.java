public class Book extends Item{
      private String author;
    private int numberOfPages;
    private String genre;

    public Book(String name, String description, String ID, int price, String author, int numberOfPages, String genre) {
        super(name, description, ID, price);
        this.author = author;
        this.numberOfPages = numberOfPages;
        this.genre = genre;
    }
    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("author: "+author);
        System.out.println("number of pages: "+numberOfPages);
        System.out.println("genre: "+genre);
    }
}
