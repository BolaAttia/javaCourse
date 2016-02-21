import java.util.*;

class Demo
{
	public static int Suit= 4;
	public static int Rank= 13;

		public static void main(String[] args) {
				for (int i=1;i<=Suit ;i++ ){
					for (int j=1;j<=Rank ;j++ ) {
						System.out.format("%n %s of %s ",Card.rankToString(j),Card.suitToString(i) );

					}System.out.println();}
		}
	
	
}