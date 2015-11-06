package com.comp110.keepaway;

/**
 * The SimSandbox illustrates how to run a game headlessly such that results
 * can be obtained quickly. If you want to stress test a bot, do something with genetic algorithms
 * or machine learning, or whatever... enjoy.
 */
public class FastSimSandbox {

  public static void main(String[] args) {
    
    GameEngine game = new GameEngine();
    
    game.setAwayBot(new com.comp110.samplebots.TemplateBot());
    game.setHomeBot(new com.comp110.samplebots.AimlessBot());
    
    game.initializeWorld();
    // game.setPuckStart(0.0);
    while(game.winner == null) {
      game.gameLoop(null);
      Thread.yield();
    }
    
    System.out.println(game.winner.name + " beats " + game.loser.name + " 30.0 - " + (game.loser.score/1000.0));

  }

}
