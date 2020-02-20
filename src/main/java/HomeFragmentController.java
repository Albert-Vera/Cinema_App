import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import model.Pelis;

import java.util.ArrayList;
import java.util.List;

import static javafx.application.Application.launch;

public class HomeFragmentController extends Application {

    @FXML private ImageView image1;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

    }

    void setHome(){
        System.out.println("me paseo por el home");




    }
}
