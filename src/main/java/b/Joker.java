package b;

public class Joker extends Card {
    @Override
    public Color getColor() {
        throw new UnsupportedOperationException();
    }

    @Override
    public Value getValue() {
        throw new UnsupportedOperationException();
    }

}
