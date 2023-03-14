package model;
import java.util.ArrayList;

public class BeanTest {
    public static void main(String[] args) {

        Author georgeCarlin = new Author(1, "George", "Carlin");
        Author nickOfferman = new Author(2, "Nick", "Offerman");
        Quote quote1 = new Quote("The reason I talk to myself is because I’m the only one whose answers I accept.", georgeCarlin);
        Quote quote2 = new Quote("I think it's the duty of the comedian to find out where the line is drawn and cross it deliberately.", georgeCarlin);
        Quote quote3 = new Quote("Damn it all, you have been given a life on this beautiful planet! Get off your ass and do something!", nickOfferman);
        Quote quote4 = new Quote("Really, all religious teachings can be boiled down to: Just be cool.", nickOfferman);

        ArrayList<Quote> quotes = new ArrayList<>();
        quotes.add(quote1);
        quotes.add(quote2);
        quotes.add(quote3);
        quotes.add(quote4);



        for (Quote quote : quotes) {
            System.out.println(quote.getContent() + " - " + quote.getAuthor().getFirstName() + " " + quote.getAuthor().getLastName());
        }
    }
}