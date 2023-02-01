package e;

import java.util.Optional;

public class Card {

    private Color color;
    private Value value;

    public Card(Color color, Value value) {
        this.color = color;
        this.value = value;
    }

    public Card() {
    }

    public Optional<Color> color() {
        return (color == null? Optional.empty() : Optional.of(this.color));
    }

    public Optional<Value> value() {
        return (value == null? Optional.empty(): Optional.of(this.value));
    }

}
