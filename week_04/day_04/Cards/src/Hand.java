import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;

public class Hand implements Comparable<Hand> {
private ArrayList<Card> cards;

public Hand() {
this.cards=new ArrayList<Card>();    
}

public void add(Card card) {
  cards.add(card);
}

public void print() {
    for (Card card: cards)
    {
        System.out.println(card.toString());
    }
}

    public void sort() {
        Collections.sort(this.cards);
    }
    
    public int compareTo(Hand other)
    {int firstValue=this.getValue();
    int secondValue=other.getValue();
    
    if (firstValue>secondValue)
    {
        return 1;
    }
    if (firstValue<secondValue){
        return -1;
    }
        return 0;
    }
    

    
    public int getValue() {
       int value=0;
        for (Card card: cards){
        value+=card.getValue();
    }
        return value;
    }
    
    
    public void sortAgainstSuit(){
          SortAgainstSuitAndValue suitSorter = new SortAgainstSuitAndValue();
        Collections.sort(cards, suitSorter );
    }

}
