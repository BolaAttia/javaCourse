import java.util.Scanner;
class Card {
	final int Rank;
	final int Suit;
	public final static int DEAMOND=1;
	public final static int CLUBS=2;
	public final static int HEARTS=3;
	public final static int SPADES=4;

	public final static int ACE=1;
	public final static int DEUCE=2;
	public final static int THREE=3;
	public final static int FOUR=4;
	public final static int FIVE=5;
	public final static int SIX=6;
	public final static int SEVEN=7;
	public final static int EIGHT=8;
	public final static int NINE=9;
	public final static int TEN=10;
	public final static int JACK=11;
	public final static int QUEEN=12;
	public final static int KING=13;

	public Card (int rank, int suit) {
		this.Rank=rank;
		this.Suit=suit;
	}
	public int getSuit() {
		
		return this.Suit;
		
	}
	public int getRank() {

		return this.Rank;
		
	}
	public static boolean isValidRank(int rank) {
		if (rank>=ACE && rank<=KING) {

			return true;
		}
		else {
			return false;
		}
	}
	public static boolean isValidSuit(int suit) {
		if (suit>=DEAMOND && suit<=SPADES) {
				return true;
		}
		else {
			return false;
		}
	}
	public static String rankToString(int rank) {
		if (isValidRank(rank)) {
			
		
		switch (rank) {
			case ACE: return "ACE";
			
			case DEUCE: return "DEUCE";
			
			case THREE: return "THREE";
			
			case FOUR: return "FOUR";
			
			case FIVE: return "FIVE";
			
			case SIX: return "SIX";
			
			case SEVEN: return "SEVEN";
			
			case EIGHT: return "EIGHT";
			
			case NINE: return "NINE";
			
			case TEN: return "TEN";
			
			case JACK: return "JACK";
			
			case QUEEN: return "QUEEN";
			
			case KING: return "KING";
						
			default:
				return "Not Valid Rank";
				
			}
		}
		else {return "error";}
	}
	public static String suitToString(int suit) {
		if (isValidSuit(suit)) {

			switch (suit) {
				case DEAMOND: return "DEAMOND";
				
				case CLUBS: return "CLUBS";
				
				case HEARTS: return "HEARTS";
				
				case SPADES: return "SPADES";
				
				default:
				return "Not Valid Suit";
				
			}
		}
		else {return "error";}

	}


/*	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		int c1 = s.
		Card card = new Card(10,2);

		card.getRank();
		card.getSuit();
	}
*/
}