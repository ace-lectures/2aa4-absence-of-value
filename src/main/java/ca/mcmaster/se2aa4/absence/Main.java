package ca.mcmaster.se2aa4.absence;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        run_A();
        System.out.println("\n\n\n\n\n");
        run_B();
        System.out.println("\n\n\n\n\n");
        run_C();
        System.out.println("\n\n\n\n\n");
        run_D();
        System.out.println("\n\n\n\n\n");
        run_E();
        System.out.println("\n\n\n\n\n");
    }

    public static void run_A() {
        System.out.println("## RUN NULL VISIBLE (Option A)");
        Set<ca.mcmaster.se2aa4.absence.a.Card> cards = new HashSet<>();
        for (ca.mcmaster.se2aa4.absence.a.Color c: ca.mcmaster.se2aa4.absence.a.Color.values()) {
            for(ca.mcmaster.se2aa4.absence.a.Value v: ca.mcmaster.se2aa4.absence.a.Value.values()) {
                cards.add(new ca.mcmaster.se2aa4.absence.a.Card(c,v));
            }
        }
        cards.add(new ca.mcmaster.se2aa4.absence.a.Card()); // Joker is the "non specified" card

        for (ca.mcmaster.se2aa4.absence.a.Card card : cards) {
            try { // Crash because of the joker using null as values and exposing them
                System.out.println("[" + card.getValue().toString() + "," + card.getColor().toString() + "]");
            } catch (NullPointerException e) { System.err.println(e.getMessage()); break; }
        }

        for (ca.mcmaster.se2aa4.absence.a.Card card : cards) {
            if (card.isJoker()) // responsibility of the caller to check if Joker
                System.out.println("Joker found!");
        }
    }
    public static void run_B() {
        System.out.println("## RUN INHERITANCE (Option B)");
        Set<ca.mcmaster.se2aa4.absence.b.Card> cards = new HashSet<>();
        for (ca.mcmaster.se2aa4.absence.b.Color c: ca.mcmaster.se2aa4.absence.b.Color.values()) {
            for(ca.mcmaster.se2aa4.absence.b.Value v: ca.mcmaster.se2aa4.absence.b.Value.values()) {
                cards.add(new ca.mcmaster.se2aa4.absence.b.Card(c,v));
            }
        }
        cards.add(new ca.mcmaster.se2aa4.absence.b.Joker());
        for (ca.mcmaster.se2aa4.absence.b.Card card : cards) {
            try { // crashes because of the unsupported operation exception
                System.out.println("[" + card.getValue().toString() + "," + card.getColor().toString() + "]");
            } catch (UnsupportedOperationException e) { System.err.println(e.getMessage()); break; }
        }

        for (ca.mcmaster.se2aa4.absence.b.Card card : cards) {
            if (card instanceof ca.mcmaster.se2aa4.absence.b.Joker) // responsibility of the caller to check if Joker (with dreadful instanceof!)
                System.out.println("Joker found!");
        }
    }
    public static void run_C() {
        System.out.println("## RUN NULL AS A VALUE (Option C)");
        Set<ca.mcmaster.se2aa4.absence.c.Card> cards = new HashSet<>();
        for (ca.mcmaster.se2aa4.absence.c.Color color: ca.mcmaster.se2aa4.absence.c.Color.values()) {
            for(ca.mcmaster.se2aa4.absence.c.Value v: ca.mcmaster.se2aa4.absence.c.Value.values()) {
                cards.add(new ca.mcmaster.se2aa4.absence.c.Card(color,v));
            }
        }
        cards.add(new ca.mcmaster.se2aa4.absence.c.Card()); // Joker is the "non specified" card
        System.out.println("Size: " + cards.size());

        for (ca.mcmaster.se2aa4.absence.c.Card card : cards) {
            for (ca.mcmaster.se2aa4.absence.c.Card cp: cards) {
                if (card != cp && card.getColor() == cp.getColor() && card.getValue() == cp.getValue())
                    System.out.println("Found duplicate! " + card + " / " + cp);
            }
        }

    }
    public static void run_D() {
        System.out.println("## RUN ZERO (Option D)");
        Set<ca.mcmaster.se2aa4.absence.d.Card> cards = new HashSet<>();
        for (ca.mcmaster.se2aa4.absence.d.Color c: ca.mcmaster.se2aa4.absence.d.Color.values()) {
            for(ca.mcmaster.se2aa4.absence.d.Value v: ca.mcmaster.se2aa4.absence.d.Value.values()) {
                cards.add(new ca.mcmaster.se2aa4.absence.d.Card(c,v));
            }
        }
        cards.add(new ca.mcmaster.se2aa4.absence.d.Card()); // Adding joker
        System.out.println("Size: " + cards.size());
    }
    public static void run_E() {
        System.out.println("## RUN OPTIONAL (Option E)");
        Set<ca.mcmaster.se2aa4.absence.e.Card> cards = new HashSet<>();
        for (ca.mcmaster.se2aa4.absence.e.Color c: ca.mcmaster.se2aa4.absence.e.Color.values()) {
            for(ca.mcmaster.se2aa4.absence.e.Value v: ca.mcmaster.se2aa4.absence.e.Value.values()) {
                cards.add(new ca.mcmaster.se2aa4.absence.e.Card(c,v));
            }
        }
        cards.add(new ca.mcmaster.se2aa4.absence.e.Card()); // Adding joker
        System.out.println("Size: " + cards.size());
        for (ca.mcmaster.se2aa4.absence.e.Card card: cards){
            System.out.println(card.color() + " " + card.value());
        }

    }

}
