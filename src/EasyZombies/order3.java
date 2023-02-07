package EasyZombies;

import EasyGame.PlayGroundController;
import static EasyGame.PlayGroundController.score;
import java.io.File;
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

public class order3 extends PlayGroundController {
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
      
    public static TranslateTransition tt1 = new TranslateTransition();
     
    public order3(Pane root,ImageView os){
        
      String name="zombie.png";
      Image zombi=new Image(this.getClass().getResource(name).toString(),true);
      os.setFitHeight(100);
      os.setFitWidth(100);
      os.setImage(zombi);
      os.setY(345);
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
                if(os.getBoundsInParent().intersects(cir31Bounds)){
                     tt31.playFrom(Duration.ZERO);
                      tt31.pause();
                 r++;
                  if(r==7){
                    tt1.playFrom(Duration.INDEFINITE);
                     os.setImage(null);
                    score++;
                    r=0;
                  }
                }
                if((os.getTranslateX()<-670 && os.getTranslateX()>-700) || q>=300){
                    if(img31num==1){              
                     tt1.pause();
                    }
                    if(img31num==0){
                        tt1.play();
                    }
                     q++;
                     if(q>=300){
                         t31=2;
                         tt1.play();
                         cir31.relocate(1000, 1000);
                         img31num=0;
                         q=0;
                     }
                   
                 }
                
                /**
                 * image12
                 */
                  if(os.getBoundsInParent().intersects(cir32Bounds)){
                     tt32.playFrom(Duration.ZERO);
                      tt32.pause();
                 r++;
                  if(r==7){
                    tt1.playFrom(Duration.INDEFINITE);
                     os.setImage(null);
                    score++;
                    r=0;
                  }
                }
                if((os.getTranslateX()<-610 && os.getTranslateX()>-640) || q12>=300){
                    if(img32num==1){              
                     tt1.pause();
                    }
                    if(img32num==0){
                        tt1.play();
                    }
                     q12++;
                     if(q12>=300){
                         t32=2;
                         tt1.play();
                         cir32.relocate(1000, 1000);
                         img32num=0;
                         q12=0;
                     }
                   
                 }
                
                /**
                 * image13
                 */
                  if(os.getBoundsInParent().intersects(cir33Bounds)){
                     tt33.playFrom(Duration.ZERO);
                      tt33.pause();
                 r++;
                  if(r==7){
                    tt1.playFrom(Duration.INDEFINITE);
                     os.setImage(null);
                    score++;
                    r=0;
                  }
                }
                if((os.getTranslateX()<-545 && os.getTranslateX()>-575) || q13>=300){
                    if(img33num==1){              
                     tt1.pause();
                    }
                    if(img33num==0){
                        tt1.play();
                    }
                     q13++;
                     if(q13>=300){
                         t33=2;
                         tt1.play();
                         cir33.relocate(1000, 1000);
                         img33num=0;
                         q13=0;
                     }
                   
                 }
                /**
                 * image14
                 */
                 if(os.getBoundsInParent().intersects(cir34Bounds)){
                     tt34.playFrom(Duration.ZERO);
                      tt34.pause();
                 r++;
                  if(r==7){
                    tt1.playFrom(Duration.INDEFINITE);
                     os.setImage(null);
                    score++;
                    r=0;
                  }
                }
                if((os.getTranslateX()<-470 && os.getTranslateX()>-490) || q14>=300){
                    if(img34num==1){              
                     tt1.pause();
                    }
                    if(img34num==0){
                        tt1.play();
                    }
                     q14++;
                     if(q14>=300){
                         t34=2;
                         tt1.play();
                         cir34.relocate(1000, 1000);
                         img34num=0;
                         q14=0;
                     }
                   
                 }
                 /**
                  * image15
                  */
                   if(os.getBoundsInParent().intersects(cir35Bounds)){
                     tt35.playFrom(Duration.ZERO);
                      tt35.pause();
                 r++;
                  if(r==7){
                    tt1.playFrom(Duration.INDEFINITE);
                     os.setImage(null);
                    score++;
                    r=0;
                  }
                }
                if((os.getTranslateX()<-380 && os.getTranslateX()>-400) || q15>=300){
                    if(img35num==1){              
                     tt1.pause();
                    }
                    if(img35num==0){
                        tt1.play();
                    }
                     q15++;
                     if(q15>=300){
                         t35=2;
                         tt1.play();
                         cir35.relocate(1000, 1000);
                         img35num=0;
                         q15=0;
                     }
                   
                 }
                /**
                 * image16
                 */
                   if(os.getBoundsInParent().intersects(cir36Bounds)){
                     tt36.playFrom(Duration.ZERO);
                      tt36.pause();
                 r++;
                  if(r==7){
                    tt1.playFrom(Duration.INDEFINITE);
                     os.setImage(null);
                    score++;
                    r=0;
                  }
                }
                if((os.getTranslateX()<-295 && os.getTranslateX()>-315) || q16>=300){
                    if(img36num==1){              
                     tt1.pause();
                    }
                    if(img36num==0){
                        tt1.play();
                    }
                     q16++;
                     if(q16>=300){
                         t36=2;
                         tt1.play();
                         cir36.relocate(1000, 1000);
                         img36num=0;
                         q16=0;
                     }
                   
                 }
                /**
                 * image17
                 */
                   if(os.getBoundsInParent().intersects(cir37Bounds)){
                     tt37.playFrom(Duration.ZERO);
                      tt37.pause();
                 r++;
                  if(r==7){
                    tt1.playFrom(Duration.INDEFINITE);
                     os.setImage(null);
                    score++;
                    r=0;
                  }
                }
                if(os.getTranslateX()<-230 && os.getTranslateX()>-250 || q17>=300){
                    if(img37num==1){              
                        tt1.pause();
                    }
                    if(img37num==0){
                        tt1.play();
                    }
                     q17++;
                     if(q17>=300){
                         t37=2;
                         tt1.play();
                         cir37.relocate(1000, 1000);
                         img37num=0;
                         q17=0;
                     }
                   
                 }
                /**
                 * image18
                 */
                    if(os.getBoundsInParent().intersects(cir38Bounds)){
                     tt38.playFrom(Duration.ZERO);
                      tt38.pause();
                 r++;
                  if(r==7){
                    tt1.playFrom(Duration.INDEFINITE);
                     os.setImage(null);
                    score++;
                    r=0;
                  }
                }
                if(os.getTranslateX()<-165 && os.getTranslateX()>-185){
                    if(img38num==1){              
                        tt1.pause();
                    }
                    if(img38num==0){
                        tt1.play();
                    }
                     q18++;
                     if(q18>=300){
                         t38=2;
                         tt1.play();
                         cir38.relocate(1000, 1000);
                         img38num=0;
                         q18=0;
                     }
                   
                 }
                /**
                 * image19
                 */
                   if(os.getBoundsInParent().intersects(cir39Bounds)){
                     tt39.playFrom(Duration.ZERO);
                      tt39.pause();
                 r++;
                  if(r==7){
                    tt1.playFrom(Duration.INDEFINITE);
                     os.setImage(null);
                    score++;
                    r=0;
                  }
                }
                if(os.getTranslateX()<-115 && os.getTranslateX()>-135){
                    if(img39num==1){              
                        tt1.pause();
                    }
                    if(img39num==0){
                        tt1.play();
                    }
                     q19++;
                     if(q19>=300){
                         t39=2;
                         tt1.play();
                         cir39.relocate(1000, 1000);
                         img39num=0;
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
