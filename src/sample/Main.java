package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    private static Stage stg;

    @Override
    public void start(Stage primaryStage) throws Exception{

        stg = primaryStage;

        Parent root = FXMLLoader.load(getClass().getResource("scenes/sample.fxml"));
        primaryStage.setTitle("Calculadora de Áreas");
        Image icon = new Image("sample/img/app-icon.png");
        primaryStage.getIcons().add(icon);
        primaryStage.setScene(new Scene(root, 600, 400));
        primaryStage.setResizable(false);
        primaryStage.show();
    }

    public void changeScene(String fxml) throws IOException{
        Parent pane = FXMLLoader.load(getClass().getResource(fxml));
        stg.getScene().setRoot(pane);
    }



    public static void main(String[] args) {
        launch(args);
    }
}
