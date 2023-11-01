package services;

import com.example.top_trumps_start_code.models.Card;
import com.example.top_trumps_start_code.models.Rank;
import com.example.top_trumps_start_code.models.Suit;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TopTrumpService {

    private Card card1;
    private Card card2;
//    private String currentCard;
    private ArrayList<Card> myCards;




    public TopTrumpService(){

    }


    public Reply startNewGame(){
        this.card1 = new Card();
        this.card2 = new Card();
        this.myCards = new ArrayList<>();
    }

    public Card getCard1() {
        return card1;
    }

    public void setCard1(Card card1) {
        this.card1 = card1;
    }

    public Card getCard2() {
        return card2;
    }

    public void setCard2(Card card2) {
        this.card2 = card2;
    }

    public ArrayList<Card> getMyCards() {
        return myCards;
    }

    public void setMyCards(ArrayList<Card> myCards) {
        this.myCards = myCards;
    }
}
