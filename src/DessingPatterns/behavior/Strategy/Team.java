package DessingPatterns.behavior.Strategy;


//TEAM SERIA LA CLASE CONTEXTO
public class Team {

    private GameStrategy gameStrategy;

    public Team() {
        this.gameStrategy = new WaitStrategy();
    }

    public void setGameStrategy(GameStrategy gameStrategy) {
        this.gameStrategy = gameStrategy;
    }

    public void play(){
        gameStrategy.play();
    }
}
