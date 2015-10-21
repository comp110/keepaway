package com.comp110.samplebots;

import java.awt.Color;

import org.dyn4j.geometry.Vector2;

import com.comp110.keepaway.Bot;
import com.comp110.keepaway.BotController;
import com.comp110.keepaway.Puck;
import com.comp110.keepaway.Throttle;

public class AimlessBot implements BotController {

  public String getTeamName() {
    return "AimlessBot";
  }
  
  public Throttle move(Puck puck, Bot me, Bot rival, boolean hasControl, long time) {
    Throttle throttle = new Throttle();
    
    if(me.angularVelocity < Math.PI / 2) {
      throttle.setTorque(1.0);
    } else {
      throttle.setTorque(0.0);
    }
    
    throttle.setThrust(Math.random());
    
    return throttle;
  }

  public Color getHomeColor() {
    return new Color(0.48f,0.683f,0.828f);
  }

  public Color getAwayColor() {
    return new Color(0.5f,0.281f,0.277f);
  }
  
}