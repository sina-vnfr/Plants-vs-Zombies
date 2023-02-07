package LevelPage;

import EasyZombies.EasyZombies;
import EasyZombies.SunMoney;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class LevelPageController implements Initializable {
    
    @FXML
    private Button Easy;

    @FXML
    private Button Normal;

    @FXML
    private Button Hard;

      ArrayList<Circle> sun=new ArrayList<Circle>();
      int i;
      
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       
        Easy.setOnAction(eh ->{
            try {
                Pane root1 = FXMLLoader.load(this.getClass().getResource("../EasyGame/PlayGround.fxml"));
                Stage registpage = new Stage();
                registpage.setScene(new Scene(root1));
                registpage.show();
                EasyZombies s=new EasyZombies(root1);
                  Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(10),
            (evt) -> {     
               sun.add(new Circle());
                SunMoney k=new SunMoney(sun.get(i),root1);
                i++;
            }));
            timeline.setCycleCount(Animation.INDEFINITE);
            timeline.play();
            } catch (IOException ex) {
                Logger.getLogger(LevelPageController.class.getName()).log(Level.SEVERE, null, ex);
            }
          
        });
        
        
    }    
    
}
