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
 
public class order extends PlayGroundController {
    public static int r=0;
    public  int q=1;
    public  int q12=1;
    public  int q13=1;
    public  int q14=1;
    public  int q15=1;
    public  int q16=1;
    public  int q17=1;
    public  int q18=1;
    public  int q19=1;
      
     public String name="zombie.png";
     public Image zombi=new Image(this.getClass().getResource(name).toString(),true);
     public static TranslateTransition tt1 = new TranslateTransition();
      
    public order(Pane root,ImageView os){
        
     
      os.setFitHeight(100);
      os.setFitWidth(100);
      os.setImage(zombi);
      os.setY(145);
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
                if(os.getBoundsInParent().intersects(cir1Bounds)){
                     tt.playFrom(Duration.ZERO);
                      tt.pause();
                 r++;
                  if(r==3){
                    tt1.playFrom(Duration.INDEFINITE);
                     os.setImage(null);
                    score++;
                    r=0;
                  }
                }
                if((os.getTranslateX()<-670 && os.getTranslateX()>-700) || q>=300){
                    if(img11num==1){              
                     tt1.pause();
                    }
                    if(img11num==0){
                        tt1.play();
                    }
                     q++;
                     if(q>=300){
                         t=2;
                         tt1.play();
                         cir1.relocate(1000, 1000);
                         img11num=0;
                         q=0;
                     }
                   
                 }
                
                /**
                 * image12
                 */
                  if(os.getBoundsInParent().intersects(cir2Bounds)){
                     tt12.playFrom(Duration.ZERO);
                      tt12.pause();
                 r++;
                  if(r==3){
                    tt1.playFrom(Duration.INDEFINITE);
                     os.setImage(null);
                    score++;
                    r=0;
                  }
                }
                if((os.getTranslateX()<-610 && os.getTranslateX()>-640) || q12>=300){
                    if(img12num==1){              
                     tt1.pause();
                    }
                    if(img12num==0){
                        tt1.play();
                    }
                     q12++;
                     if(q12>=300){
                         t1=2;
                         tt1.play();
                         cir2.relocate(1000, 1000);
                         img12num=0;
                         q12=0;
                     }
                   
                 }
                
                /**
                 * image13
                 */
                  if(os.getBoundsInParent().intersects(cir3Bounds)){
                     tt13.playFrom(Duration.ZERO);
                      tt13.pause();
                 r++;
                  if(r==3){
                    tt1.playFrom(Duration.INDEFINITE);
                     os.setImage(null);
                    score++;
                    r=0;
                  }
                }
                if((os.getTranslateX()<-545 && os.getTranslateX()>-575) || q13>=300){
                    if(img13num==1){              
                     tt1.pause();
                    }
                    if(img13num==0){
                        tt1.play();
                    }
                     q13++;
                     if(q13>=300){
                         t3=2;
                         tt1.play();
                         cir3.relocate(1000, 1000);
                         img13num=0;
                         q13=0;
                     }
                   
                 }
                /**
                 * image14
                 */
                 if(os.getBoundsInParent().intersects(cir4Bounds)){
                     tt14.playFrom(Duration.ZERO);
                      tt14.pause();
                 r++;
                  if(r==3){
                    tt1.playFrom(Duration.INDEFINITE);
                     os.setImage(null);
                    score++;
                    r=0;
                  }
                }
                if((os.getTranslateX()<-470 && os.getTranslateX()>-490) || q14>=300){
                    if(img14num==1){              
                     tt1.pause();
                    }
                    if(img14num==0){
                        tt1.play();
                    }
                     q14++;
                     if(q14>=300){
                         t4=2;
                         tt1.play();
                         cir4.relocate(1000, 1000);
                         img14num=0;
                         q14=0;
                     }
                   
                 }
                 /**
                  * image15
                  */
                   if(os.getBoundsInParent().intersects(cir5Bounds)){
                     tt15.playFrom(Duration.ZERO);
                      tt15.pause();
                 r++;
                  if(r==3){
                    tt1.playFrom(Duration.INDEFINITE);
                     os.setImage(null);
                    score++;
                    r=0;
                  }
                }
                if((os.getTranslateX()<-380 && os.getTranslateX()>-400) || q15>=300){
                    if(img15num==1){              
                     tt1.pause();
                    }
                    if(img15num==0){
                        tt1.play();
                    }
                     q15++;
                     if(q15>=300){
                         t5=2;
                         tt1.play();
                         cir5.relocate(1000, 1000);
                         img15num=0;
                         q15=0;
                     }
                   
                 }
                /**
                 * image16
                 */
                   if(os.getBoundsInParent().intersects(cir6Bounds)){
                     tt16.playFrom(Duration.ZERO);
                      tt16.pause();
                 r++;
                  if(r==3){
                    tt1.playFrom(Duration.INDEFINITE);
                     os.setImage(null);
                    score++;
                    r=0;
                  }
                }
                if((os.getTranslateX()<-295 && os.getTranslateX()>-315) || q16>=300){
                    if(img16num==1){              
                     tt1.pause();
                    }
                    if(img16num==0){
                        tt1.play();
                    }
                     q16++;
                     if(q16>=300){
                         t6=2;
                         tt1.play();
                         cir6.relocate(1000, 1000);
                         img16num=0;
                         q16=0;
                     }
                   
                 }
                /**
                 * image17
                 */
                   if(os.getBoundsInParent().intersects(cir7Bounds)){
                     tt17.playFrom(Duration.ZERO);
                      tt17.pause();
                 r++;
                  if(r==3){
                    tt1.playFrom(Duration.INDEFINITE);
                     os.setImage(null);
                    score++;
                    r=0;
                  }
                }
                if(os.getTranslateX()<-230 && os.getTranslateX()>-250 || q17>=300){
                    if(img17num==1){              
                        tt1.pause();
                    }
                    if(img17num==0){
                        tt1.play();
                    }
                     q17++;
                     if(q17>=300){
                         t7=2;
                         tt1.play();
                         cir7.relocate(1000, 1000);
                         img17num=0;
                         q17=0;
                     }
                   
                 }
                /**
                 * image18
                 */
                    if(os.getBoundsInParent().intersects(cir8Bounds)){
                     tt18.playFrom(Duration.ZERO);
                      tt18.pause();
                 r++;
                  if(r==3){
                    tt1.playFrom(Duration.INDEFINITE);
                     os.setImage(null);
                    score++;
                    r=0;
                  }
                }
                if(os.getTranslateX()<-165 && os.getTranslateX()>-185){
                    if(img18num==1){              
                        tt1.pause();
                    }
                    if(img18num==0){
                        tt1.play();
                    }
                     q18++;
                     if(q18>=300){
                         t8=2;
                         tt1.play();
                         cir8.relocate(1000, 1000);
                         img18num=0;
                         q18=0;
                     }
                   
                 }
                /**
                 * image19
                 */
                   if(os.getBoundsInParent().intersects(cir9Bounds)){
                     tt19.playFrom(Duration.ZERO);
                      tt19.pause();
                 r++;
                  if(r==3){
                    tt1.playFrom(Duration.INDEFINITE);
                    os.setImage(null);
                    score++;
                    r=0;
                  }
                }
                if(os.getTranslateX()<-115 && os.getTranslateX()>-135){
                    if(img19num==1){              
                        tt1.pause();
                    }
                    if(img19num==0){
                        tt1.play();
                    }
                     q19++;
                     if(q19>=300){
                         t9=2;
                         tt1.play();
                         cir9.relocate(1000, 1000);
                         img19num=0;
                         q19=0;
                     }
                   
                 }
                
                if(os.getTranslateX()<=-900 && os.getTranslateX()>-950){
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
