package EasyZombies;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.animation.TranslateTransition;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.util.Duration;

public class EasyZombies {
    
    public int random;
    public int i=0;
    public int x = 0;
  
    public EasyZombies(Pane root){
          File myObj = new File("score.txt");
                    try {
                        myObj.createNewFile();
                    } catch (IOException ex) {
                        Logger.getLogger(order3.class.getName()).log(Level.SEVERE, null, ex);
                    }
        
        ArrayList<ImageView> obj=new ArrayList<ImageView>();
        Random random = new Random();
            
        Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(1),
            (evt) -> {    
                  obj.add(new ImageView());     
                   x = random.nextInt(35);
                  
                   if(x==0){
                    order2 d=new order2(root,obj.get(i));
                   }
                   if(x==1){
                    order a=new order(root,obj.get(i));
                   }
                   if(x==2){
                    order2 d=new order2(root,obj.get(i));
                   }
                   if(x==3){
                    order3 h=new order3(root,obj.get(i));
                   }
                   if(x==4 && i>8){
                    order a=new order(root,obj.get(i));
                   }
                   if(x==5 && i>8){
                    order3 h=new order3(root,obj.get(i));
                   }
                   if(x==6 && i>8){
                   order a=new order(root,obj.get(i));
                   }
                   if(x==7 && i>15){
                   order2 d=new order2(root,obj.get(i));
                   }
                   if(x==8 && i>15){
                    order3 h=new order3(root,obj.get(i));
                   }
                   if(x==9 && i>15){
                   order a=new order(root,obj.get(i));
                   }
                   if(x==10 && i>25){
                   order2 d=new order2(root,obj.get(i));
                   }
                   if(x==11 && i>25){
                   order3 h=new order3(root,obj.get(i));
                   }
                   if(x==12 && i>25){
                    order a=new order(root,obj.get(i));
                   }
                   if(x==13 && i>35){
                    order2 d=new order2(root,obj.get(i));
                   }
                   if(x==14 && i>35){
                    order3 h=new order3(root,obj.get(i));
                   }
                   if(x==15 && i>35){
                   order a=new order(root,obj.get(i));
                   }
                   if(x==16 && i>10){
                    order2 d=new order2(root,obj.get(i));
                   }
                   if(x==17 && i>10){
                    order3 h=new order3(root,obj.get(i));
                   }
                   if(x==18 && i>10){
                    order3 h=new order3(root,obj.get(i));
                   }
                   if(x==19 && i>35){
                    order a=new order(root,obj.get(i));                        
                   }
                   if(x==20 && i>35){
                    order2 d=new order2(root,obj.get(i));
                   }
                   if(x==21&& i>35){
                    order3 h=new order3(root,obj.get(i));
                   }
                   if(x==22&& i>35){
                    order a=new order(root,obj.get(i));  
                   }
                   if(x==23&& i>35){
                    order2 d=new order2(root,obj.get(i));
                   }
                   
                  i++;
            }));       
        timeline.setCycleCount(Animation.INDEFINITE);
        timeline.play();
   
    }

}
