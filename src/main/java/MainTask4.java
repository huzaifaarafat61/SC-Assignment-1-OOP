public class MainTask4 {

    public static void main(String[] args) {

        Book book = new Book("Java Programming", "James Gosling");

        Member member = new Member("Ali", 101);

        member.borrowBook(book);

        System.out.println(
            "Book Available: " + book.isAvailable()
        );
    }
}