package com.comp110.keepaway;

public class Sandbox {

  public static void main(String[] args) {
    Game game = new Game();
    // Replace the fully-qualified classnames below with your bots' name(s)!
    game.setHomeBot(new com.comp110.samplebots.TemplateBot());
    game.setAwayBot(new com.comp110.samplebots.AimlessBot());
    game.start();
  }
  
}