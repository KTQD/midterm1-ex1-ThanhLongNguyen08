import org.example.Book;
import org.example.Item;
import org.example.MP3;
public class Main {
    public static void main(String[] args) {

        Item book = new Book("The Godfather","","1111",5,"Mario Puzzo",462,"novel");
        Item mp3 = new MP3("Always with me","","2222",100, Duration.ofMinutes(5));

        book.showInfo();
        mp3.showInfo();
    }

    }
}
