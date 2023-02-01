package d;

public class Card {

    private Color color;
    private Value value;

    public Card(Color color, Value value) {
        this.color = color;
        this.value = value;
    }

    public Card() {
        this.color = Color.NONE;
        this.value = Value.NONE;
    }

    public Color getColor() {
        return color;
    }

    public Value getValue() {
        return value;
    }

}
