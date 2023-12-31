package DessingPatterns.behavior.Strategy;

public class WaitStrategy implements GameStrategy {
    @Override
    public void play() {
        System.out.println("Esperando..");
    }
}
