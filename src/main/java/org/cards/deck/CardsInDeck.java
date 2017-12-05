package org.cards.deck;

import java.util.Random;

public class CardsInDeck {
	private Card deckArray[];
	private int currentCard;
	private final int NUMBER_OF_CARDS = 52;
	private Random generateRandomNumber;

	public CardsInDeck() {
		String faces[] = { "Ace", "Deuce", "treys", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack",
				"Queen", "King" };
		String suits[] = { "Hearts", "Diamonds", "Clubs", "Spades" };

		deckArray = new Card[NUMBER_OF_CARDS];
		currentCard = 0;
		generateRandomNumber = new Random();

		for (int count = 0; count < deckArray.length; count++)
			deckArray[count] = new Card(faces[count % 13], suits[count / 13]);
	}

	public void shuffle() {

		currentCard = 0;

		for (int first = 0; first < deckArray.length; first++) {

			int second = generateRandomNumber.nextInt(NUMBER_OF_CARDS);

			Card temp = deckArray[first];
			deckArray[first] = deckArray[second];
			deckArray[second] = temp;
		}
	}

	public Card dealOneCard() {

		if (currentCard < deckArray.length)
			return deckArray[currentCard++];
		else
			return null;
	}
}
