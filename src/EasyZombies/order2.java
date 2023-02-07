package EasyZombies;

import EasyGame.PlayGroundController;
import static EasyGame.PlayGroundController.score;
import java.io.FileWriter;
import java.io.IOException;
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

public class order2 extends PlayGroundController {
    public static int r=0;
    public static int q=1;
    public static int q12=1;
    public static int q13=1;
    public static int q14=1;
    public static int q15=1;
    public static int q16=1;
    public static int q17=1;
    public static int q18=1;
    public static int q19=1;
      
    public static  TranslateTransition tt1 = new TranslateTransition();
    
    public order2(Pane root,ImageView os){
        
      String name="zombie.png";
      Image zombi=new Image(this.getClass().getResource(name).toString(),true);
      os.setFitHeight(100);
      os.setFitWidth(100);
      os.setImage(zombi);
      os.setY(245);
      os.setX(1000);
     
      tt1.setDuration(Duration.seconds(30));
      tt1.setToX(-1100);
      tt1.setNode(os);
      tt1.play();
       
         Timeline timeline = new Timeline(new KeyFrame(Duration.millis(30),
            (evt) -> {     
              /**
               * image11
               */ 
                if(os.getBoundsInParent().intersects(cir21Bounds)){
                     tt21.playFrom(Duration.ZERO);
                      tt21.pause();
                 r++;
                  if(r==7){
                    tt1.playFrom(Duration.INDEFINITE);
                     os.setImage(null);
                    score++;
                    r=0;
                  }
                }
                if((os.getTranslateX()<-670 && os.getTranslateX()>-700) || q>=300){
                    if(img21num==1){              
                     tt1.pause();
                    }
                    if(img21num==0){
                        tt1.play();
                    }
                     q++;
                     if(q>=300){
                         t21=2;
                         tt1.play();
                         cir21.relocate(1000, 1000);
                         img21num=0;
                         q=0;
                     }
                   
                 }
                
                /**
                 * image12
                 */
                  if(os.getBoundsInParent().intersects(cir22Bounds)){
                     tt22.playFrom(Duration.ZERO);
                      tt22.pause();
                 r++;
                  if(r==7){
                    tt1.playFrom(Duration.INDEFINITE);
                     os.setImage(null);
                    score++;
                    r=0;
                  }
                }
                if((os.getTranslateX()<-610 && os.getTranslateX()>-640) || q12>=300){
                    if(img22num==1){              
                     tt1.pause();
                    }
                    if(img22num==0){
                        tt1.play();
                    }
                     q12++;
                     if(q12>=300){
                         t22=2;
                         tt1.play();
                         cir22.relocate(1000, 1000);
                         img22num=0;
                         q12=0;
                     }
                   
                 }
                
                /**
                 * image13
                 */
                  if(os.getBoundsInParent().intersects(cir23Bounds)){
                     tt23.playFrom(Duration.ZERO);
                      tt23.pause();
                 r++;
                  if(r==7){
                    tt1.playFrom(Duration.INDEFINITE);
                     os.setImage(null);
                    score++;
                    r=0;
                  }
                }
                if((os.getTranslateX()<-545 && os.getTranslateX()>-575) || q13>=300){
                    if(img23num==1){              
                     tt1.pause();
                    }
                    if(img23num==0){
                        tt1.play();
                    }
                     q13++;
                     if(q13>=300){
                         t23=2;
                         tt1.play();
                         cir23.relocate(1000, 1000);
                         img23num=0;
                         q13=0;
                     }
                   
                 }
                /**
                 * image14
                 */
                 if(os.getBoundsInParent().intersects(cir24Bounds)){
                     tt24.playFrom(Duration.ZERO);
                      tt24.pause();
                 r++;
                  if(r==7){
                    tt1.playFrom(Duration.INDEFINITE);
                    score++;
                     os.setImage(null);
                    r=0;
                  }
                }
                if((os.getTranslateX()<-470 && os.getTranslateX()>-490) || q14>=300){
                    if(img24num==1){              
                     tt1.pause();
                    }
                    if(img24num==0){
                        tt1.play();
                    }
                     q14++;
                     if(q14>=300){
                         t24=2;
                         tt1.play();
                         cir24.relocate(1000, 1000);
                         img24num=0;
                         q14=0;
                     }
                   
                 }
                 /**
                  * image15
                  */
                   if(os.getBoundsInParent().intersects(cir25Bounds)){
                     tt25.playFrom(Duration.ZERO);
                      tt25.pause();
                 r++;
                  if(r==7){
                    tt1.playFrom(Duration.INDEFINITE);
                     os.setImage(null);
                    score++;
                    r=0;
                  }
                }
                if((os.getTranslateX()<-380 && os.getTranslateX()>-400) || q15>=300){
                    if(img25num==1){              
                     tt1.pause();
                    }
                    if(img25num==0){
                        tt1.play();
                    }
                     q15++;
                     if(q15>=300){
                         t25=2;
                         tt1.play();
                         cir25.relocate(1000, 1000);
                         img25num=0;
                         q15=0;
                     }
                   
                 }
                /**
                 * image16
                 */
                   if(os.getBoundsInParent().intersects(cir26Bounds)){
                     tt26.playFrom(Duration.ZERO);
                      tt26.pause();
                 r++;
                  if(r==7){
                    tt1.playFrom(Duration.INDEFINITE);
                     os.setImage(null);
                    score++;
                    r=0;
                  }
                }
                if((os.getTranslateX()<-295 && os.getTranslateX()>-315) || q16>=300){
                    if(img26num==1){              
                     tt1.pause();
                    }
                    if(img26num==0){
                        tt1.play();
                    }
                     q16++;
                     if(q16>=300){
                         t26=2;
                         tt1.play();
                         cir26.relocate(1000, 1000);
                         img26num=0;
                         q16=0;
                     }
                   
                 }
                /**
                 * image17
                 */
                   if(os.getBoundsInParent().intersects(cir27Bounds)){
                     tt27.playFrom(Duration.ZERO);
                      tt27.pause();
                 r++;
                  if(r==7){
                    tt1.playFrom(Duration.INDEFINITE);
                     os.setImage(null);
                    score++;
                    r=0;
                  }
                }
                if(os.getTranslateX()<-230 && os.getTranslateX()>-250 || q17>=300){
                    if(img27num==1){              
                        tt1.pause();
                    }
                    if(img27num==0){
                        tt1.play();
                    }
                     q17++;
                     if(q17>=300){
                         t27=2;
                         tt1.play();
                         cir27.relocate(1000, 1000);
                         img27num=0;
                         q17=0;
                     }
                   
                 }
                /**
                 * image18
                 */
                    if(os.getBoundsInParent().intersects(cir28Bounds)){
                     tt28.playFrom(Duration.ZERO);
                      tt28.pause();
                 r++;
                  if(r==7){
                    tt1.playFrom(Duration.INDEFINITE);
                     os.setImage(null);
                    score++;
                    r=0;
                  }
                }
                if(os.getTranslateX()<-165 && os.getTranslateX()>-185){
                    if(img28num==1){              
                        tt1.pause();
                    }
                    if(img28num==0){
                        tt1.play();
                    }
                     q18++;
                     if(q18>=300){
                         t28=2;
                         tt1.play();
                         cir28.relocate(1000, 1000);
                         img28num=0;
                         q18=0;
                     }
                   
                 }
                /**
                 * image19
                 */
                   if(os.getBoundsInParent().intersects(cir29Bounds)){
                     tt29.playFrom(Duration.ZERO);
                      tt29.pause();
                 r++;
                  if(r==7){
                    tt1.playFrom(Duration.INDEFINITE);
                     os.setImage(null);
                    score++;
                    r=0;
                  }
                }
                if(os.getTranslateX()<-115 && os.getTranslateX()>-135){
                    if(img29num==1){              
                        tt1.pause();
                    }
                    if(img29num==0){
                        tt1.play();
                    }
                     q19++;
                     if(q19>=300){
                         t29=2;
                         tt1.play();
                         cir29.relocate(1000, 1000);
                         img29num=0;
                         q19=0;
                     }
                   
                 }
                
                 if(os.getTranslateX()<=-900  && os.getTranslateX()>-950){
                    String go="gameover.png";
                    Image GO=new Image(this.getClass().getResource(go).toString());
                    ImageView gameover=new ImageView();
                    gameover.setImage(GO);
                    gameover.setX(300);
                    gameover.setY(150);
                    root.getChildren().add(gameover);
                    root.getChildren().remove(os);
                     try {
                        try (FileWriter myWriter = new FileWriter("score.txt")) {
                            myWriter.write("" +score);
                        }
                    } catch (IOException ex) {
                        Logger.getLogger(order3.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
             })); 
        timeline.setCycleCount(Animation.INDEFINITE);
        timeline.play();
        root.getChildren().add(os);
    }
}
