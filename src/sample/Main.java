package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

import java.io.IOException;

public class Main extends Application {

    private Stage  primaryStage;

    @Override
    public void start(Stage primaryStage) throws Exception{
//        Text text = new Text("Hello JavaFX");
//        //Parent root = FXMLLoader.load(getClass().getResource("MainWindowView.fxml"));
//        VBox root = new VBox();
//        root.getChildren().add(text);
//        // Set the Size of the VBox
//        root.setMinSize(350, 250);
//        primaryStage.setTitle("Hello World");
//        primaryStage.setScene(new Scene(root, 300, 275));
//        primaryStage.show();
        this.primaryStage = primaryStage;
        mainWindow();

        //primaryStage.show();

    }

    public void mainWindow(){

        try {
            FXMLLoader loader = new FXMLLoader(Main.class.getResource("MainWindowView.fxml"));
            AnchorPane pane = loader.load();

            MainWindowController mainWindowController = loader.getController();
            mainWindowController.setMain(this);
            Scene scene = new Scene(pane);

            primaryStage.setScene(scene);
            primaryStage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        launch(args);
    }
}
