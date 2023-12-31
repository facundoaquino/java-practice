package DessingPatterns.behavior.Strategy;

public class AttackStrategy implements GameStrategy {
    @Override
    public void play() {
        System.out.println("Atacando...");
    }
}
