import java.util.*;

/**
 * Write a description of class DeckOfCards here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DeckOfCards
{
    // instance variables - replace the example below with your own
     ArrayList<Card> arr = new ArrayList<Card>();
    

    /**
     * Constructor for objects of class DeckOfCards
     */
    public DeckOfCards()
    {
        String suit = "Spade ";
        for(int i=0;i<9;i++)
        {
            
            
            
            String str =i+2+"";
            Card temp = new Card(str,suit);
            arr.add(temp);
            
        }
        Card Jack = new Card("Jack ",suit);
        Card Queen = new Card("Queen ",suit);
        Card King = new Card("King ",suit);
        Card Ace = new Card("Ace ",suit);
        arr.add(Jack);
        arr.add(Queen);
        arr.add(King);
        arr.add(Ace);
        
         suit = "Hearts ";
        for(int i=0;i<9;i++)
        {
            
            
            
            String str =i+2+"";
            Card temp = new Card(str,suit);
            arr.add(temp);
            
        }
         Jack = new Card("Jack ",suit);
         Queen = new Card("Queen ",suit);
         King = new Card("King ",suit);
         Ace = new Card("Ace ",suit);
        arr.add(Jack);
        arr.add(Queen);
        arr.add(King);
        arr.add(Ace);
        
         suit = "Clubs ";
        for(int i=0;i<9;i++)
        {
            
            
            
            String str =i+2+"";
            Card temp = new Card(str,suit);
            arr.add(temp);
            
        }
         Jack = new Card("Jack ",suit);
         Queen = new Card("Queen ",suit);
         King = new Card("King ",suit);
         Ace = new Card("Ace ",suit);
        arr.add(Jack);
        arr.add(Queen);
        arr.add(King);
        arr.add(Ace);
        
         suit = "Diamonds ";
        for(int i=0;i<9;i++)
        {
            
            
            
            String str =i+2+"";
            Card temp = new Card(str,suit);
            arr.add(temp);
            
        }
         Jack = new Card("Jack ",suit);
         Queen = new Card("Queen ",suit);
         King = new Card("King ",suit);
         Ace = new Card("Ace ",suit);
        arr.add(Jack);
        arr.add(Queen);
        arr.add(King);
        arr.add(Ace);
        
    }
    
    public void shuffleDeck()
    {
        int num;
        Card temp;
        for(int j=0;j<50;j++)
        {
        
        for(int i=0;i<cardsLeft()-1;i++)
        {
            num = (int)(Math.random()*52);
            temp=arr.get(i);
            arr.set(i,arr.get(num));
            arr.set(num,temp);
        }
        // does not matter if deck is full or not.
        }
    }
    public ArrayList get()
    {
        return arr;
    }
    public Card dealCard()
    {
        return arr.remove(0);
        
    }
    public int cardsLeft()
    {
        return arr.size();
    }
    public String toString()
    {
        String str="";
        for(int i=0;i<cardsLeft();i++)
        {
            str=str+arr.get(i).toString();
        }
        return str;
    }
}
