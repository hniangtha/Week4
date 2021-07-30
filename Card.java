import java.util.Random;

public class Card {

    Random generator = new Random();

    int suit;
    int faceValue;

    public Card(){

        faceValue = generator.nextInt(13)+1;
        suit = generator.nextInt(4)+1;
    }

    public Card( int faceValue, int suit){
        this.faceValue = faceValue;
        this.suit = suit;
    }

    public String getSuit() {

        if (suit == 1)
            return " Spades";
        if (suit == 2)
            return " Heart";
        if (suit == 3)
            return " Diamonds";
        if (suit == 4)
            return " Clubs";

        return "Suit" + suit;
    }

    public String getFaceValue(){

        if (faceValue ==1)
            return "Ace";
        if (faceValue ==2)
            return "2";
        if (faceValue ==3)
            return "3";
        if (faceValue ==4)
            return "4";
        if (faceValue ==5)
            return "5";
        if (faceValue ==6)
            return "6";
        if (faceValue ==7)
            return "7";
        if (faceValue ==8)
            return "8";
        if (faceValue ==9)
            return "9";
        if (faceValue ==10)
            return "10";
        if (faceValue ==11)
            return "Jack";
        if (faceValue ==12)
            return "Queen";
        if (faceValue ==13)
            return "King";

        return "Value" + faceValue;

    }

    public String toString()

    {
        return  getFaceValue() + " of " + getSuit();
    }

    public static void main(String[] s)
    {
        System.out.println(" Your Cards: " + "\n");
        for (int i = 1; i <= 5; i++) {
            Card card = new Card();
            System.out.println(card);
        }
    }

}

