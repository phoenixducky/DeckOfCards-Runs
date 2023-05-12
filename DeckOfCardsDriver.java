
/**
 * Write a description of class Driver here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DeckOfCardsDriver
{
    public static void main()
    {
        DeckOfCards deck = new DeckOfCards();
        System.out.println(deck.toString());
        deck.shuffleDeck();
        System.out.println("---------------------------");
        System.out.println(deck.toString());
        System.out.println("---------------------------");
        int size = deck.cardsLeft();

        for(int i=0;i<size;i++)
        System.out.print(deck.dealCard());
        
        
        
        
    }
}
