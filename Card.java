
/**
 * Write a description of class Cards here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Card
{
    // instance variables - replace the example below with your own
    String rank;
    String suit;
    

    /**
     * Constructor for objects of class Cards
     */
    public Card(String ran, String sui)
    {
        rank=ran;
        suit=sui;
    }

    public String getSuit()
    {
        return suit;
    }
    public String getRank()
    {
        return rank;
    }
    public String toString()
    {
        return "Rank: "+rank+ "  suit: "+suit+"\n";
    }
}
