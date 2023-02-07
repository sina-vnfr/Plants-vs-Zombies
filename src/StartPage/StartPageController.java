package StartPage;


import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;

public class StartPageController implements Initializable {

     @FXML
    private ImageView LevelPage;

    @FXML
    void click(MouseEvent event) throws IOException, URISyntaxException {
         
             Level();

    }
    /*@FXML
    void onClick(MouseEvent event) throws IOException {
    

    }*/
    @Override
    public void initialize(URL url, ResourceBundle rb) {
         
        
    }    

    public void Level() throws IOException {
             AnchorPane root2 = FXMLLoader.load(this.getClass().getResource("../LevelPage/LevelPage.fxml"));
             Stage registpage = new Stage();
             registpage.setScene(new Scene(root2));
             registpage.show();
    }
    
}
