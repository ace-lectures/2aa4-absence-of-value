package ca.mcmaster.se2aa4.absence.d;

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

    public Color getColor() { return color; }
    public void setColor(Color c) { this.color = c; }

    public Value getValue() { return value; }
    public void setValue(Value value) { this.value = value; }

    public Boolean isJoker() { return this.color == Color.NONE && this.value == Value.NONE; }

}
