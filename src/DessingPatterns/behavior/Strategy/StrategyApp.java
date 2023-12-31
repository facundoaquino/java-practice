package DessingPatterns.behavior.Strategy;

public class StrategyApp {

    public static void main(String[] args) {
        Team team = new Team();

        team.play();

        team.setGameStrategy(new AttackStrategy());

        team.play();
    }
}
