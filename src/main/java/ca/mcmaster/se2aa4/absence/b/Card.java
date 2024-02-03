package ca.mcmaster.se2aa4.absence.b;

public class Card {

    protected Color color;
    protected Value value;

    public Card(Color color, Value value) {
        this.color = color;
        this.value = value;
    }

    protected Card() { }

    public Color getColor() {
        return color;
    }

    public Value getValue() {
        return value;
    }

}
