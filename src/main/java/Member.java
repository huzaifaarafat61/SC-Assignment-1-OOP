public class Member {

    private String name;
    private int memberId;

    public Member(String name, int memberId) {
        this.name = name;
        this.memberId = memberId;
    }

    public void borrowBook(Book book) {

        if (book.isAvailable()) {

            book.borrowBook();

            System.out.println(
                name + " borrowed " + book.getTitle()
            );

        } else {

            System.out.println(
                "Book is not available."
            );
        }
    }
}