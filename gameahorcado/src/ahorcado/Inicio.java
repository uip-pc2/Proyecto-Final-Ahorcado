package ahorcado;

import javafx.animation.FadeTransition;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.util.Optional;


public class Inicio {
        @FXML
        Button bt_continuar;
        @FXML
        Button bt_salir;

        public void continuar(ActionEvent actionEvent) {
            Stage stage = (Stage) bt_continuar.getScene().getWindow();
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("menu.fxml"));
            Parent root = null;
            try {
                root = (Parent)fxmlLoader.load();
            } catch (Exception e) {
                Alert alerta = new Alert(Alert.AlertType.ERROR);
                alerta.setTitle("Error de Aplicacion");
                alerta.setHeaderText("Mira, hubo un error...");
                alerta.setContentText("Lo siento. Llama al administrador.");
                alerta.showAndWait();
                Platform.exit();
            }
            FadeTransition ft = new FadeTransition(Duration.millis(1500), root);
            ft.setFromValue(0.0);
            ft.setToValue(1.0);
            ft.play();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }


        public void salir(ActionEvent actionEvent) {
            Alert alerta = new Alert(Alert.AlertType.CONFIRMATION);
            alerta.setTitle("Confirmacion de Salida");
            alerta.setHeaderText("Usted esta saliendo de la aplicacion");
            alerta.setContentText("Esta seguro de esto?");
            Optional<ButtonType> resultado = alerta.showAndWait();
            if (resultado.get() == ButtonType.OK) {
                Platform.exit();
            }

        }
    }


