public class Main {
    public static void main(String[] args) {
    String myBook1="The echoes of tomorrow";
    String myAuthor1="Amelia Hartwell";
    int pubYear1=2006;
    int numPages1=230;
        boolean isRead1=false;

    String myBook2="The painted garden";
    String myAuthor2="Isabelle Green";
        int pubYear2=1995;
        int numPages2=325;
        boolean isRead2 =true;

        String myBook3="Whispers garden";
        String myAuthor3="Elliot Sterling";
        int pubYear3=1995;
        int numPages3=210;
        boolean isRead3 =true;

        System.out.println("Title of the first book:  " +myBook1 + "\nAuthor of the book1:  "  + myAuthor1
                + "\nNumber of book pages:   " + numPages1  + "\nAm I read the book:  " + isRead1);

        System.out.println("Title of the second book:  " +myBook2 + "\nAuthor of the book2:  "  + myAuthor2
                + "\nNumber of book pages:   " + numPages2  + "\nAm I read the book:  " + isRead2);

        System.out.println("Title of the third book:  " +myBook3 + "\nAuthor of the book3:  "  + myAuthor3
                + "\nNumber of book pages:   " + numPages3  + "\nAm I read the book:  " + isRead3);

        int result=(numPages1 + numPages2 + numPages3);
        int averageCalc= (pubYear1 + pubYear2 + pubYear3)/3;


        System.out.println("The total number of all pages:  " +result);
        System.out.println("The average year of the books:  " +averageCalc);

    }
}