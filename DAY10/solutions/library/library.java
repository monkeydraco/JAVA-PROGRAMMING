package DAY10.solutions.library;

public class library 
{
    int totalBooks=3;

    public book createBooks(book b)
    {
        b=new book();           // this only changes the local refrence variable and not the real object that it points to.
        return b;

    }

    public void detailsOfBooks(book b)
    {
        b.bookId=101;
        b.bookName="Java";
        b.bookPrice=500;
        b.bookPages=150;

    }

    public void displayBooks(book b)
    {
        System.out.println(b.bookId);
        System.out.println(b.bookName);
        System.out.println(b.bookPrice);
        System.out.println(b.bookPages);
        
    }

    public void main()
    {
        book[] Book=new book[3];

        //book1
        Book[0]=createBooks(Book[0]);
        detailsOfBooks(Book[0]);
        displayBooks(Book[0]);

        //book2
        Book[1]=createBooks(Book[1]);
        detailsOfBooks(Book[1]);
        displayBooks(Book[1]);

        //book3
        Book[2]=createBooks(Book[2]);
        detailsOfBooks(Book[2]);
        displayBooks(Book[2]);

    }

    
}
