import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        run_A();
        run_B();
        run_C();
        run_D();
        run_E();
    }

    public static void run_A() {
        System.out.println("## RUN NULL VISIBLE (Option A)");
        Set<a.Card> cards = new HashSet<>();
        for (a.Color c: a.Color.values()) {
            for(a.Value v: a.Value.values()) {
                cards.add(new a.Card(c,v));
            }
        }
        cards.add(new a.Card()); // Joker is the "non specified" card

        for (a.Card card : cards) {
            try { // Crash because of the joker using null as values and exposing them
                System.out.println("[" + card.getValue().toString() + "," + card.getColor().toString() + "]");
            } catch (NullPointerException e) { System.err.println(e); break; }
        }

        for (a.Card card : cards) {
            if (card.isJoker()) // responsibility of the caller to check if Joker
                System.out.println("Joker found!");
        }
    }
    public static void run_B() {
        System.out.println("## RUN INHERITANCE (Option B)");
        Set<b.Card> cards = new HashSet<>();
        for (b.Color c: b.Color.values()) {
            for(b.Value v: b.Value.values()) {
                cards.add(new b.Card(c,v));
            }
        }
        cards.add(new b.Joker());
        for (b.Card card : cards) {
            try { // crashes because of the unsupported operation exception
                System.out.println("[" + card.getValue().toString() + "," + card.getColor().toString() + "]");
            } catch (UnsupportedOperationException e) { System.err.println(e); break; }
        }

        for (b.Card card : cards) {
            if (card instanceof b.Joker) // responsibility of the caller to check if Joker (with dreadful instanceof!)
                System.out.println("Joker found!");
        }
    }
    public static void run_C() {
        System.out.println("## RUN NULL AS A VALUE (Option C)");
        Set<c.Card> cards = new HashSet<>();
        for (c.Color color: c.Color.values()) {
            for(c.Value v: c.Value.values()) {
                cards.add(new c.Card(color,v));
            }
        }
        cards.add(new c.Card()); // Joker is the "non specified" card
        System.out.println("Size: " + cards.size());

        for (c.Card card : cards) {
            for (c.Card cp: cards) {
                if (card != cp && card.getColor() == cp.getColor() && card.getValue() == cp.getValue())
                    System.out.println("Found duplicate! " + card + " / " + cp);
            }
        }

    }
    public static void run_D() {
        System.out.println("## RUN ZERO (Option D)");
        Set<d.Card> cards = new HashSet<>();
        for (d.Color c: d.Color.values()) {
            for(d.Value v: d.Value.values()) {
                cards.add(new d.Card(c,v));
            }
        }
        cards.add(new d.Card()); // Adding joker
        System.out.println("Size: " + cards.size());
    }
    public static void run_E() {
        System.out.println("## RUN OPTIONAL (Option E)");
        Set<e.Card> cards = new HashSet<>();
        for (e.Color c: e.Color.values()) {
            for(e.Value v: e.Value.values()) {
                cards.add(new e.Card(c,v));
            }
        }
        cards.add(new e.Card()); // Adding joker
        System.out.println("Size: " + cards.size());
        for (e.Card card: cards){
            System.out.println(card.color() + " " + card.value());
        }

    }

}
