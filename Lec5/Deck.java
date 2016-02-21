import java.util.*;
class Deck {

	public static int numSuit= 4;
	public static int numRank= 13;
	public static int numCards= numSuit*numRank;
	private static Card cards[][];

	public Deck() {
		cards= new Card[this.numSuit][this.numRank];
		for (int i=1;i<=numSuit ;i++ )
			for (int j=1;j<=numRank ;j++ ) {
				cards = new Card[i][j];
		}
	}
	public static Card getCard(int suit, int rank) {
		return cards[suit-1][rank-1];
	}

}