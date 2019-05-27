package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.FileInputStream;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.getIcons().add(new Image("resource/Logo.jpg"));
        primaryStage.setMaximized(true);

        primaryStage.setTitle("Magit APK");
        primaryStage.setScene(new Scene(root, 1030, 576));
        primaryStage.show();

    }


    public static void main(String[] args) {
        launch(args);
    }
}
