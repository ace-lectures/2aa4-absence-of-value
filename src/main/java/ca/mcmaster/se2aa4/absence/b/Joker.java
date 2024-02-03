package ca.mcmaster.se2aa4.absence.b;

public class Joker extends Card {

    public Joker() {
        this.color = null;
        this.value = null;
    }

    @Override
    public Color getColor() { throw new UnsupportedOperationException(); }
    public void setColor(Color color) { this.color = color; }

    @Override
    public Value getValue() { throw new UnsupportedOperationException(); }
    public void setValue(Value value) { this.value = value; }

}
