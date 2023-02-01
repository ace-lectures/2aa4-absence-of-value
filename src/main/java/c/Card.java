package c;

public class Card {

    private Color color;
    private Value value;
    private final boolean isJoker;

    public Card(Color color, Value value) {
        this.color = color;
        this.value = value;
        this.isJoker = false;
    }

    public Card() {
        this.color = Color.BLUE;
        this.value = Value.ONE;
        this.isJoker = true;
    }

    public Color getColor() {
        return color;
    }

    public Value getValue() {
        return value;
    }

    public boolean isJoker() { return isJoker; }

    @Override
    public String toString() {
        return this.value + " " + this.color + (this.isJoker? " [Joker]":"");
    }

}
