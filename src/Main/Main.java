package Main;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Main extends Application{
    
    public static void main(String[] args){
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
     AnchorPane root1 = FXMLLoader.load(this.getClass().getResource("../StartPage/StartPage.fxml"));
     Stage registpage = new Stage();
     registpage.setScene(new Scene(root1));
     registpage.show();
    }
    
}
