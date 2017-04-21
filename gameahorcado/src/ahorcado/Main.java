package ahorcado;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
       // Palabras palabras;
      //  palabras = new palabras String[];
        String[] word;
        //String[] palabras;


        Parent root = FXMLLoader.load(getClass().getResource("inicio.fxml"));
        primaryStage.setTitle("AHORCADO");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }


    public static void main(String[] args) {launch(args);

    }

}
