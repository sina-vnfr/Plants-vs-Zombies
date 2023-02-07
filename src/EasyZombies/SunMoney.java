package EasyZombies;

import EasyGame.PlayGroundController;
import java.util.ArrayList;
import java.util.Random;
import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.animation.TranslateTransition;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.util.Duration;

public class SunMoney extends PlayGroundController {
    
     Random random = new Random();
     int x;
     int y;
     public static TranslateTransition tt1 = new TranslateTransition();

    public SunMoney(Circle sun,Pane root){
        sun.setFill(Color.YELLOW);
        sun.setRadius(20);
        sun.setLayoutY(0);
        
      
        tt1.setDuration(Duration.seconds(2));
        tt1.setNode(sun);
        x=random.nextInt(560)+300;
        y=random.nextInt(440)+20;       
        sun.setLayoutX(x);
        tt1.setToY(y);
        tt1.play();
        
      
        EventHandler<MouseEvent> eventhandler=new  EventHandler<MouseEvent>(){
             @Override
             public void handle(MouseEvent e){
              sun.relocate(1000, 1000);
              SunMoney=SunMoney+50;
             }
        };
        sun.addEventFilter(MouseEvent.MOUSE_CLICKED, eventhandler);
        root.getChildren().add(sun);
   
    }
   
}
