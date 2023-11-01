package com.example.top_trumps_start_code.services;

import com.example.top_trumps_start_code.models.Card;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class TopTrumpService {

    private Card card1;
    private Card card2;
    private ArrayList<Card> cards;


    public TopTrumpService() {
    }


        public String callCards (ArrayList < Card > cards)
        {

            card1 = cards.get(0);
            card2 = cards.get(1);


            if (card1.getCardValue() > card2.getCardValue()) {
                return card1.getRank() + " of " + card1.getSuit() + " wins";
            } else if (card2.getCardValue() > card1.getCardValue()) {
                return card2.getRank() + " of " + card2.getSuit() + " wins";
            } else {

                return " It's a tie";
            }


        }
    }

