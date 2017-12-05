package org.cards.deck;
public class CardsTest
{
   // execute application
   public static void main( String args[] )
   {
      CardsInDeck dealCards = new CardsInDeck();
      dealCards.shuffle(); // place Cards in random order
      
      for (int i = 0; i < 53; i++){
    	  System.out.println("card " + i + " is " + dealCards.dealOneCard());
      }
      
   }
}


