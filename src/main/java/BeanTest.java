public class BeanTest {
    public static void main(String[] args) {
    //Add New Author
        Authors author = new Authors(1, "Oscar", "Wilde");
        System.out.println(author.getId());
        System.out.println(author.getFirst_name());
        System.out.println(author.getLast_name());
    //Add New Quote
        Quotes quote = new Quotes(1, "Oscar Wilde", "Be yourself; everyone else is already taken.");
        System.out.println(quote.getId());
        System.out.println(quote.getAuthor());
        System.out.println(quote.getQuote());
    //Add New Album
        Album album = new Album(1, "The Beatles", "Abbey Road", "Rock", 1969, 32.2f);
        System.out.println(album.getId());
        System.out.println(album.getArtist());
        System.out.println(album.getName());
        System.out.println(album.getGenre());
        System.out.println(album.getRelease_date());
        System.out.println(album.getSales());
    //Add new Quote
        Quotes quote2 = new Quotes(2, "George Carlin", "A day without sunshine is like, you know, night.");
        System.out.println(quote2.getId());
        System.out.println(quote2.getAuthor());
        System.out.println(quote2.getQuote());
    //Add New Quote
        Quotes quote3 = new Quotes(3, "Oscar Wilde", "I am so clever that sometimes I don't understand a single word of what I am saying.");
        System.out.println(quote3.getId());
        System.out.println(quote3.getAuthor());
        System.out.println(quote3.getQuote());
        //Print all quotes by Author
        
    }
}
