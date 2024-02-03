package ca.mcmaster.se2aa4.absence.c;

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

    public Color getColor() { return color; }
    public void setColor(Color color) { this.color = color; }

    public Value getValue() { return value; }
    public void setValue(Value value) { this.value = value; }


    public boolean isJoker() { return isJoker; }

    @Override
    public String toString() {
        return this.value + " " + this.color + (this.isJoker? " [Joker]":"");
    }

}
