package com.sd.turtle;

import java.util.Observer;
import java.util.Observable;
import java.util.ArrayList;
import java.awt.geom.Point2D.Double;
import java.awt.Color;
import ch.aplu.turtle.*;

public class MomTurtle extends Turtle implements Observer {
  Double babyCurpos;
  
  public MomTurtle(){
    setColor(Color.red);
    label("Mom Turtle");
  }
  
  public void update(Observable o, Object arg){
    System.out.println("Count "+((Integer)arg).intValue());
    babyCurpos=((BabyTurtle)o).myCurpos;
    System.out.println("current pos" + babyCurpos);
    moveTo(babyCurpos);
  }
}