/**
 * Name:      Your Name
 * ONYEN:     Your Onyen
 * 
 * Goals:
 */

package com.comp110.samplebots;

import com.comp110.keepaway.Bot;
import com.comp110.keepaway.BotController;
import com.comp110.keepaway.Puck;
import com.comp110.keepaway.Throttle;

import org.dyn4j.geometry.Vector2;
import java.awt.Color;

public class TemplateBot implements BotController {

  public String getTeamName() {
    return "TemplateBot";
  }
  
  public Throttle move(Puck puck, Bot me, Bot rival, boolean hasControl, long time) {
    Throttle throttle = new Throttle();

    // Your bot's algorithm will begin here.
    throttle.setThrust(0.0);
    throttle.setTorque(0.0);
    
    return throttle;
  }

  public Color getHomeColor() {
    return new Color(0.48f,0.683f,0.828f);
  }

  public Color getAwayColor() {
    return new Color(0.5f,0.281f,0.277f);
  }

}