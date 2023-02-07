package EasyGame;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.animation.TranslateTransition;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Bounds;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.util.Duration;

public class PlayGroundController implements Initializable {
   
    public static int SunMoney=300;
    public static int score;
    public static int var=0;
     
     
       /**image11**/ 
    public static  Circle cir1=new Circle(); 
    public static TranslateTransition tt = new TranslateTransition();
    public static Bounds cir1Bounds;
    public  static int t=0;
    public static int g=1;
     
        /**image12**/
    public static  Circle cir2=new Circle(); 
    public static TranslateTransition tt12 = new TranslateTransition();
    public static Bounds cir2Bounds;
    public static int t1=0;
    public static int g1=1;
    
       /**image13**/
    public static  Circle cir3=new Circle(); 
    public static TranslateTransition tt13 = new TranslateTransition();
    public static Bounds cir3Bounds;
    public static int t3=0;
    public static int g3=1;
     
       /**image14**/
    public static  Circle cir4=new Circle(); 
    public static TranslateTransition tt14 = new TranslateTransition();
    public static Bounds cir4Bounds;
    public static int t4=0;
    public  int g4=1;
     
       /**image15**/
    public static  Circle cir5=new Circle(); 
    public static TranslateTransition tt15 = new TranslateTransition();
    public static Bounds cir5Bounds;
    public static int t5=0;
    public  int g5=1;
    
       /**image16**/
    public static  Circle cir6=new Circle(); 
    public static TranslateTransition tt16 = new TranslateTransition();
    public static Bounds cir6Bounds;
    public static int t6=0;
    public  int g6=1;
    
       /**image17**/
    public static  Circle cir7=new Circle(); 
    public static TranslateTransition tt17 = new TranslateTransition();
    public static Bounds cir7Bounds;
    public static int t7=0;
    public  int g7=1;
    
        /**image18**/
    public static  Circle cir8=new Circle(); 
    public static TranslateTransition tt18 = new TranslateTransition();
    public static Bounds cir8Bounds;
    public static int t8=0;
    public  int g8=1;
    
         /**image19**/
    public static  Circle cir9=new Circle(); 
    public static TranslateTransition tt19 = new TranslateTransition();
    public static Bounds cir9Bounds;
    public static int t9=0;
    public  int g9=1;
    
         /**image21**/
    public static  Circle cir21=new Circle(); 
    public static TranslateTransition tt21 = new TranslateTransition();
    public static Bounds cir21Bounds;
    public static int t21=0;
    public  int g21=1;
     
         /**image22**/
    public static  Circle cir22=new Circle(); 
    public static TranslateTransition tt22 = new TranslateTransition();
    public static Bounds cir22Bounds;
    public static int t22=0;
    public  int g22=1;
    
         /**image23**/
    public static  Circle cir23=new Circle(); 
    public static TranslateTransition tt23 = new TranslateTransition();
    public static Bounds cir23Bounds;
    public static int t23=0;
    public  int g23=1;
    
         /**image24**/    
    public static  Circle cir24=new Circle(); 
    public static TranslateTransition tt24 = new TranslateTransition();
    public static Bounds cir24Bounds;
    public static int t24=0;
    public  int g24=1;
    
         /**image25**/
    public static  Circle cir25=new Circle(); 
    public static TranslateTransition tt25 = new TranslateTransition();
    public static Bounds cir25Bounds;
    public static int t25=0;
    public  int g25=1;
    
         /**image**/
    public static  Circle cir26=new Circle(); 
    public static TranslateTransition tt26 = new TranslateTransition();
    public static Bounds cir26Bounds;
    public static int t26=0;
    public  int g26=1;
    
          /**image27**/
    public static  Circle cir27=new Circle(); 
    public static TranslateTransition tt27 = new TranslateTransition();
    public static Bounds cir27Bounds;
    public static int t27=0;
    public  int g27=1;
    
          /**image28**/
    public static  Circle cir28=new Circle(); 
    public static TranslateTransition tt28 = new TranslateTransition();
    public static Bounds cir28Bounds;
    public static int t28=0;
    public  int g28=1;
    
          /**image29**/
    public static  Circle cir29=new Circle(); 
    public static TranslateTransition tt29 = new TranslateTransition();
    public static Bounds cir29Bounds;
    public static int t29=0;
    public  int g29=1;
    
          /**image31**/
    public static  Circle cir31=new Circle(); 
    public static TranslateTransition tt31 = new TranslateTransition();
    public static Bounds cir31Bounds;
    public static int t31=0;
    public  int g31=1;
    
          /**image32**/
    public static  Circle cir32=new Circle(); 
    public static TranslateTransition tt32 = new TranslateTransition();
    public static Bounds cir32Bounds;
    public static int t32=0;
    public  int g32=1;
    
          /**image33**/
    public static  Circle cir33=new Circle(); 
    public static TranslateTransition tt33 = new TranslateTransition();
    public static Bounds cir33Bounds;
    public static int t33=0;
    public  int g33=1;
    
          /**image34**/
    public static  Circle cir34=new Circle(); 
    public static TranslateTransition tt34 = new TranslateTransition();
    public static Bounds cir34Bounds;
    public static int t34=0;
    public  int g34=1;
    
          /**image35**/
    public static  Circle cir35=new Circle(); 
    public static TranslateTransition tt35 = new TranslateTransition();
    public static Bounds cir35Bounds;
    public static int t35=0;
    public  int g35=1;
    
          /**image36**/
    public static  Circle cir36=new Circle(); 
    public static TranslateTransition tt36 = new TranslateTransition();
    public static Bounds cir36Bounds;
    public static int t36=0;
    public  int g36=1;
    
          /**image37**/
    public static  Circle cir37=new Circle(); 
    public static TranslateTransition tt37 = new TranslateTransition();
    public static Bounds cir37Bounds;
    public static int t37=0;
    public  int g37=1;
    
          /**image38**/
    public static  Circle cir38=new Circle(); 
    public static TranslateTransition tt38 = new TranslateTransition();
    public static Bounds cir38Bounds;
    public static int t38=0;
    public  int g38=1;
    
          /**image39**/
    public static  Circle cir39=new Circle(); 
    public static TranslateTransition tt39 = new TranslateTransition();
    public static Bounds cir39Bounds;
    public static int t39=0;
    public  int g39=1;
    
    /***
     * taeen konande por boodan imade
     * 70 ta mire roo setlyoutx
     * settox 70 ta kam
     * 
     */
    public static int img11num=0;
    public static int img12num=0;
    public static int img13num=0;
    public static int img14num=0;
    public static int img15num=0;
    public static int img16num=0;
    public static int img17num=0;
    public static int img18num=0;
    public static int img19num=0;
    public static int img21num=0;
    public static int img22num=0;
    public static int img23num=0;
    public static int img24num=0;
    public static int img25num=0;
    public static int img26num=0;
    public static int img27num=0;
    public static int img28num=0;
    public static int img29num=0;
    public static int img31num=0;
    public static int img32num=0;
    public static int img33num=0;
    public static int img34num=0;
    public static int img35num=0;
    public static int img36num=0;
    public static int img37num=0;
    public static int img38num=0;
    public static int img39num=0;
    
    
    @FXML
    public ImageView img11;

    @FXML
    private ImageView img12;

    @FXML
    private ImageView img13;

    @FXML
    private ImageView img14;

    @FXML
    private ImageView img15;

    @FXML
    private ImageView img16;

    @FXML
    private ImageView img17;

    @FXML
    private ImageView img18;

    @FXML
    private ImageView img19;

    @FXML
    private ImageView img29;

    @FXML
    private ImageView img28;

    @FXML
    private ImageView img27;

    @FXML
    private ImageView img26;

    @FXML
    private ImageView img25;

    @FXML
    private ImageView img24;

    @FXML
    private ImageView img23;

    @FXML
    private ImageView img22;

    @FXML
    private ImageView img21;

    @FXML
    private ImageView img31;

    @FXML
    private ImageView plant1;

    @FXML
    private ImageView plant2;

    @FXML
    private ImageView plant3;

    @FXML
    private ImageView img32;

    @FXML
    private ImageView img33;

    @FXML
    private ImageView img34;

    @FXML
    private ImageView img35;

    @FXML
    private ImageView img36;

    @FXML
    private ImageView img37;

    @FXML
    private ImageView img38;

    @FXML
    private ImageView img39;
    
   @FXML
   private Pane root;
   
    @FXML
    private Label scorelbl;
    
    @FXML
    public Label sunlbl;

    @FXML
    public Label errormoney;

    @FXML
    void plant1(MouseEvent event) {
        var = 1;
    }

    @FXML
    void plant2(MouseEvent event) {
       var = 2;
    }

    @FXML
    void plant3(MouseEvent event) {
      var = 3;
    }
   
    public static int s;
    

   @FXML
   void img11(MouseEvent event) {

    if(var == 1 && SunMoney >= 100){
          SunMoney=SunMoney-100;
          img11num = 1;
          t=1;
          String plant="pln1.png";
          Image image=new Image(this.getClass().getResource(plant).toString());
          String ground="ground11.jpg";
          Image grass=new Image(this.getClass().getResource(ground).toString());
            
            Timeline timeline11 = new Timeline(new KeyFrame(Duration.millis(10),
            (evt11) -> {     
                if(t==1){
                     img11.setImage(image);
                }
                if(t==2){
                    img11.setImage(grass);
                }
                if(score!=s){    
                scorelbl.setText("" +score);
                scorelbl.setFont(new Font(38.0));
                s=score;
                }
            }));
            timeline11.setCycleCount(Animation.INDEFINITE);
            timeline11.play();
            cir1.setFill(Color.GREENYELLOW);
            cir1.setRadius(10);
            cir1.setLayoutX(300);
            cir1.setLayoutY(175); 
        
            tt.setDuration(Duration.seconds(1.5));
            tt.setToX(600);
            tt.setCycleCount(Animation.INDEFINITE);
            tt.setNode(cir1);
          
            Timeline timeline1 = new Timeline(new KeyFrame(Duration.seconds(1),
            (evt1) -> {              
              tt.play();          
            }));
              timeline1.setCycleCount(Animation.INDEFINITE);
              timeline1.play();
              
            Timeline timeline = new Timeline(new KeyFrame(Duration.millis(0.1),
            (evt) -> {                     
                 cir1Bounds=cir1.getBoundsInParent();   
                 
            })); 
              timeline.setCycleCount(Animation.INDEFINITE);
              timeline.play();
              
            if(g==1){  
            root.getChildren().add(cir1);
            g=0;
            } 
       
    }
    
    if(var == 2 && SunMoney >= 175){
          img11num = 1;
            SunMoney=SunMoney-175;
          t=1;
          String plant="pln2.png";
          Image image=new Image(this.getClass().getResource(plant).toString());
          String ground="ground11.jpg";
          Image grass=new Image(this.getClass().getResource(ground).toString());
            
            Timeline timeline11 = new Timeline(new KeyFrame(Duration.millis(10),
            (evt11) -> {     
                if(t==1){
                     img11.setImage(image);
                }
                if(t==2){
                    img11.setImage(grass);
                }
                if(score!=s){    
                scorelbl.setText("" +score);
                scorelbl.setFont(new Font(38.0));
                s=score;
                }
            }));
            timeline11.setCycleCount(Animation.INDEFINITE);
            timeline11.play();
               
            cir1.setFill(Color.AQUA);
            cir1.setRadius(10);
            cir1.setLayoutX(300);
            cir1.setLayoutY(175); 
        
            tt.setDuration(Duration.seconds(1.5));
            tt.setToX(600);
            tt.setCycleCount(Animation.INDEFINITE);
            tt.setNode(cir1);
          
            Timeline timeline1 = new Timeline(new KeyFrame(Duration.seconds(1),
            (evt1) -> {              
              tt.play();          
            }));
              timeline1.setCycleCount(Animation.INDEFINITE);
              timeline1.play();
              
            Timeline timeline = new Timeline(new KeyFrame(Duration.millis(0.1),
            (evt) -> {                     
                 cir1Bounds=cir1.getBoundsInParent();               
            })); 
              timeline.setCycleCount(Animation.INDEFINITE);
              timeline.play();
              
            if(g==1){  
            root.getChildren().add(cir1);
            g=0;
            } 
       
    }
    
    if(var == 3){
             System.out.print("oooo");
    }
        
  }

    @FXML
    void img12(MouseEvent event) {
       if(var==1 && SunMoney >= 100){
          img12num = 1;
          SunMoney=SunMoney-100;
          t1=1;
          String plant="pln1.png";
          Image image=new Image(this.getClass().getResource(plant).toString());
          String ground="ground12.jpg";
          Image grass=new Image(this.getClass().getResource(ground).toString());
            
            Timeline timeline11 = new Timeline(new KeyFrame(Duration.millis(10),
            (evt11) -> {     
                if(t1==1){
                    img12.setImage(image);
                }
                if(t1==2){
                    img12.setImage(grass);
                }
                if(score!=s){    
                scorelbl.setText("" +score);
                scorelbl.setFont(new Font(38.0));
                s=score;
                }
            }));
            timeline11.setCycleCount(Animation.INDEFINITE);
            timeline11.play();
               
            cir2.setFill(Color.GREENYELLOW);
            cir2.setRadius(10);
            cir2.setLayoutX(370);
            cir2.setLayoutY(175); 
        
            tt12.setDuration(Duration.seconds(1.5));
            tt12.setToX(530);
            tt12.setCycleCount(Animation.INDEFINITE);
            tt12.setNode(cir2);
          
            Timeline timeline1 = new Timeline(new KeyFrame(Duration.seconds(1),
            (evt1) -> {              
              tt12.play();          
            }));
              timeline1.setCycleCount(Animation.INDEFINITE);
              timeline1.play();
              
            Timeline timeline = new Timeline(new KeyFrame(Duration.millis(0.1),
            (evt) -> {                     
                 cir2Bounds=cir2.getBoundsInParent();               
            })); 
              timeline.setCycleCount(Animation.INDEFINITE);
              timeline.play();
              
            if(g1==1){  
            root.getChildren().add(cir2);
            g1=0;
            } 
       
       }
       
       if(var==2 && SunMoney >= 175){
           img12num = 1;
             SunMoney=SunMoney-175;
          t1=1;
          String plant="pln2.png";
          Image image=new Image(this.getClass().getResource(plant).toString());
          String ground="ground12.jpg";
          Image grass=new Image(this.getClass().getResource(ground).toString());
            
            Timeline timeline11 = new Timeline(new KeyFrame(Duration.millis(10),
            (evt11) -> {     
                if(t1==1){
                    img12.setImage(image);
                }
                if(t1==2){
                    img12.setImage(grass);
                }
                if(score!=s){    
                scorelbl.setText("" +score);
                scorelbl.setFont(new Font(38.0));
                s=score;
                }
            }));
            timeline11.setCycleCount(Animation.INDEFINITE);
            timeline11.play();
               
            cir2.setFill(Color.AQUA);
            cir2.setRadius(10);
            cir2.setLayoutX(370);
            cir2.setLayoutY(175); 
        
            tt12.setDuration(Duration.seconds(1.5));
            tt12.setToX(530);
            tt12.setCycleCount(Animation.INDEFINITE);
            tt12.setNode(cir2);
          
            Timeline timeline1 = new Timeline(new KeyFrame(Duration.seconds(1),
            (evt1) -> {              
              tt12.play();          
            }));
              timeline1.setCycleCount(Animation.INDEFINITE);
              timeline1.play();
              
            Timeline timeline = new Timeline(new KeyFrame(Duration.millis(0.1),
            (evt) -> {                     
                 cir2Bounds=cir2.getBoundsInParent();               
            })); 
              timeline.setCycleCount(Animation.INDEFINITE);
              timeline.play();
              
            if(g1==1){  
            root.getChildren().add(cir2);
            g1=0;
            } 
       }
       
       if(var==3){
           
       }
    }

    @FXML
    void img13(MouseEvent event) {
        if(var==1 && SunMoney >= 100){
          img13num = 1;
          t3=1;
          SunMoney=SunMoney-100;
          String plant="pln1.png";
          Image image=new Image(this.getClass().getResource(plant).toString());
          String ground="ground13.jpg";
          Image grass=new Image(this.getClass().getResource(ground).toString());
            
            Timeline timeline11 = new Timeline(new KeyFrame(Duration.millis(10),
            (evt11) -> {     
                if(t3==1){
                    img13.setImage(image);
                }
                if(t3==2){
                    img13.setImage(grass);
                }
                if(score!=s){    
                scorelbl.setText("" +score);
                scorelbl.setFont(new Font(38.0));
                s=score;
                }
            }));
            timeline11.setCycleCount(Animation.INDEFINITE);
            timeline11.play();
               
            cir3.setFill(Color.GREENYELLOW);
            cir3.setRadius(10);
            cir3.setLayoutX(440);
            cir3.setLayoutY(175); 
        
            tt13.setDuration(Duration.seconds(1.5));
            tt13.setToX(460);
            tt13.setCycleCount(Animation.INDEFINITE);
            tt13.setNode(cir3);
          
            Timeline timeline1 = new Timeline(new KeyFrame(Duration.seconds(1),
            (evt1) -> {              
              tt13.play();          
            }));
              timeline1.setCycleCount(Animation.INDEFINITE);
              timeline1.play();
              
            Timeline timeline = new Timeline(new KeyFrame(Duration.millis(0.1),
            (evt) -> {                     
                 cir3Bounds=cir3.getBoundsInParent();               
            })); 
              timeline.setCycleCount(Animation.INDEFINITE);
              timeline.play();
              
            if(g3==1){  
            root.getChildren().add(cir3);
            g3=0;
            } 
       
        }
        if(var==2 && SunMoney >= 175){
            img13num = 1;
              SunMoney=SunMoney-175;
          t3=1;
          String plant="pln2.png";
          Image image=new Image(this.getClass().getResource(plant).toString());
          String ground="ground13.jpg";
          Image grass=new Image(this.getClass().getResource(ground).toString());
            
            Timeline timeline11 = new Timeline(new KeyFrame(Duration.millis(10),
            (evt11) -> {     
                if(t3==1){
                    img13.setImage(image);
                }
                if(t3==2){
                    img13.setImage(grass);
                }
                if(score!=s){    
                scorelbl.setText("" +score);
                scorelbl.setFont(new Font(38.0));
                s=score;
                }
            }));
            timeline11.setCycleCount(Animation.INDEFINITE);
            timeline11.play();
               
            cir3.setFill(Color.AQUA);
            cir3.setRadius(10);
            cir3.setLayoutX(440);
            cir3.setLayoutY(175); 
        
            tt13.setDuration(Duration.seconds(1.5));
            tt13.setToX(460);
            tt13.setCycleCount(Animation.INDEFINITE);
            tt13.setNode(cir3);
          
            Timeline timeline1 = new Timeline(new KeyFrame(Duration.seconds(1),
            (evt1) -> {              
              tt13.play();          
            }));
              timeline1.setCycleCount(Animation.INDEFINITE);
              timeline1.play();
              
            Timeline timeline = new Timeline(new KeyFrame(Duration.millis(0.1),
            (evt) -> {                     
                 cir3Bounds=cir3.getBoundsInParent();               
            })); 
              timeline.setCycleCount(Animation.INDEFINITE);
              timeline.play();
              
            if(g3==1){  
            root.getChildren().add(cir3);
            g3=0;
            } 
      
        }
        if(var==3){
            
        }
    }

    @FXML
    void img14(MouseEvent event) {
         if(var==1 && SunMoney >= 100){
          img14num = 1;
          SunMoney=SunMoney-100;
          t4=1;
          String plant="pln1.png";
          Image image=new Image(this.getClass().getResource(plant).toString());
          String ground="ground14.jpg";
          Image grass=new Image(this.getClass().getResource(ground).toString());
            
            Timeline timeline11 = new Timeline(new KeyFrame(Duration.millis(10),
            (evt11) -> {     
                if(t4==1){
                    img14.setImage(image);
                }
                if(t4==2){
                    img14.setImage(grass);
                }
                if(score!=s){    
                scorelbl.setText("" +score);
                scorelbl.setFont(new Font(38.0));
                s=score;
                }
            }));
            timeline11.setCycleCount(Animation.INDEFINITE);
            timeline11.play();
               
            cir4.setFill(Color.GREENYELLOW);
            cir4.setRadius(10);
            cir4.setLayoutX(510);
            cir4.setLayoutY(175); 
        
            tt14.setDuration(Duration.seconds(1.5));
            tt14.setToX(390);
            tt14.setCycleCount(Animation.INDEFINITE);
            tt14.setNode(cir4);
          
            Timeline timeline1 = new Timeline(new KeyFrame(Duration.seconds(1),
            (evt1) -> {              
              tt14.play();          
            }));
              timeline1.setCycleCount(Animation.INDEFINITE);
              timeline1.play();
              
            Timeline timeline = new Timeline(new KeyFrame(Duration.millis(0.1),
            (evt) -> {                     
                 cir4Bounds=cir4.getBoundsInParent();               
            })); 
              timeline.setCycleCount(Animation.INDEFINITE);
              timeline.play();
              
            if(g4==1){  
            root.getChildren().add(cir4);
            g4=0;
            } 
       
         }
         
         if(var==2 && SunMoney >= 175){
            img14num = 1;
              SunMoney=SunMoney-175;
          t4=1;
          String plant="pln2.png";
          Image image=new Image(this.getClass().getResource(plant).toString());
          String ground="ground14.jpg";
          Image grass=new Image(this.getClass().getResource(ground).toString());
            
            Timeline timeline11 = new Timeline(new KeyFrame(Duration.millis(10),
            (evt11) -> {     
                if(t4==1){
                    img14.setImage(image);
                }
                if(t4==2){
                    img14.setImage(grass);
                }
                if(score!=s){    
                scorelbl.setText("" +score);
                scorelbl.setFont(new Font(38.0));
                s=score;
                }
            }));
            timeline11.setCycleCount(Animation.INDEFINITE);
            timeline11.play();
               
            cir4.setFill(Color.AQUA);
            cir4.setRadius(10);
            cir4.setLayoutX(510);
            cir4.setLayoutY(175); 
        
            tt14.setDuration(Duration.seconds(1.5));
            tt14.setToX(390);
            tt14.setCycleCount(Animation.INDEFINITE);
            tt14.setNode(cir4);
          
            Timeline timeline1 = new Timeline(new KeyFrame(Duration.seconds(1),
            (evt1) -> {              
              tt14.play();          
            }));
              timeline1.setCycleCount(Animation.INDEFINITE);
              timeline1.play();
              
            Timeline timeline = new Timeline(new KeyFrame(Duration.millis(0.1),
            (evt) -> {                     
                 cir4Bounds=cir4.getBoundsInParent();               
            })); 
              timeline.setCycleCount(Animation.INDEFINITE);
              timeline.play();
              
            if(g4==1){  
            root.getChildren().add(cir4);
            g4=0;
            } 
         }
         
         if(var==3){
             
         }
    }

    @FXML
    void img15(MouseEvent event) {
       if(var==1 && SunMoney >= 100){
          img15num = 1;
          SunMoney=SunMoney-100;
          t5=1;
          String plant="pln1.png";
          Image image=new Image(this.getClass().getResource(plant).toString());
          String ground="ground15.jpg";
          Image grass=new Image(this.getClass().getResource(ground).toString());
            
            Timeline timeline11 = new Timeline(new KeyFrame(Duration.millis(10),
            (evt11) -> {     
                if(t5==1){
                    img15.setImage(image);
                }
                if(t5==2){
                    img15.setImage(grass);
                }
                if(score!=s){    
                scorelbl.setText("" +score);
                scorelbl.setFont(new Font(38.0));
                s=score;
                }
            }));
            timeline11.setCycleCount(Animation.INDEFINITE);
            timeline11.play();
               
            cir5.setFill(Color.GREENYELLOW);
            cir5.setRadius(10);
            cir5.setLayoutX(580);
            cir5.setLayoutY(175); 
        
            tt15.setDuration(Duration.seconds(1.5));
            tt15.setToX(320);
            tt15.setCycleCount(Animation.INDEFINITE);
            tt15.setNode(cir5);
          
            Timeline timeline1 = new Timeline(new KeyFrame(Duration.seconds(1),
            (evt1) -> {              
              tt15.play();          
            }));
              timeline1.setCycleCount(Animation.INDEFINITE);
              timeline1.play();
              
            Timeline timeline = new Timeline(new KeyFrame(Duration.millis(0.1),
            (evt) -> {                     
                 cir5Bounds=cir5.getBoundsInParent();               
            })); 
              timeline.setCycleCount(Animation.INDEFINITE);
              timeline.play();
              
            if(g5==1){  
            root.getChildren().add(cir5);
            g5=0;
            } 
        
       }
       
       if(var==2 && SunMoney >= 175){
          img15num = 1;
            SunMoney=SunMoney-175;
          t5=1;
          String plant="pln2.png";
          Image image=new Image(this.getClass().getResource(plant).toString());
          String ground="ground15.jpg";
          Image grass=new Image(this.getClass().getResource(ground).toString());
            
            Timeline timeline11 = new Timeline(new KeyFrame(Duration.millis(10),
            (evt11) -> {     
                if(t5==1){
                    img15.setImage(image);
                }
                if(t5==2){
                    img15.setImage(grass);
                }
                if(score!=s){    
                scorelbl.setText("" +score);
                scorelbl.setFont(new Font(38.0));
                s=score;
                }
            }));
            timeline11.setCycleCount(Animation.INDEFINITE);
            timeline11.play();
               
            cir5.setFill(Color.AQUA);
            cir5.setRadius(10);
            cir5.setLayoutX(580);
            cir5.setLayoutY(175); 
        
            tt15.setDuration(Duration.seconds(1.5));
            tt15.setToX(320);
            tt15.setCycleCount(Animation.INDEFINITE);
            tt15.setNode(cir5);
          
            Timeline timeline1 = new Timeline(new KeyFrame(Duration.seconds(1),
            (evt1) -> {              
              tt15.play();          
            }));
              timeline1.setCycleCount(Animation.INDEFINITE);
              timeline1.play();
              
            Timeline timeline = new Timeline(new KeyFrame(Duration.millis(0.1),
            (evt) -> {                     
                 cir5Bounds=cir5.getBoundsInParent();               
            })); 
              timeline.setCycleCount(Animation.INDEFINITE);
              timeline.play();
              
            if(g5==1){  
            root.getChildren().add(cir5);
            g5=0;
            } 
        
       }
       
       if(var==3){
           
       }
    }

    @FXML
    void img16(MouseEvent event) {
        if(var==1 && SunMoney >= 100){
          img16num = 1;
          SunMoney=SunMoney-100;
          t6=1;
          String plant="pln1.png";
          Image image=new Image(this.getClass().getResource(plant).toString());
          String ground="ground16.jpg";
          Image grass=new Image(this.getClass().getResource(ground).toString());
            
            Timeline timeline11 = new Timeline(new KeyFrame(Duration.millis(10),
            (evt11) -> {     
                if(t6==1){
                    img16.setImage(image);
                }
                if(t6==2){
                    img16.setImage(grass);
                }
                if(score!=s){    
                scorelbl.setText("" +score);
                scorelbl.setFont(new Font(38.0));
                s=score;
                }
            }));
            timeline11.setCycleCount(Animation.INDEFINITE);
            timeline11.play();
               
            cir6.setFill(Color.GREENYELLOW);
            cir6.setRadius(10);
            cir6.setLayoutX(650);
            cir6.setLayoutY(175); 
        
            tt16.setDuration(Duration.seconds(1.5));
            tt16.setToX(250);
            tt16.setCycleCount(Animation.INDEFINITE);
            tt16.setNode(cir6);
          
            Timeline timeline1 = new Timeline(new KeyFrame(Duration.seconds(1),
            (evt1) -> {              
              tt16.play();          
            }));
              timeline1.setCycleCount(Animation.INDEFINITE);
              timeline1.play();
              
            Timeline timeline = new Timeline(new KeyFrame(Duration.millis(0.1),
            (evt) -> {                     
                 cir6Bounds=cir6.getBoundsInParent();               
            })); 
              timeline.setCycleCount(Animation.INDEFINITE);
              timeline.play();
              
            if(g6==1){  
            root.getChildren().add(cir6);
            g6=0;
            } 
         
        }
        if(var==2 && SunMoney >= 175){
          img16num = 1;
            SunMoney=SunMoney-175;
          t6=1;
          String plant="pln2.png";
          Image image=new Image(this.getClass().getResource(plant).toString());
          String ground="ground16.jpg";
          Image grass=new Image(this.getClass().getResource(ground).toString());
            
            Timeline timeline11 = new Timeline(new KeyFrame(Duration.millis(10),
            (evt11) -> {     
                if(t6==1){
                    img16.setImage(image);
                }
                if(t6==2){
                    img16.setImage(grass);
                }
                if(score!=s){    
                scorelbl.setText("" +score);
                scorelbl.setFont(new Font(38.0));
                s=score;
                }
            }));
            timeline11.setCycleCount(Animation.INDEFINITE);
            timeline11.play();
               
            cir6.setFill(Color.AQUA);
            cir6.setRadius(10);
            cir6.setLayoutX(650);
            cir6.setLayoutY(175); 
        
            tt16.setDuration(Duration.seconds(1.5));
            tt16.setToX(250);
            tt16.setCycleCount(Animation.INDEFINITE);
            tt16.setNode(cir6);
          
            Timeline timeline1 = new Timeline(new KeyFrame(Duration.seconds(1),
            (evt1) -> {              
              tt16.play();          
            }));
              timeline1.setCycleCount(Animation.INDEFINITE);
              timeline1.play();
              
            Timeline timeline = new Timeline(new KeyFrame(Duration.millis(0.1),
            (evt) -> {                     
                 cir6Bounds=cir6.getBoundsInParent();               
            })); 
              timeline.setCycleCount(Animation.INDEFINITE);
              timeline.play();
              
            if(g6==1){  
            root.getChildren().add(cir6);
            g6=0;
            } 
             
        }
        if(var==3){
            
        }    
    }

    @FXML
    void img17(MouseEvent event) {
          if(var==1 && SunMoney >= 100){
              SunMoney=SunMoney-100;
          img17num = 1;
          t7=1;
          String plant="pln1.png";
          Image image=new Image(this.getClass().getResource(plant).toString());
          String ground="ground17.jpg";
          Image grass=new Image(this.getClass().getResource(ground).toString());
            
            Timeline timeline11 = new Timeline(new KeyFrame(Duration.millis(10),
            (evt11) -> {     
                if(t7==1){
                    img17.setImage(image);
                }
                if(t7==2){
                    img17.setImage(grass);
                }
                if(score!=s){    
                scorelbl.setText("" +score);
                scorelbl.setFont(new Font(38.0));
                s=score;
                }
            }));
            timeline11.setCycleCount(Animation.INDEFINITE);
            timeline11.play();
               
            cir7.setFill(Color.GREENYELLOW);
            cir7.setRadius(10);
            cir7.setLayoutX(720);
            cir7.setLayoutY(175); 
        
            tt17.setDuration(Duration.seconds(1.5));
            tt17.setToX(180);
            tt17.setCycleCount(Animation.INDEFINITE);
            tt17.setNode(cir7);
          
            Timeline timeline1 = new Timeline(new KeyFrame(Duration.seconds(1),
            (evt1) -> {              
              tt17.play();          
            }));
              timeline1.setCycleCount(Animation.INDEFINITE);
              timeline1.play();
              
            Timeline timeline = new Timeline(new KeyFrame(Duration.millis(0.1),
            (evt) -> {                     
                 cir7Bounds=cir7.getBoundsInParent();               
            })); 
              timeline.setCycleCount(Animation.INDEFINITE);
              timeline.play();
              
            if(g7==1){  
            root.getChildren().add(cir7);
            g7=0;
            } 
         
        }
        if(var==2 && SunMoney >= 175){
          img17num = 1;
            SunMoney=SunMoney-175;
          t7=1;
          String plant="pln2.png";
          Image image=new Image(this.getClass().getResource(plant).toString());
          String ground="ground17.jpg";
          Image grass=new Image(this.getClass().getResource(ground).toString());
            
            Timeline timeline11 = new Timeline(new KeyFrame(Duration.millis(10),
            (evt11) -> {     
                if(t7==1){
                    img17.setImage(image);
                }
                if(t7==2){
                    img17.setImage(grass);
                }
                if(score!=s){    
                scorelbl.setText("" +score);
                scorelbl.setFont(new Font(38.0));
                s=score;
                }
            }));
            timeline11.setCycleCount(Animation.INDEFINITE);
            timeline11.play();
               
            cir7.setFill(Color.AQUA);
            cir7.setRadius(10);
            cir7.setLayoutX(720);
            cir7.setLayoutY(175); 
        
            tt17.setDuration(Duration.seconds(1.5));
            tt17.setToX(180);
            tt17.setCycleCount(Animation.INDEFINITE);
            tt17.setNode(cir7);
         
            Timeline timeline1 = new Timeline(new KeyFrame(Duration.seconds(1),
            (evt1) -> {              
              tt17.play();          
            }));
              timeline1.setCycleCount(Animation.INDEFINITE);
              timeline1.play();
              
            Timeline timeline = new Timeline(new KeyFrame(Duration.millis(0.1),
            (evt) -> {                     
                 cir7Bounds=cir7.getBoundsInParent();               
            })); 
              timeline.setCycleCount(Animation.INDEFINITE);
              timeline.play();
              
            if(g7==1){  
            root.getChildren().add(cir7);
            g7=0;
            } 
             
        }
        if(var==3){
            
        }  
    }

    @FXML
    void img18(MouseEvent event) {
      if(var==1 && SunMoney >= 100){
          SunMoney=SunMoney-100;
          img18num = 1;
          t8=1;
          String plant="pln1.png";
          Image image=new Image(this.getClass().getResource(plant).toString());
          String ground="ground18.jpg";
          Image grass=new Image(this.getClass().getResource(ground).toString());
            
            Timeline timeline11 = new Timeline(new KeyFrame(Duration.millis(10),
            (evt11) -> {     
                if(t8==1){
                    img18.setImage(image);
                }
                if(t8==2){
                    img18.setImage(grass);
                }
                if(score!=s){    
                scorelbl.setText("" +score);
                scorelbl.setFont(new Font(38.0));
                s=score;
                }
            }));
            timeline11.setCycleCount(Animation.INDEFINITE);
            timeline11.play();
               
            cir8.setFill(Color.GREENYELLOW);
            cir8.setRadius(10);
            cir8.setLayoutX(790);
            cir8.setLayoutY(175); 
        
            tt18.setDuration(Duration.seconds(1.5));
            tt18.setToX(110);
            tt18.setCycleCount(Animation.INDEFINITE);
            tt18.setNode(cir8);
          
            Timeline timeline1 = new Timeline(new KeyFrame(Duration.seconds(1),
            (evt1) -> {              
              tt18.play();          
            }));
              timeline1.setCycleCount(Animation.INDEFINITE);
              timeline1.play();
              
            Timeline timeline = new Timeline(new KeyFrame(Duration.millis(0.1),
            (evt) -> {                     
                 cir8Bounds=cir8.getBoundsInParent();               
            })); 
              timeline.setCycleCount(Animation.INDEFINITE);
              timeline.play();
              
            if(g8==1){  
            root.getChildren().add(cir8);
            g8=0;
            } 
         
        }
        if(var==2 && SunMoney >= 175){
          img18num = 1;
          t8=1;
            SunMoney=SunMoney-175;
          String plant="pln2.png";
          Image image=new Image(this.getClass().getResource(plant).toString());
          String ground="ground18.jpg";
          Image grass=new Image(this.getClass().getResource(ground).toString());
            
            Timeline timeline11 = new Timeline(new KeyFrame(Duration.millis(10),
            (evt11) -> {     
                if(t8==1){
                    img18.setImage(image);
                }
                if(t8==2){
                    img18.setImage(grass);
                }
                if(score!=s){    
                scorelbl.setText("" +score);
                scorelbl.setFont(new Font(38.0));
                s=score;
                }
            }));
            timeline11.setCycleCount(Animation.INDEFINITE);
            timeline11.play();
               
            cir8.setFill(Color.AQUA);
            cir8.setRadius(10);
            cir8.setLayoutX(790);
            cir8.setLayoutY(175); 
        
            tt18.setDuration(Duration.seconds(1.5));
            tt18.setToX(110);
            tt18.setCycleCount(Animation.INDEFINITE);
            tt18.setNode(cir8);
         
            Timeline timeline1 = new Timeline(new KeyFrame(Duration.seconds(1),
            (evt1) -> {              
              tt18.play();          
            }));
              timeline1.setCycleCount(Animation.INDEFINITE);
              timeline1.play();
              
            Timeline timeline = new Timeline(new KeyFrame(Duration.millis(0.1),
            (evt) -> {                     
                 cir8Bounds=cir8.getBoundsInParent();               
            })); 
              timeline.setCycleCount(Animation.INDEFINITE);
              timeline.play();
              
            if(g8==1){  
            root.getChildren().add(cir8);
            g8=0;
            } 
             
        }
        if(var==3){
            
        }  
    }

    @FXML
    void img19(MouseEvent event) {
       if(var==1 && SunMoney >= 100){
           SunMoney=SunMoney-100;
          img19num = 1;
          t9=1;
          String plant="pln1.png";
          Image image=new Image(this.getClass().getResource(plant).toString());
          String ground="ground19.jpg";
          Image grass=new Image(this.getClass().getResource(ground).toString());
            
            Timeline timeline11 = new Timeline(new KeyFrame(Duration.millis(10),
            (evt11) -> {     
                if(t9==1){
                    img19.setImage(image);
                }
                if(t9==2){
                    img19.setImage(grass);
                }
                if(score!=s){    
                scorelbl.setText("" +score);
                scorelbl.setFont(new Font(38.0));
                s=score;
                }
            }));
            timeline11.setCycleCount(Animation.INDEFINITE);
            timeline11.play();
               
            cir9.setFill(Color.GREENYELLOW);
            cir9.setRadius(10);
            cir9.setLayoutX(860);
            cir9.setLayoutY(175); 
        
            tt19.setDuration(Duration.seconds(1.5));
            tt19.setToX(110);
            tt19.setCycleCount(Animation.INDEFINITE);
            tt19.setNode(cir9);
          
            Timeline timeline1 = new Timeline(new KeyFrame(Duration.seconds(1),
            (evt1) -> {              
              tt19.play();          
            }));
              timeline1.setCycleCount(Animation.INDEFINITE);
              timeline1.play();
              
            Timeline timeline = new Timeline(new KeyFrame(Duration.millis(0.1),
            (evt) -> {                     
                 cir9Bounds=cir9.getBoundsInParent();               
            })); 
              timeline.setCycleCount(Animation.INDEFINITE);
              timeline.play();
              
            if(g9==1){  
            root.getChildren().add(cir9);
            g9=0;
            } 
         
        }
        if(var==2 && SunMoney >= 175){
          img19num = 1;
          t9=1;
            SunMoney=SunMoney-175;
          String plant="pln2.png";
          Image image=new Image(this.getClass().getResource(plant).toString());
          String ground="ground19.jpg";
          Image grass=new Image(this.getClass().getResource(ground).toString());
            
            Timeline timeline11 = new Timeline(new KeyFrame(Duration.millis(10),
            (evt11) -> {     
                if(t9==1){
                    img19.setImage(image);
                }
                if(t9==2){
                    img19.setImage(grass);
                }
                if(score!=s){    
                scorelbl.setText("" +score);
                scorelbl.setFont(new Font(38.0));
                s=score;
                }
            }));
            timeline11.setCycleCount(Animation.INDEFINITE);
            timeline11.play();
               
            cir9.setFill(Color.AQUA);
            cir9.setRadius(10);
            cir9.setLayoutX(860);
            cir9.setLayoutY(175); 
        
            tt19.setDuration(Duration.seconds(1.5));
            tt19.setToX(110);
            tt19.setCycleCount(Animation.INDEFINITE);
            tt19.setNode(cir9);
         
            Timeline timeline1 = new Timeline(new KeyFrame(Duration.seconds(1),
            (evt1) -> {              
              tt19.play();          
            }));
              timeline1.setCycleCount(Animation.INDEFINITE);
              timeline1.play();
              
            Timeline timeline = new Timeline(new KeyFrame(Duration.millis(0.1),
            (evt) -> {                     
                 cir9Bounds=cir9.getBoundsInParent();               
            })); 
              timeline.setCycleCount(Animation.INDEFINITE);
              timeline.play();
              
            if(g9==1){  
            root.getChildren().add(cir9);
            g9=0;
            } 
             
        }
        if(var==3){
            
        }  
    }

    @FXML
    void img21(MouseEvent event) {
        if(var == 1 && SunMoney >= 100){
          img21num = 1;
          SunMoney=SunMoney-100;
          t21=1;
          String plant="pln1.png";
          Image image=new Image(this.getClass().getResource(plant).toString());
          String ground="ground21.jpg";
          Image grass=new Image(this.getClass().getResource(ground).toString());
            
            Timeline timeline11 = new Timeline(new KeyFrame(Duration.millis(10),
            (evt11) -> {     
                if(t21==1){
                     img21.setImage(image);
                }
                if(t21==2){
                    img21.setImage(grass);
                }
                if(score!=s){    
                scorelbl.setText("" +score);
                scorelbl.setFont(new Font(38.0));
                s=score;
                }
            }));
            timeline11.setCycleCount(Animation.INDEFINITE);
            timeline11.play();
            cir21.setFill(Color.GREENYELLOW);
            cir21.setRadius(10);
            cir21.setLayoutX(300);
            cir21.setLayoutY(260); 
        
            tt21.setDuration(Duration.seconds(1.5));
            tt21.setToX(600);
            tt21.setCycleCount(Animation.INDEFINITE);
            tt21.setNode(cir21);
          
            Timeline timeline1 = new Timeline(new KeyFrame(Duration.seconds(1),
            (evt1) -> {              
              tt21.play();          
            }));
              timeline1.setCycleCount(Animation.INDEFINITE);
              timeline1.play();
              
            Timeline timeline = new Timeline(new KeyFrame(Duration.millis(0.1),
            (evt) -> {                     
                 cir21Bounds=cir21.getBoundsInParent();               
            })); 
              timeline.setCycleCount(Animation.INDEFINITE);
              timeline.play();
              
            if(g21==1){  
            root.getChildren().add(cir21);
            g21=0;
            } 
       
    }
    
    if(var == 2 && SunMoney >= 175){
          img21num = 1;
            SunMoney=SunMoney-175;
          t21=1;
          String plant="pln2.png";
          Image image=new Image(this.getClass().getResource(plant).toString());
          String ground="ground21.jpg";
          Image grass=new Image(this.getClass().getResource(ground).toString());
            
            Timeline timeline11 = new Timeline(new KeyFrame(Duration.millis(10),
            (evt11) -> {     
                if(t21==1){
                     img21.setImage(image);
                }
                if(t21==2){
                    img21.setImage(grass);
                }
                if(score!=s){    
                scorelbl.setText("" +score);
                scorelbl.setFont(new Font(38.0));
                s=score;
                }
            }));
            timeline11.setCycleCount(Animation.INDEFINITE);
            timeline11.play();
               
            cir21.setFill(Color.AQUA);
            cir21.setRadius(10);
            cir21.setLayoutX(300);
            cir21.setLayoutY(260); 
        
            tt21.setDuration(Duration.seconds(1.5));
            tt21.setToX(600);
            tt21.setCycleCount(Animation.INDEFINITE);
            tt21.setNode(cir21);
          
            Timeline timeline1 = new Timeline(new KeyFrame(Duration.seconds(1),
            (evt1) -> {              
              tt21.play();          
            }));
              timeline1.setCycleCount(Animation.INDEFINITE);
              timeline1.play();
              
            Timeline timeline = new Timeline(new KeyFrame(Duration.millis(0.1),
            (evt) -> {                     
                 cir21Bounds=cir21.getBoundsInParent();               
            })); 
              timeline.setCycleCount(Animation.INDEFINITE);
              timeline.play();
              
            if(g21==1){  
            root.getChildren().add(cir21);
            g21=0;
            } 
       
    }
    
    if(var == 3){
             System.out.print("oooo");
    }
        
    }

    @FXML
    void img22(MouseEvent event) {
           if(var == 1 && SunMoney >= 100){
               SunMoney=SunMoney-100;
          img22num = 1;
          t22=1;
          String plant="pln1.png";
          Image image=new Image(this.getClass().getResource(plant).toString());
          String ground="ground22.jpg";
          Image grass=new Image(this.getClass().getResource(ground).toString());
            
            Timeline timeline11 = new Timeline(new KeyFrame(Duration.millis(10),
            (evt11) -> {     
                if(t22==1){
                     img22.setImage(image);
                }
                if(t22==2){
                    img22.setImage(grass);
                }
                if(score!=s){    
                scorelbl.setText("" +score);
                scorelbl.setFont(new Font(38.0));
                s=score;
                }
            }));
            timeline11.setCycleCount(Animation.INDEFINITE);
            timeline11.play();
            cir22.setFill(Color.GREENYELLOW);
            cir22.setRadius(10);
            cir22.setLayoutX(370);
            cir22.setLayoutY(260); 
       
            tt22.setDuration(Duration.seconds(1.5));
            tt22.setToX(530);
            tt22.setCycleCount(Animation.INDEFINITE);
            tt22.setNode(cir22);
          
            Timeline timeline1 = new Timeline(new KeyFrame(Duration.seconds(1),
            (evt1) -> {              
              tt22.play();          
            }));
              timeline1.setCycleCount(Animation.INDEFINITE);
              timeline1.play();
              
            Timeline timeline = new Timeline(new KeyFrame(Duration.millis(0.1),
            (evt) -> {                     
                 cir22Bounds=cir22.getBoundsInParent();               
            })); 
              timeline.setCycleCount(Animation.INDEFINITE);
              timeline.play();
              
            if(g22==1){  
            root.getChildren().add(cir22);
            g22=0;
            } 
       
    }
    
    if(var == 2 && SunMoney >= 175){
          img22num = 1;
            SunMoney=SunMoney-175;
          t22=1;
          String plant="pln2.png";
          Image image=new Image(this.getClass().getResource(plant).toString());
          String ground="ground22.jpg";
          Image grass=new Image(this.getClass().getResource(ground).toString());
            
            Timeline timeline11 = new Timeline(new KeyFrame(Duration.millis(10),
            (evt11) -> {     
                if(t22==1){
                     img22.setImage(image);
                }
                if(t22==2){
                    img22.setImage(grass);
                }
                if(score!=s){    
                scorelbl.setText("" +score);
                scorelbl.setFont(new Font(38.0));
                s=score;
                }
            }));
            timeline11.setCycleCount(Animation.INDEFINITE);
            timeline11.play();
               
            cir22.setFill(Color.AQUA);
            cir22.setRadius(10);
            cir22.setLayoutX(370);
            cir22.setLayoutY(260); 
        
            tt22.setDuration(Duration.seconds(1.5));
            tt22.setToX(530);
            tt22.setCycleCount(Animation.INDEFINITE);
            tt22.setNode(cir22);
          
            Timeline timeline1 = new Timeline(new KeyFrame(Duration.seconds(1),
            (evt1) -> {              
              tt22.play();          
            }));
              timeline1.setCycleCount(Animation.INDEFINITE);
              timeline1.play();
              
            Timeline timeline = new Timeline(new KeyFrame(Duration.millis(0.1),
            (evt) -> {                     
                 cir22Bounds=cir22.getBoundsInParent();               
            })); 
              timeline.setCycleCount(Animation.INDEFINITE);
              timeline.play();
              
            if(g22==1){  
            root.getChildren().add(cir22);
            g22=0;
            } 
       
    }
    
    if(var == 3){
             System.out.print("oooo");
    }
        
    }

    @FXML
    void img23(MouseEvent event) {
         if(var==1 && SunMoney >= 100){
          img23num = 1;
          SunMoney=SunMoney-100;
          t23=1;
          String plant="pln1.png";
          Image image=new Image(this.getClass().getResource(plant).toString());
          String ground="ground23.jpg";
          Image grass=new Image(this.getClass().getResource(ground).toString());
            
            Timeline timeline11 = new Timeline(new KeyFrame(Duration.millis(10),
            (evt11) -> {     
                if(t23==1){
                    img23.setImage(image);
                }
                if(t23==2){
                    img23.setImage(grass);
                }
                if(score!=s){    
                scorelbl.setText("" +score);
                scorelbl.setFont(new Font(38.0));
                s=score;
                }
            }));
            timeline11.setCycleCount(Animation.INDEFINITE);
            timeline11.play();
               
            cir23.setFill(Color.GREENYELLOW);
            cir23.setRadius(10);
            cir23.setLayoutX(440);
            cir23.setLayoutY(260); 
        
            tt23.setDuration(Duration.seconds(1.5));
            tt23.setToX(460);
            tt23.setCycleCount(Animation.INDEFINITE);
            tt23.setNode(cir23);
          
            Timeline timeline1 = new Timeline(new KeyFrame(Duration.seconds(1),
            (evt1) -> {              
              tt23.play();          
            }));
              timeline1.setCycleCount(Animation.INDEFINITE);
              timeline1.play();
              
            Timeline timeline = new Timeline(new KeyFrame(Duration.millis(0.1),
            (evt) -> {                     
                 cir23Bounds=cir23.getBoundsInParent();               
            })); 
              timeline.setCycleCount(Animation.INDEFINITE);
              timeline.play();
              
            if(g23==1){  
            root.getChildren().add(cir23);
            g23=0;
            } 
       
        }
        if(var==2 && SunMoney >= 175){
          img23num = 1;
            SunMoney=SunMoney-175;
          t23=1;
          String plant="pln2.png";
          Image image=new Image(this.getClass().getResource(plant).toString());
          String ground="ground23.jpg";
          Image grass=new Image(this.getClass().getResource(ground).toString());
            
            Timeline timeline11 = new Timeline(new KeyFrame(Duration.millis(10),
            (evt11) -> {     
                if(t23==1){
                    img23.setImage(image);
                }
                if(t23==2){
                    img23.setImage(grass);
                }
                if(score!=s){    
                scorelbl.setText("" +score);
                scorelbl.setFont(new Font(38.0));
                s=score;
                }
            }));
            timeline11.setCycleCount(Animation.INDEFINITE);
            timeline11.play();
               
            cir23.setFill(Color.AQUA);
            cir23.setRadius(10);
            cir23.setLayoutX(440);
            cir23.setLayoutY(260); 
        
            tt23.setDuration(Duration.seconds(1.5));
            tt23.setToX(460);
            tt23.setCycleCount(Animation.INDEFINITE);
            tt23.setNode(cir23);
          
            Timeline timeline1 = new Timeline(new KeyFrame(Duration.seconds(1),
            (evt1) -> {              
              tt23.play();          
            }));
              timeline1.setCycleCount(Animation.INDEFINITE);
              timeline1.play();
              
            Timeline timeline = new Timeline(new KeyFrame(Duration.millis(0.1),
            (evt) -> {                     
                 cir23Bounds=cir23.getBoundsInParent();               
            })); 
              timeline.setCycleCount(Animation.INDEFINITE);
              timeline.play();
              
            if(g23==1){  
            root.getChildren().add(cir23);
            g23=0;
            } 
      
        }
        if(var==3){
            
        }
    }

    @FXML
    void img24(MouseEvent event) {
        if(var==1 && SunMoney >= 100){
          img24num = 1;
          t24=1;
          String plant="pln1.png";
          Image image=new Image(this.getClass().getResource(plant).toString());
          String ground="ground24.jpg";
          Image grass=new Image(this.getClass().getResource(ground).toString());
            
            Timeline timeline11 = new Timeline(new KeyFrame(Duration.millis(10),
            (evt11) -> {     
                if(t24==1){
                    img24.setImage(image);
                }
                if(t24==2){
                    img24.setImage(grass);
                }
                if(score!=s){    
                scorelbl.setText("" +score);
                scorelbl.setFont(new Font(38.0));
                s=score;
                }
            }));
            timeline11.setCycleCount(Animation.INDEFINITE);
            timeline11.play();
               
            cir24.setFill(Color.GREENYELLOW);
            cir24.setRadius(10);
            cir24.setLayoutX(510);
            cir24.setLayoutY(260); 
        
            tt24.setDuration(Duration.seconds(1.5));
            tt24.setToX(390);
            tt24.setCycleCount(Animation.INDEFINITE);
            tt24.setNode(cir24);
          
            Timeline timeline1 = new Timeline(new KeyFrame(Duration.seconds(1),
            (evt1) -> {              
              tt24.play();          
            }));
              timeline1.setCycleCount(Animation.INDEFINITE);
              timeline1.play();
              
            Timeline timeline = new Timeline(new KeyFrame(Duration.millis(0.1),
            (evt) -> {                     
                 cir24Bounds=cir24.getBoundsInParent();               
            })); 
              timeline.setCycleCount(Animation.INDEFINITE);
              timeline.play();
              
            if(g24==1){  
            root.getChildren().add(cir24);
            g24=0;
            } 
       
         }
         
         if(var==2 && SunMoney >= 175){
            img24num = 1;
              SunMoney=SunMoney-175;
          t24=1;
          String plant="pln2.png";
          Image image=new Image(this.getClass().getResource(plant).toString());
          String ground="ground24.jpg";
          Image grass=new Image(this.getClass().getResource(ground).toString());
            
            Timeline timeline11 = new Timeline(new KeyFrame(Duration.millis(10),
            (evt11) -> {     
                if(t24==1){
                    img24.setImage(image);
                }
                if(t24==2){
                    img24.setImage(grass);
                }
                if(score!=s){    
                scorelbl.setText("" +score);
                scorelbl.setFont(new Font(38.0));
                s=score;
                }
            }));
            timeline11.setCycleCount(Animation.INDEFINITE);
            timeline11.play();
               
            cir24.setFill(Color.AQUA);
            cir24.setRadius(10);
            cir24.setLayoutX(510);
            cir24.setLayoutY(260); 
        
            tt24.setDuration(Duration.seconds(1.5));
            tt24.setToX(390);
            tt24.setCycleCount(Animation.INDEFINITE);
            tt24.setNode(cir24);
          
            Timeline timeline1 = new Timeline(new KeyFrame(Duration.seconds(1),
            (evt1) -> {              
              tt24.play();          
            }));
              timeline1.setCycleCount(Animation.INDEFINITE);
              timeline1.play();
              
            Timeline timeline = new Timeline(new KeyFrame(Duration.millis(0.1),
            (evt) -> {                     
                 cir24Bounds=cir24.getBoundsInParent();               
            })); 
              timeline.setCycleCount(Animation.INDEFINITE);
              timeline.play();
              
            if(g24==1){  
            root.getChildren().add(cir24);
            g24=0;
            } 
         }
         
         if(var==3){
             
         }
    }

    @FXML
    void img25(MouseEvent event) {
        if(var==1 && SunMoney >= 100){
          img25num = 1;
          SunMoney=SunMoney-100;
          t25=1;
          String plant="pln1.png";
          Image image=new Image(this.getClass().getResource(plant).toString());
          String ground="ground25.jpg";
          Image grass=new Image(this.getClass().getResource(ground).toString());
            
            Timeline timeline11 = new Timeline(new KeyFrame(Duration.millis(10),
            (evt11) -> {     
                if(t25==1){
                    img25.setImage(image);
                }
                if(t25==2){
                    img25.setImage(grass);
                }
                if(score!=s){    
                scorelbl.setText("" +score);
                scorelbl.setFont(new Font(38.0));
                s=score;
                }
            }));
            timeline11.setCycleCount(Animation.INDEFINITE);
            timeline11.play();
               
            cir25.setFill(Color.GREENYELLOW);
            cir25.setRadius(10);
            cir25.setLayoutX(580);
            cir25.setLayoutY(260); 
        
            tt25.setDuration(Duration.seconds(1.5));
            tt25.setToX(320);
            tt25.setCycleCount(Animation.INDEFINITE);
            tt25.setNode(cir25);
          
            Timeline timeline1 = new Timeline(new KeyFrame(Duration.seconds(1),
            (evt1) -> {              
              tt25.play();          
            }));
              timeline1.setCycleCount(Animation.INDEFINITE);
              timeline1.play();
              
            Timeline timeline = new Timeline(new KeyFrame(Duration.millis(0.1),
            (evt) -> {                     
                 cir25Bounds=cir25.getBoundsInParent();               
            })); 
              timeline.setCycleCount(Animation.INDEFINITE);
              timeline.play();
              
            if(g25==1){  
            root.getChildren().add(cir25);
            g25=0;
            } 
        
       }
       
       if(var==2 && SunMoney >= 175){
          img25num = 1;
            SunMoney=SunMoney-175;
          t25=1;
          String plant="pln2.png";
          Image image=new Image(this.getClass().getResource(plant).toString());
          String ground="ground25.jpg";
          Image grass=new Image(this.getClass().getResource(ground).toString());
            
            Timeline timeline11 = new Timeline(new KeyFrame(Duration.millis(10),
            (evt11) -> {     
                if(t25==1){
                    img25.setImage(image);
                }
                if(t25==2){
                    img25.setImage(grass);
                }
                if(score!=s){    
                scorelbl.setText("" +score);
                scorelbl.setFont(new Font(38.0));
                s=score;
                }
            }));
            timeline11.setCycleCount(Animation.INDEFINITE);
            timeline11.play();
               
            cir25.setFill(Color.AQUA);
            cir25.setRadius(10);
            cir25.setLayoutX(580);
            cir25.setLayoutY(260); 
        
            tt25.setDuration(Duration.seconds(1.5));
            tt25.setToX(320);
            tt25.setCycleCount(Animation.INDEFINITE);
            tt25.setNode(cir25);
          
            Timeline timeline1 = new Timeline(new KeyFrame(Duration.seconds(1),
            (evt1) -> {              
              tt25.play();          
            }));
              timeline1.setCycleCount(Animation.INDEFINITE);
              timeline1.play();
              
            Timeline timeline = new Timeline(new KeyFrame(Duration.millis(0.1),
            (evt) -> {                     
                 cir25Bounds=cir25.getBoundsInParent();               
            })); 
              timeline.setCycleCount(Animation.INDEFINITE);
              timeline.play();
              
            if(g25==1){  
            root.getChildren().add(cir25);
            g25=0;
            } 
        
       }
       
       if(var==3){
           
       }
    }

    @FXML
    void img26(MouseEvent event) {
       if(var==1 && SunMoney >= 100){
          img26num = 1;
          SunMoney=SunMoney-100;
          t26=1;
          String plant="pln1.png";
          Image image=new Image(this.getClass().getResource(plant).toString());
          String ground="ground26.jpg";
          Image grass=new Image(this.getClass().getResource(ground).toString());
            
            Timeline timeline11 = new Timeline(new KeyFrame(Duration.millis(10),
            (evt11) -> {     
                if(t26==1){
                    img26.setImage(image);
                }
                if(t26==2){
                    img26.setImage(grass);
                }
                if(score!=s){    
                scorelbl.setText("" +score);
                scorelbl.setFont(new Font(38.0));
                s=score;
                }
            }));
            timeline11.setCycleCount(Animation.INDEFINITE);
            timeline11.play();
               
            cir26.setFill(Color.GREENYELLOW);
            cir26.setRadius(10);
            cir26.setLayoutX(650);
            cir26.setLayoutY(260); 
        
            tt26.setDuration(Duration.seconds(1.5));
            tt26.setToX(250);
            tt26.setCycleCount(Animation.INDEFINITE);
            tt26.setNode(cir26);
          
            Timeline timeline1 = new Timeline(new KeyFrame(Duration.seconds(1),
            (evt1) -> {              
              tt26.play();          
            }));
              timeline1.setCycleCount(Animation.INDEFINITE);
              timeline1.play();
              
            Timeline timeline = new Timeline(new KeyFrame(Duration.millis(0.1),
            (evt) -> {                     
                 cir26Bounds=cir26.getBoundsInParent();               
            })); 
              timeline.setCycleCount(Animation.INDEFINITE);
              timeline.play();
              
            if(g26==1){  
            root.getChildren().add(cir26);
            g26=0;
            } 
         
        }
        if(var==2 && SunMoney >= 175){
          img26num = 1;
            SunMoney=SunMoney-175;
          t26=1;
          String plant="pln2.png";
          Image image=new Image(this.getClass().getResource(plant).toString());
          String ground="ground26.jpg";
          Image grass=new Image(this.getClass().getResource(ground).toString());
            
            Timeline timeline11 = new Timeline(new KeyFrame(Duration.millis(10),
            (evt11) -> {     
                if(t26==1){
                    img26.setImage(image);
                }
                if(t26==2){
                    img26.setImage(grass);
                }
                if(score!=s){    
                scorelbl.setText("" +score);
                scorelbl.setFont(new Font(38.0));
                s=score;
                }
            }));
            timeline11.setCycleCount(Animation.INDEFINITE);
            timeline11.play();
               
            cir26.setFill(Color.AQUA);
            cir26.setRadius(10);
            cir26.setLayoutX(650);
            cir26.setLayoutY(260); 
        
            tt26.setDuration(Duration.seconds(1.5));
            tt26.setToX(250);
            tt26.setCycleCount(Animation.INDEFINITE);
            tt26.setNode(cir26);
          
            Timeline timeline1 = new Timeline(new KeyFrame(Duration.seconds(1),
            (evt1) -> {              
              tt26.play();          
            }));
              timeline1.setCycleCount(Animation.INDEFINITE);
              timeline1.play();
              
            Timeline timeline = new Timeline(new KeyFrame(Duration.millis(0.1),
            (evt) -> {                     
                 cir26Bounds=cir26.getBoundsInParent();               
            })); 
              timeline.setCycleCount(Animation.INDEFINITE);
              timeline.play();
              
            if(g26==1){  
            root.getChildren().add(cir26);
            g26=0;
            } 
             
        }
        if(var==3){
            
        }    
    }

    @FXML
    void img27(MouseEvent event) {
        if(var==1 && SunMoney >= 100){
            SunMoney=SunMoney-100;
          img27num = 1;
          t27=1;
          String plant="pln1.png";
          Image image=new Image(this.getClass().getResource(plant).toString());
          String ground="ground27.jpg";
          Image grass=new Image(this.getClass().getResource(ground).toString());
            
            Timeline timeline11 = new Timeline(new KeyFrame(Duration.millis(10),
            (evt11) -> {     
                if(t27==1){
                    img27.setImage(image);
                }
                if(t27==2){
                    img27.setImage(grass);
                }
                if(score!=s){    
                scorelbl.setText("" +score);
                scorelbl.setFont(new Font(38.0));
                s=score;
                }
            }));
            timeline11.setCycleCount(Animation.INDEFINITE);
            timeline11.play();
               
            cir27.setFill(Color.GREENYELLOW);
            cir27.setRadius(10);
            cir27.setLayoutX(720);
            cir27.setLayoutY(260); 
        
            tt27.setDuration(Duration.seconds(1.5));
            tt27.setToX(180);
            tt27.setCycleCount(Animation.INDEFINITE);
            tt27.setNode(cir27);
          
            Timeline timeline1 = new Timeline(new KeyFrame(Duration.seconds(1),
            (evt1) -> {              
              tt27.play();          
            }));
              timeline1.setCycleCount(Animation.INDEFINITE);
              timeline1.play();
              
            Timeline timeline = new Timeline(new KeyFrame(Duration.millis(0.1),
            (evt) -> {                     
                 cir27Bounds=cir27.getBoundsInParent();               
            })); 
              timeline.setCycleCount(Animation.INDEFINITE);
              timeline.play();
              
            if(g27==1){  
            root.getChildren().add(cir27);
            g27=0;
            } 
         
        }
        if(var==2 && SunMoney >= 175){
          img27num = 1;
          t27=1;
            SunMoney=SunMoney-175;
          String plant="pln2.png";
          Image image=new Image(this.getClass().getResource(plant).toString());
          String ground="ground27.jpg";
          Image grass=new Image(this.getClass().getResource(ground).toString());
            
            Timeline timeline11 = new Timeline(new KeyFrame(Duration.millis(10),
            (evt11) -> {     
                if(t27==1){
                    img27.setImage(image);
                }
                if(t27==2){
                    img27.setImage(grass);
                }
                if(score!=s){    
                scorelbl.setText("" +score);
                scorelbl.setFont(new Font(38.0));
                s=score;
                }
            }));
            timeline11.setCycleCount(Animation.INDEFINITE);
            timeline11.play();
               
            cir27.setFill(Color.AQUA);
            cir27.setRadius(10);
            cir27.setLayoutX(720);
            cir27.setLayoutY(260); 
        
            tt27.setDuration(Duration.seconds(1.5));
            tt27.setToX(180);
            tt27.setCycleCount(Animation.INDEFINITE);
            tt27.setNode(cir27);
         
            Timeline timeline1 = new Timeline(new KeyFrame(Duration.seconds(1),
            (evt1) -> {              
              tt27.play();          
            }));
              timeline1.setCycleCount(Animation.INDEFINITE);
              timeline1.play();
              
            Timeline timeline = new Timeline(new KeyFrame(Duration.millis(0.1),
            (evt) -> {                     
                 cir27Bounds=cir27.getBoundsInParent();               
            })); 
              timeline.setCycleCount(Animation.INDEFINITE);
              timeline.play();
              
            if(g27==1){  
            root.getChildren().add(cir27);
            g27=0;
            } 
             
        }
        if(var==3){
            
        }  
    }

    @FXML
    void img28(MouseEvent event) {
         if(var==1 && SunMoney >= 100){
          img28num = 1;
          SunMoney=SunMoney-100;
          t28=1;
          String plant="pln1.png";
          Image image=new Image(this.getClass().getResource(plant).toString());
          String ground="ground28.jpg";
          Image grass=new Image(this.getClass().getResource(ground).toString());
            
            Timeline timeline11 = new Timeline(new KeyFrame(Duration.millis(10),
            (evt11) -> {     
                if(t28==1){
                    img28.setImage(image);
                }
                if(t28==2){
                    img28.setImage(grass);
                }
                if(score!=s){    
                scorelbl.setText("" +score);
                scorelbl.setFont(new Font(38.0));
                s=score;
                }
            }));
            timeline11.setCycleCount(Animation.INDEFINITE);
            timeline11.play();
               
            cir28.setFill(Color.GREENYELLOW);
            cir28.setRadius(10);
            cir28.setLayoutX(790);
            cir28.setLayoutY(260); 
        
            tt28.setDuration(Duration.seconds(1.5));
            tt28.setToX(110);
            tt28.setCycleCount(Animation.INDEFINITE);
            tt28.setNode(cir28);
          
            Timeline timeline1 = new Timeline(new KeyFrame(Duration.seconds(1),
            (evt1) -> {              
              tt28.play();          
            }));
              timeline1.setCycleCount(Animation.INDEFINITE);
              timeline1.play();
              
            Timeline timeline = new Timeline(new KeyFrame(Duration.millis(0.1),
            (evt) -> {                     
                 cir28Bounds=cir28.getBoundsInParent();               
            })); 
              timeline.setCycleCount(Animation.INDEFINITE);
              timeline.play();
              
            if(g28==1){  
            root.getChildren().add(cir28);
            g28=0;
            } 
         
        }
        if(var==2 && SunMoney >= 175){
          img28num = 1;
            SunMoney=SunMoney-175;
          t28=1;
          String plant="pln2.png";
          Image image=new Image(this.getClass().getResource(plant).toString());
          String ground="ground28.jpg";
          Image grass=new Image(this.getClass().getResource(ground).toString());
            
            Timeline timeline11 = new Timeline(new KeyFrame(Duration.millis(10),
            (evt11) -> {     
                if(t28==1){
                    img28.setImage(image);
                }
                if(t28==2){
                    img28.setImage(grass);
                }
                if(score!=s){    
                scorelbl.setText("" +score);
                scorelbl.setFont(new Font(38.0));
                s=score;
                }
            }));
            timeline11.setCycleCount(Animation.INDEFINITE);
            timeline11.play();
               
            cir28.setFill(Color.AQUA);
            cir28.setRadius(10);
            cir28.setLayoutX(790);
            cir28.setLayoutY(260); 
        
            tt28.setDuration(Duration.seconds(1.5));
            tt28.setToX(110);
            tt28.setCycleCount(Animation.INDEFINITE);
            tt28.setNode(cir28);
         
            Timeline timeline1 = new Timeline(new KeyFrame(Duration.seconds(1),
            (evt1) -> {              
              tt28.play();          
            }));
              timeline1.setCycleCount(Animation.INDEFINITE);
              timeline1.play();
              
            Timeline timeline = new Timeline(new KeyFrame(Duration.millis(0.1),
            (evt) -> {                     
                 cir28Bounds=cir28.getBoundsInParent();               
            })); 
              timeline.setCycleCount(Animation.INDEFINITE);
              timeline.play();
              
            if(g28==1){  
            root.getChildren().add(cir28);
            g28=0;
            } 
             
        }
        if(var==3){
            
        }  
    }

    @FXML
    void img29(MouseEvent event) {
          if(var==1 && SunMoney >= 100){
          img29num = 1;
          t29=1;
          SunMoney=SunMoney-100;
          String plant="pln1.png";
          Image image=new Image(this.getClass().getResource(plant).toString());
          String ground="ground29.jpg";
          Image grass=new Image(this.getClass().getResource(ground).toString());
            
            Timeline timeline11 = new Timeline(new KeyFrame(Duration.millis(10),
            (evt11) -> {     
                if(t29==1){
                    img29.setImage(image);
                }
                if(t29==2){
                    img29.setImage(grass);
                }
                if(score!=s){    
                scorelbl.setText("" +score);
                scorelbl.setFont(new Font(38.0));
                s=score;
                }
            }));
            timeline11.setCycleCount(Animation.INDEFINITE);
            timeline11.play();
               
            cir29.setFill(Color.GREENYELLOW);
            cir29.setRadius(10);
            cir29.setLayoutX(860);
            cir29.setLayoutY(260); 
        
            tt29.setDuration(Duration.seconds(1.5));
            tt29.setToX(110);
            tt29.setCycleCount(Animation.INDEFINITE);
            tt29.setNode(cir29);
          
            Timeline timeline1 = new Timeline(new KeyFrame(Duration.seconds(1),
            (evt1) -> {              
              tt29.play();          
            }));
              timeline1.setCycleCount(Animation.INDEFINITE);
              timeline1.play();
              
            Timeline timeline = new Timeline(new KeyFrame(Duration.millis(0.1),
            (evt) -> {                     
                 cir29Bounds=cir29.getBoundsInParent();               
            })); 
              timeline.setCycleCount(Animation.INDEFINITE);
              timeline.play();
              
            if(g29==1){  
            root.getChildren().add(cir29);
            g29=0;
            } 
         
        }
        if(var==2 && SunMoney >= 175){
          img29num = 1;
          t29=1;
            SunMoney=SunMoney-175;
          String plant="pln2.png";
          Image image=new Image(this.getClass().getResource(plant).toString());
          String ground="ground29.jpg";
          Image grass=new Image(this.getClass().getResource(ground).toString());
            
            Timeline timeline11 = new Timeline(new KeyFrame(Duration.millis(10),
            (evt11) -> {     
                if(t29==1){
                    img29.setImage(image);
                }
                if(t29==2){
                    img29.setImage(grass);
                }
                if(score!=s){    
                scorelbl.setText("" +score);
                scorelbl.setFont(new Font(38.0));
                s=score;
                }
            }));
            timeline11.setCycleCount(Animation.INDEFINITE);
            timeline11.play();
               
            cir29.setFill(Color.AQUA);
            cir29.setRadius(10);
            cir29.setLayoutX(860);
            cir29.setLayoutY(260); 
        
            tt29.setDuration(Duration.seconds(1.5));
            tt29.setToX(110);
            tt29.setCycleCount(Animation.INDEFINITE);
            tt29.setNode(cir29);
         
            Timeline timeline1 = new Timeline(new KeyFrame(Duration.seconds(1),
            (evt1) -> {              
              tt29.play();          
            }));
              timeline1.setCycleCount(Animation.INDEFINITE);
              timeline1.play();
              
            Timeline timeline = new Timeline(new KeyFrame(Duration.millis(0.1),
            (evt) -> {                     
                 cir29Bounds=cir29.getBoundsInParent();               
            })); 
              timeline.setCycleCount(Animation.INDEFINITE);
              timeline.play();
              
            if(g29==1){  
            root.getChildren().add(cir29);
            g29=0;
            } 
             
        }
        if(var==3){
            
        } 
    }

    @FXML
    void img31(MouseEvent event) {
        if(var == 1 && SunMoney >= 100){
          img31num = 1;
          SunMoney=SunMoney-100;
          t31=1;
          String plant="pln1.png";
          Image image=new Image(this.getClass().getResource(plant).toString());
          String ground="ground31.jpg";
          Image grass=new Image(this.getClass().getResource(ground).toString());
            
            Timeline timeline11 = new Timeline(new KeyFrame(Duration.millis(10),
            (evt11) -> {     
                if(t31==1){
                     img31.setImage(image);
                }
                if(t31==2){
                    img31.setImage(grass);
                }
                if(score!=s){    
                scorelbl.setText("" +score);
                scorelbl.setFont(new Font(38.0));
                s=score;
                }
            }));
            timeline11.setCycleCount(Animation.INDEFINITE);
            timeline11.play();
            cir31.setFill(Color.GREENYELLOW);
            cir31.setRadius(10);
            cir31.setLayoutX(300);
            cir31.setLayoutY(355); 
        
            tt31.setDuration(Duration.seconds(1.5));
            tt31.setToX(600);
            tt31.setCycleCount(Animation.INDEFINITE);
            tt31.setNode(cir31);
          
            Timeline timeline1 = new Timeline(new KeyFrame(Duration.seconds(1),
            (evt1) -> {              
              tt31.play();          
            }));
              timeline1.setCycleCount(Animation.INDEFINITE);
              timeline1.play();
              
            Timeline timeline = new Timeline(new KeyFrame(Duration.millis(0.1),
            (evt) -> {                     
                 cir31Bounds=cir31.getBoundsInParent();               
            })); 
              timeline.setCycleCount(Animation.INDEFINITE);
              timeline.play();
              
            if(g31==1){  
            root.getChildren().add(cir31);
            g31=0;
            } 
       
    }
    
    if(var == 2 && SunMoney >= 175){
          img31num = 1;
          t31=1;
            SunMoney=SunMoney-175;
          String plant="pln2.png";
          Image image=new Image(this.getClass().getResource(plant).toString());
          String ground="ground31.jpg";
          Image grass=new Image(this.getClass().getResource(ground).toString());
            
            Timeline timeline11 = new Timeline(new KeyFrame(Duration.millis(10),
            (evt11) -> {     
                if(t31==1){
                     img31.setImage(image);
                }
                if(t31==2){
                    img31.setImage(grass);
                }
                if(score!=s){    
                scorelbl.setText("" +score);
                scorelbl.setFont(new Font(38.0));
                s=score;
                }
            }));
            timeline11.setCycleCount(Animation.INDEFINITE);
            timeline11.play();
               
            cir31.setFill(Color.AQUA);
            cir31.setRadius(10);
            cir31.setLayoutX(300);
            cir31.setLayoutY(355); 
        
            tt31.setDuration(Duration.seconds(1.5));
            tt31.setToX(600);
            tt31.setCycleCount(Animation.INDEFINITE);
            tt31.setNode(cir31);
          
            Timeline timeline1 = new Timeline(new KeyFrame(Duration.seconds(1),
            (evt1) -> {              
              tt31.play();          
            }));
              timeline1.setCycleCount(Animation.INDEFINITE);
              timeline1.play();
              
            Timeline timeline = new Timeline(new KeyFrame(Duration.millis(0.1),
            (evt) -> {                     
                 cir31Bounds=cir31.getBoundsInParent();               
            })); 
              timeline.setCycleCount(Animation.INDEFINITE);
              timeline.play();
              
            if(g31==1){  
            root.getChildren().add(cir31);
            g31=0;
            } 
       
    }
    
    if(var == 3){
             System.out.print("oooo");
    }
        
    }

    @FXML
    void img32(MouseEvent event) {
         if(var==1 && SunMoney >= 100){
          img32num = 1;
          t32=1;
          SunMoney=SunMoney-100;
          String plant="pln1.png";
          Image image=new Image(this.getClass().getResource(plant).toString());
          String ground="ground32.jpg";
          Image grass=new Image(this.getClass().getResource(ground).toString());
            
            Timeline timeline11 = new Timeline(new KeyFrame(Duration.millis(10),
            (evt11) -> {     
                if(t32==1){
                    img32.setImage(image);
                }
                if(t32==2){
                    img32.setImage(grass);
                }
                if(score!=s){    
                scorelbl.setText("" +score);
                scorelbl.setFont(new Font(38.0));
                s=score;
                }
            }));
            timeline11.setCycleCount(Animation.INDEFINITE);
            timeline11.play();
               
            cir32.setFill(Color.GREENYELLOW);
            cir32.setRadius(10);
            cir32.setLayoutX(370);
            cir32.setLayoutY(355); 
        
            tt32.setDuration(Duration.seconds(1.5));
            tt32.setToX(530);
            tt32.setCycleCount(Animation.INDEFINITE);
            tt32.setNode(cir32);
          
            Timeline timeline1 = new Timeline(new KeyFrame(Duration.seconds(1),
            (evt1) -> {              
              tt32.play();          
            }));
              timeline1.setCycleCount(Animation.INDEFINITE);
              timeline1.play();
              
            Timeline timeline = new Timeline(new KeyFrame(Duration.millis(0.1),
            (evt) -> {                     
                 cir32Bounds=cir32.getBoundsInParent();               
            })); 
              timeline.setCycleCount(Animation.INDEFINITE);
              timeline.play();
              
            if(g32==1){  
            root.getChildren().add(cir32);
            g32=0;
            } 
       
       }
       
       if(var==2 && SunMoney >= 175){
           img32num = 1;
             SunMoney=SunMoney-175;
          t32=1;
          String plant="pln2.png";
          Image image=new Image(this.getClass().getResource(plant).toString());
          String ground="ground32.jpg";
          Image grass=new Image(this.getClass().getResource(ground).toString());
            
            Timeline timeline11 = new Timeline(new KeyFrame(Duration.millis(10),
            (evt11) -> {     
                if(t32==1){
                    img32.setImage(image);
                }
                if(t32==2){
                    img32.setImage(grass);
                }
                if(score!=s){    
                scorelbl.setText("" +score);
                scorelbl.setFont(new Font(38.0));
                s=score;
                }
            }));
            timeline11.setCycleCount(Animation.INDEFINITE);
            timeline11.play();
               
            cir32.setFill(Color.AQUA);
            cir32.setRadius(10);
            cir32.setLayoutX(370);
            cir32.setLayoutY(355); 
        
            tt32.setDuration(Duration.seconds(1.5));
            tt32.setToX(530);
            tt32.setCycleCount(Animation.INDEFINITE);
            tt32.setNode(cir32);
          
            Timeline timeline1 = new Timeline(new KeyFrame(Duration.seconds(1),
            (evt1) -> {              
              tt32.play();          
            }));
              timeline1.setCycleCount(Animation.INDEFINITE);
              timeline1.play();
              
            Timeline timeline = new Timeline(new KeyFrame(Duration.millis(0.1),
            (evt) -> {                     
                 cir32Bounds=cir32.getBoundsInParent();               
            })); 
              timeline.setCycleCount(Animation.INDEFINITE);
              timeline.play();
              
            if(g32==1){  
            root.getChildren().add(cir32);
            g32=0;
            } 
       }
       
       if(var==3){
           
       } 
    }

    @FXML
    void img33(MouseEvent event) {
          if(var==1 && SunMoney >= 100){
              SunMoney=SunMoney-100;
          img33num = 1;
          t33=1;
          String plant="pln1.png";
          Image image=new Image(this.getClass().getResource(plant).toString());
          String ground="ground33.jpg";
          Image grass=new Image(this.getClass().getResource(ground).toString());
            
            Timeline timeline11 = new Timeline(new KeyFrame(Duration.millis(10),
            (evt11) -> {     
                if(t33==1){
                    img33.setImage(image);
                }
                if(t33==2){
                    img33.setImage(grass);
                }
                if(score!=s){    
                scorelbl.setText("" +score);
                scorelbl.setFont(new Font(38.0));
                s=score;
                }
            }));
            timeline11.setCycleCount(Animation.INDEFINITE);
            timeline11.play();
               
            cir33.setFill(Color.GREENYELLOW);
            cir33.setRadius(10);
            cir33.setLayoutX(440);
            cir33.setLayoutY(355); 
        
            tt33.setDuration(Duration.seconds(1.5));
            tt33.setToX(460);
            tt33.setCycleCount(Animation.INDEFINITE);
            tt33.setNode(cir33);
          
            Timeline timeline1 = new Timeline(new KeyFrame(Duration.seconds(1),
            (evt1) -> {              
              tt33.play();          
            }));
              timeline1.setCycleCount(Animation.INDEFINITE);
              timeline1.play();
              
            Timeline timeline = new Timeline(new KeyFrame(Duration.millis(0.1),
            (evt) -> {                     
                 cir33Bounds=cir33.getBoundsInParent();               
            })); 
              timeline.setCycleCount(Animation.INDEFINITE);
              timeline.play();
              
            if(g33==1){  
            root.getChildren().add(cir33);
            g33=0;
            } 
       
        }
        if(var==2 && SunMoney >= 175){
            img33num = 1;
          t33=1;
            SunMoney=SunMoney-175;
          String plant="pln2.png";
          Image image=new Image(this.getClass().getResource(plant).toString());
          String ground="ground33.jpg";
          Image grass=new Image(this.getClass().getResource(ground).toString());
            
            Timeline timeline11 = new Timeline(new KeyFrame(Duration.millis(10),
            (evt11) -> {     
                if(t33==1){
                    img33.setImage(image);
                }
                if(t33==2){
                    img33.setImage(grass);
                }
                if(score!=s){    
                scorelbl.setText("" +score);
                scorelbl.setFont(new Font(38.0));
                s=score;
                }
            }));
            timeline11.setCycleCount(Animation.INDEFINITE);
            timeline11.play();
               
            cir33.setFill(Color.AQUA);
            cir33.setRadius(10);
            cir33.setLayoutX(440);
            cir33.setLayoutY(355); 
        
            tt33.setDuration(Duration.seconds(1.5));
            tt33.setToX(460);
            tt33.setCycleCount(Animation.INDEFINITE);
            tt33.setNode(cir33);
          
            Timeline timeline1 = new Timeline(new KeyFrame(Duration.seconds(1),
            (evt1) -> {              
              tt33.play();          
            }));
              timeline1.setCycleCount(Animation.INDEFINITE);
              timeline1.play();
              
            Timeline timeline = new Timeline(new KeyFrame(Duration.millis(0.1),
            (evt) -> {                     
                 cir33Bounds=cir33.getBoundsInParent();               
            })); 
              timeline.setCycleCount(Animation.INDEFINITE);
              timeline.play();
              
            if(g33==1){  
            root.getChildren().add(cir33);
            g33=0;
            } 
        }
    }

    @FXML
    void img34(MouseEvent event) {
           if(var==1 && SunMoney >= 100){
          img34num = 1;
          SunMoney=SunMoney-100;
          t34=1;
          String plant="pln1.png";
          Image image=new Image(this.getClass().getResource(plant).toString());
          String ground="ground34.jpg";
          Image grass=new Image(this.getClass().getResource(ground).toString());
            
            Timeline timeline11 = new Timeline(new KeyFrame(Duration.millis(10),
            (evt11) -> {     
                if(t34==1){
                    img34.setImage(image);
                }
                if(t34==2){
                    img34.setImage(grass);
                }
                if(score!=s){    
                scorelbl.setText("" +score);
                scorelbl.setFont(new Font(38.0));
                s=score;
                }
            }));
            timeline11.setCycleCount(Animation.INDEFINITE);
            timeline11.play();
               
            cir34.setFill(Color.GREENYELLOW);
            cir34.setRadius(10);
            cir34.setLayoutX(510);
            cir34.setLayoutY(355); 
        
            tt34.setDuration(Duration.seconds(1.5));
            tt34.setToX(390);
            tt34.setCycleCount(Animation.INDEFINITE);
            tt34.setNode(cir34);
          
            Timeline timeline1 = new Timeline(new KeyFrame(Duration.seconds(1),
            (evt1) -> {              
              tt34.play();          
            }));
              timeline1.setCycleCount(Animation.INDEFINITE);
              timeline1.play();
              
            Timeline timeline = new Timeline(new KeyFrame(Duration.millis(0.1),
            (evt) -> {                     
                 cir34Bounds=cir34.getBoundsInParent();               
            })); 
              timeline.setCycleCount(Animation.INDEFINITE);
              timeline.play();
              
            if(g34==1){  
            root.getChildren().add(cir34);
            g34=0;
            } 
       
         }
         
         if(var==2 && SunMoney >= 175){
            img34num = 1;
          t34=1;
            SunMoney=SunMoney-175;
          String plant="pln2.png";
          Image image=new Image(this.getClass().getResource(plant).toString());
          String ground="ground34.jpg";
          Image grass=new Image(this.getClass().getResource(ground).toString());
            
            Timeline timeline11 = new Timeline(new KeyFrame(Duration.millis(10),
            (evt11) -> {     
                if(t34==1){
                    img34.setImage(image);
                }
                if(t34==2){
                    img34.setImage(grass);
                }
                if(score!=s){    
                scorelbl.setText("" +score);
                scorelbl.setFont(new Font(38.0));
                s=score;
                }
            }));
            timeline11.setCycleCount(Animation.INDEFINITE);
            timeline11.play();
               
            cir34.setFill(Color.AQUA);
            cir34.setRadius(10);
            cir34.setLayoutX(510);
            cir34.setLayoutY(355); 
        
            tt34.setDuration(Duration.seconds(1.5));
            tt34.setToX(390);
            tt34.setCycleCount(Animation.INDEFINITE);
            tt34.setNode(cir34);
          
            Timeline timeline1 = new Timeline(new KeyFrame(Duration.seconds(1),
            (evt1) -> {              
              tt34.play();          
            }));
              timeline1.setCycleCount(Animation.INDEFINITE);
              timeline1.play();
              
            Timeline timeline = new Timeline(new KeyFrame(Duration.millis(0.1),
            (evt) -> {                     
                 cir34Bounds=cir34.getBoundsInParent();               
            })); 
              timeline.setCycleCount(Animation.INDEFINITE);
              timeline.play();
              
            if(g34==1){  
            root.getChildren().add(cir34);
            g34=0;
            } 
         }
         
         if(var==3){
             
         }
    }

    @FXML
    void img35(MouseEvent event) {
          if(var==1 && SunMoney >= 100){
          img35num = 1;
          SunMoney=SunMoney-100;
          t35=1;
          String plant="pln1.png";
          Image image=new Image(this.getClass().getResource(plant).toString());
          String ground="ground35.jpg";
          Image grass=new Image(this.getClass().getResource(ground).toString());
            
            Timeline timeline11 = new Timeline(new KeyFrame(Duration.millis(10),
            (evt11) -> {     
                if(t35==1){
                    img35.setImage(image);
                }
                if(t35==2){
                    img35.setImage(grass);
                }
                if(score!=s){    
                scorelbl.setText("" +score);
                scorelbl.setFont(new Font(38.0));
                s=score;
                }
            }));
            timeline11.setCycleCount(Animation.INDEFINITE);
            timeline11.play();
               
            cir35.setFill(Color.GREENYELLOW);
            cir35.setRadius(10);
            cir35.setLayoutX(580);
            cir35.setLayoutY(355); 
        
            tt35.setDuration(Duration.seconds(1.5));
            tt35.setToX(320);
            tt35.setCycleCount(Animation.INDEFINITE);
            tt35.setNode(cir35);
          
            Timeline timeline1 = new Timeline(new KeyFrame(Duration.seconds(1),
            (evt1) -> {              
              tt35.play();          
            }));
              timeline1.setCycleCount(Animation.INDEFINITE);
              timeline1.play();
              
            Timeline timeline = new Timeline(new KeyFrame(Duration.millis(0.1),
            (evt) -> {                     
                 cir35Bounds=cir35.getBoundsInParent();               
            })); 
              timeline.setCycleCount(Animation.INDEFINITE);
              timeline.play();
              
            if(g35==1){  
            root.getChildren().add(cir35);
            g35=0;
            } 
        
       }
       
       if(var==2 && SunMoney >= 175){
          img35num = 1;
            SunMoney=SunMoney-175;
          t35=1;
          String plant="pln2.png";
          Image image=new Image(this.getClass().getResource(plant).toString());
          String ground="ground35.jpg";
          Image grass=new Image(this.getClass().getResource(ground).toString());
            
            Timeline timeline11 = new Timeline(new KeyFrame(Duration.millis(10),
            (evt11) -> {     
                if(t35==1){
                    img35.setImage(image);
                }
                if(t35==2){
                    img35.setImage(grass);
                }
                if(score!=s){    
                scorelbl.setText("" +score);
                scorelbl.setFont(new Font(38.0));
                s=score;
                }
            }));
            timeline11.setCycleCount(Animation.INDEFINITE);
            timeline11.play();
               
            cir35.setFill(Color.AQUA);
            cir35.setRadius(10);
            cir35.setLayoutX(580);
            cir35.setLayoutY(355); 
        
            tt35.setDuration(Duration.seconds(1.5));
            tt35.setToX(320);
            tt35.setCycleCount(Animation.INDEFINITE);
            tt35.setNode(cir35);
          
            Timeline timeline1 = new Timeline(new KeyFrame(Duration.seconds(1),
            (evt1) -> {              
              tt35.play();          
            }));
              timeline1.setCycleCount(Animation.INDEFINITE);
              timeline1.play();
              
            Timeline timeline = new Timeline(new KeyFrame(Duration.millis(0.1),
            (evt) -> {                     
                 cir35Bounds=cir35.getBoundsInParent();               
            })); 
              timeline.setCycleCount(Animation.INDEFINITE);
              timeline.play();
              
            if(g35==1){  
            root.getChildren().add(cir35);
            g35=0;
            } 
        
       }
       
       if(var==3){
           
       }
    }

    @FXML
    void img36(MouseEvent event) {
         if(var==1 && SunMoney >= 100){
          img36num = 1;
          SunMoney=SunMoney-100;
          t36=1;
          String plant="pln1.png";
          Image image=new Image(this.getClass().getResource(plant).toString());
          String ground="ground36.jpg";
          Image grass=new Image(this.getClass().getResource(ground).toString());
            
            Timeline timeline11 = new Timeline(new KeyFrame(Duration.millis(10),
            (evt11) -> {     
                if(t36==1){
                    img36.setImage(image);
                }
                if(t36==2){
                    img36.setImage(grass);
                }
                if(score!=s){    
                scorelbl.setText("" +score);
                scorelbl.setFont(new Font(38.0));
                s=score;
                }
            }));
            timeline11.setCycleCount(Animation.INDEFINITE);
            timeline11.play();
               
            cir36.setFill(Color.GREENYELLOW);
            cir36.setRadius(10);
            cir36.setLayoutX(650);
            cir36.setLayoutY(355); 
        
            tt36.setDuration(Duration.seconds(1.5));
            tt36.setToX(250);
            tt36.setCycleCount(Animation.INDEFINITE);
            tt36.setNode(cir36);
          
            Timeline timeline1 = new Timeline(new KeyFrame(Duration.seconds(1),
            (evt1) -> {              
              tt36.play();          
            }));
              timeline1.setCycleCount(Animation.INDEFINITE);
              timeline1.play();
              
            Timeline timeline = new Timeline(new KeyFrame(Duration.millis(0.1),
            (evt) -> {                     
                 cir36Bounds=cir36.getBoundsInParent();               
            })); 
              timeline.setCycleCount(Animation.INDEFINITE);
              timeline.play();
              
            if(g36==1){  
            root.getChildren().add(cir36);
            g36=0;
            } 
         
        }
        if(var==2 && SunMoney >= 175){
          img36num = 1;
            SunMoney=SunMoney-175;
          t36=1;
          String plant="pln2.png";
          Image image=new Image(this.getClass().getResource(plant).toString());
          String ground="ground36.jpg";
          Image grass=new Image(this.getClass().getResource(ground).toString());
            
            Timeline timeline11 = new Timeline(new KeyFrame(Duration.millis(10),
            (evt11) -> {     
                if(t36==1){
                    img36.setImage(image);
                }
                if(t36==2){
                    img36.setImage(grass);
                }
                if(score!=s){    
                scorelbl.setText("" +score);
                scorelbl.setFont(new Font(38.0));
                s=score;
                }
            }));
            timeline11.setCycleCount(Animation.INDEFINITE);
            timeline11.play();
               
            cir36.setFill(Color.AQUA);
            cir36.setRadius(10);
            cir36.setLayoutX(650);
            cir36.setLayoutY(355); 
        
            tt36.setDuration(Duration.seconds(1.5));
            tt36.setToX(250);
            tt36.setCycleCount(Animation.INDEFINITE);
            tt36.setNode(cir36);
          
            Timeline timeline1 = new Timeline(new KeyFrame(Duration.seconds(1),
            (evt1) -> {              
              tt36.play();          
            }));
              timeline1.setCycleCount(Animation.INDEFINITE);
              timeline1.play();
              
            Timeline timeline = new Timeline(new KeyFrame(Duration.millis(0.1),
            (evt) -> {                     
                 cir36Bounds=cir36.getBoundsInParent();               
            })); 
              timeline.setCycleCount(Animation.INDEFINITE);
              timeline.play();
              
            if(g36==1){  
            root.getChildren().add(cir36);
            g36=0;
            } 
             
        }
        if(var==3){
            
        }    
    }

    @FXML
    void img37(MouseEvent event) {
           if(var==1 && SunMoney >= 100){
          img37num = 1;
          t37=1;
          SunMoney=SunMoney-100;
          String plant="pln1.png";
          Image image=new Image(this.getClass().getResource(plant).toString());
          String ground="ground37.jpg";
          Image grass=new Image(this.getClass().getResource(ground).toString());
            
            Timeline timeline11 = new Timeline(new KeyFrame(Duration.millis(10),
            (evt11) -> {     
                if(t37==1){
                    img37.setImage(image);
                }
                if(t37==2){
                    img37.setImage(grass);
                }
                if(score!=s){    
                scorelbl.setText("" +score);
                scorelbl.setFont(new Font(38.0));
                s=score;
                }
            }));
            timeline11.setCycleCount(Animation.INDEFINITE);
            timeline11.play();
               
            cir37.setFill(Color.GREENYELLOW);
            cir37.setRadius(10);
            cir37.setLayoutX(720);
            cir37.setLayoutY(355); 
        
            tt37.setDuration(Duration.seconds(1.5));
            tt37.setToX(180);
            tt37.setCycleCount(Animation.INDEFINITE);
            tt37.setNode(cir37);
          
            Timeline timeline1 = new Timeline(new KeyFrame(Duration.seconds(1),
            (evt1) -> {              
              tt37.play();          
            }));
              timeline1.setCycleCount(Animation.INDEFINITE);
              timeline1.play();
              
            Timeline timeline = new Timeline(new KeyFrame(Duration.millis(0.1),
            (evt) -> {                     
                 cir37Bounds=cir37.getBoundsInParent();               
            })); 
              timeline.setCycleCount(Animation.INDEFINITE);
              timeline.play();
              
            if(g37==1){  
            root.getChildren().add(cir37);
            g37=0;
            } 
         
        }
        if(var==2 && SunMoney >= 175){
          img37num = 1;
            SunMoney=SunMoney-175;
          t37=1;
          String plant="pln2.png";
          Image image=new Image(this.getClass().getResource(plant).toString());
          String ground="ground37.jpg";
          Image grass=new Image(this.getClass().getResource(ground).toString());
            
            Timeline timeline11 = new Timeline(new KeyFrame(Duration.millis(10),
            (evt11) -> {     
                if(t37==1){
                    img37.setImage(image);
                }
                if(t37==2){
                    img37.setImage(grass);
                }
                if(score!=s){    
                scorelbl.setText("" +score);
                scorelbl.setFont(new Font(38.0));
                s=score;
                }
            }));
            timeline11.setCycleCount(Animation.INDEFINITE);
            timeline11.play();
               
            cir37.setFill(Color.AQUA);
            cir37.setRadius(10);
            cir37.setLayoutX(720);
            cir37.setLayoutY(355); 
        
            tt37.setDuration(Duration.seconds(1.5));
            tt37.setToX(180);
            tt37.setCycleCount(Animation.INDEFINITE);
            tt37.setNode(cir37);
         
            Timeline timeline1 = new Timeline(new KeyFrame(Duration.seconds(1),
            (evt1) -> {              
              tt37.play();          
            }));
              timeline1.setCycleCount(Animation.INDEFINITE);
              timeline1.play();
              
            Timeline timeline = new Timeline(new KeyFrame(Duration.millis(0.1),
            (evt) -> {                     
                 cir37Bounds=cir37.getBoundsInParent();               
            })); 
              timeline.setCycleCount(Animation.INDEFINITE);
              timeline.play();
              
            if(g37==1){  
            root.getChildren().add(cir37);
            g37=0;
            } 
             
        }
        if(var==3){
            
        }  
    }

    @FXML
    void img38(MouseEvent event) {
          if(var==1 && SunMoney >= 100){
              SunMoney=SunMoney-100;
          img38num = 1;
          t38=1;
          String plant="pln1.png";
          Image image=new Image(this.getClass().getResource(plant).toString());
          String ground="ground38.jpg";
          Image grass=new Image(this.getClass().getResource(ground).toString());
            
            Timeline timeline11 = new Timeline(new KeyFrame(Duration.millis(10),
            (evt11) -> {     
                if(t38==1){
                    img38.setImage(image);
                }
                if(t38==2){
                    img38.setImage(grass);
                }
                if(score!=s){    
                scorelbl.setText("" +score);
                scorelbl.setFont(new Font(38.0));
                s=score;
                }
            }));
            timeline11.setCycleCount(Animation.INDEFINITE);
            timeline11.play();
               
            cir38.setFill(Color.GREENYELLOW);
            cir38.setRadius(10);
            cir38.setLayoutX(790);
            cir38.setLayoutY(355); 
        
            tt38.setDuration(Duration.seconds(1.5));
            tt38.setToX(110);
            tt38.setCycleCount(Animation.INDEFINITE);
            tt38.setNode(cir38);
          
            Timeline timeline1 = new Timeline(new KeyFrame(Duration.seconds(1),
            (evt1) -> {              
              tt38.play();          
            }));
              timeline1.setCycleCount(Animation.INDEFINITE);
              timeline1.play();
              
            Timeline timeline = new Timeline(new KeyFrame(Duration.millis(0.1),
            (evt) -> {                     
                 cir38Bounds=cir38.getBoundsInParent();               
            })); 
              timeline.setCycleCount(Animation.INDEFINITE);
              timeline.play();
              
            if(g38==1){  
            root.getChildren().add(cir38);
            g38=0;
            } 
         
        }
        if(var==2 && SunMoney >= 175){
          img38num = 1;
          t38=1;
            SunMoney=SunMoney-175;
          String plant="pln2.png";
          Image image=new Image(this.getClass().getResource(plant).toString());
          String ground="ground38.jpg";
          Image grass=new Image(this.getClass().getResource(ground).toString());
            
            Timeline timeline11 = new Timeline(new KeyFrame(Duration.millis(10),
            (evt11) -> {     
                if(t38==1){
                    img38.setImage(image);
                }
                if(t38==2){
                    img38.setImage(grass);
                }
                if(score!=s){    
                scorelbl.setText("" +score);
                scorelbl.setFont(new Font(38.0));
                s=score;
                }
            }));
            timeline11.setCycleCount(Animation.INDEFINITE);
            timeline11.play();
               
            cir38.setFill(Color.AQUA);
            cir38.setRadius(10);
            cir38.setLayoutX(790);
            cir38.setLayoutY(355); 
        
            tt38.setDuration(Duration.seconds(1.5));
            tt38.setToX(110);
            tt38.setCycleCount(Animation.INDEFINITE);
            tt38.setNode(cir38);
         
            Timeline timeline1 = new Timeline(new KeyFrame(Duration.seconds(1),
            (evt1) -> {              
              tt38.play();          
            }));
              timeline1.setCycleCount(Animation.INDEFINITE);
              timeline1.play();
              
            Timeline timeline = new Timeline(new KeyFrame(Duration.millis(0.1),
            (evt) -> {                     
                 cir38Bounds=cir38.getBoundsInParent();               
            })); 
              timeline.setCycleCount(Animation.INDEFINITE);
              timeline.play();
              
            if(g38==1){  
            root.getChildren().add(cir38);
            g38=0;
            } 
             
        }
        if(var==3){
            
        }  
    }

    @FXML
    void img39(MouseEvent event) {
          if(var==1 && SunMoney >= 100){
          img39num = 1;
          SunMoney=SunMoney-100;
          t39=1;
          String plant="pln1.png";
          Image image=new Image(this.getClass().getResource(plant).toString());
          String ground="ground39.jpg";
          Image grass=new Image(this.getClass().getResource(ground).toString());
            
            Timeline timeline11 = new Timeline(new KeyFrame(Duration.millis(10),
            (evt11) -> {     
                if(t39==1){
                    img39.setImage(image);
                }
                if(t39==2){
                    img39.setImage(grass);
                }
                if(score!=s){    
                scorelbl.setText("" +score);
                scorelbl.setFont(new Font(38.0));
                s=score;
                }
            }));
            timeline11.setCycleCount(Animation.INDEFINITE);
            timeline11.play();
               
            cir39.setFill(Color.GREENYELLOW);
            cir39.setRadius(10);
            cir39.setLayoutX(860);
            cir39.setLayoutY(355); 
        
            tt39.setDuration(Duration.seconds(1.5));
            tt39.setToX(110);
            tt39.setCycleCount(Animation.INDEFINITE);
            tt39.setNode(cir39);
          
            Timeline timeline1 = new Timeline(new KeyFrame(Duration.seconds(1),
            (evt1) -> {              
              tt39.play();          
            }));
              timeline1.setCycleCount(Animation.INDEFINITE);
              timeline1.play();
              
            Timeline timeline = new Timeline(new KeyFrame(Duration.millis(0.1),
            (evt) -> {                     
                 cir39Bounds=cir39.getBoundsInParent();               
            })); 
              timeline.setCycleCount(Animation.INDEFINITE);
              timeline.play();
              
            if(g39==1){  
            root.getChildren().add(cir39);
            g39=0;
            } 
         
        }
        if(var==2 && SunMoney >= 175){
          img39num = 1;
            SunMoney=SunMoney-175;
          t39=1;
          String plant="pln2.png";
          Image image=new Image(this.getClass().getResource(plant).toString());
          String ground="ground39.jpg";
          Image grass=new Image(this.getClass().getResource(ground).toString());
            
            Timeline timeline11 = new Timeline(new KeyFrame(Duration.millis(10),
            (evt11) -> {     
                if(t39==1){
                    img39.setImage(image);
                }
                if(t39==2){
                    img39.setImage(grass);
                }
                if(score!=s){    
                scorelbl.setText("" +score);
                scorelbl.setFont(new Font(38.0));
                s=score;
                }
            }));
            timeline11.setCycleCount(Animation.INDEFINITE);
            timeline11.play();
               
            cir39.setFill(Color.AQUA);
            cir39.setRadius(10);
            cir39.setLayoutX(860);
            cir39.setLayoutY(355); 
        
            tt39.setDuration(Duration.seconds(1.5));
            tt39.setToX(110);
            tt39.setCycleCount(Animation.INDEFINITE);
            tt39.setNode(cir39);
         
            Timeline timeline1 = new Timeline(new KeyFrame(Duration.seconds(1),
            (evt1) -> {              
              tt39.play();          
            }));
              timeline1.setCycleCount(Animation.INDEFINITE);
              timeline1.play();
              
            Timeline timeline = new Timeline(new KeyFrame(Duration.millis(0.1),
            (evt) -> {                     
                 cir39Bounds=cir39.getBoundsInParent();               
            })); 
              timeline.setCycleCount(Animation.INDEFINITE);
              timeline.play();
              
            if(g39==1){  
            root.getChildren().add(cir39);
            g39=0;
            } 
             
        }
        if(var==3){
            
        }  
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
          Timeline timeline1 = new Timeline(new KeyFrame(Duration.seconds(1),
            (evt1) -> {              
             sunlbl.setText(""+SunMoney);
            }));
              timeline1.setCycleCount(Animation.INDEFINITE);
              timeline1.play();
    }    
    
}
