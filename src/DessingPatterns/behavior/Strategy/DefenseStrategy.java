package DessingPatterns.behavior.Strategy;

public class DefenseStrategy implements GameStrategy {
    @Override
    public void play() {
        System.out.println("Defendiendo...");
    }
}
