/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;

import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author JpCor
 *
 */

public class CardTrick {

    public static void main(String[] args) {
        Card[] magicHand = new Card[7];

        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            c.setSuit(generateRandomSuit());
            c.setValue(generateRandomValue());
            magicHand[i] = c;
            System.out.println(magicHand[i].getSuit() + " " + magicHand[i].getValue());
        }

        //addiong luckyCard for myself (13 of hearts or King of hearts)
        Card luckyCard = new Card();
        luckyCard.setSuit("hearts");
        luckyCard.setValue(13); 
        System.out.println("lucky card: " + luckyCard.getSuit() + " " + luckyCard.getValue());

      

      

        boolean found = false;
        for (Card card : magicHand) {
            if (card.getValue() == luckyCard.getValue() && card.getSuit().equals(luckyCard.getSuit())) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Congratulations! Your card was chosen");
        } else {
            System.out.println("Sorry, better luck next timee!!");
        }
    }

             private static String generateRandomSuit() {
        String[] suits = {"Hearts", "Diamonds", "Spades", "Clubs"};
        int randomIndex = (int) (Math.random() * suits.length);
        return suits[randomIndex];
    }

     private static int generateRandomValue() {
        return (int) (Math.random() * 13) + 1;
    }
}
