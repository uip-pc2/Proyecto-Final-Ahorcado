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
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Menu {


        @FXML
        Button bt_continuar;
        @FXML
        Button bt_atras;
        @FXML
        RadioButton rb_paises;
        @FXML
        RadioButton rb_capitales;
        @FXML
        RadioButton rb_uno;
        @FXML
        RadioButton rb_dos;
        @FXML
        RadioButton rb_tres;
        @FXML
        RadioButton rb_cuatro;
        @FXML
        RadioButton rb_cinco;
        @FXML
        RadioButton rb_seis;
        @FXML
        ActionEvent palablas;
        @FXML
        ToggleGroup categorias;
        @FXML
        ToggleGroup palabras;

        public String [] word;
        public String [] cantidad;





        public void regresar(ActionEvent actionEvent) {
            Stage stage = (Stage) bt_atras.getScene().getWindow();
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Inicio.fxml"));
            Parent root = null;
            try {
                root = (Parent) fxmlLoader.load();
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

        public void continuar(ActionEvent actionEvent) {


            //if (){}

            //System.out.println("Hola");


          /*  ToggleGroup.getSelected categoria;
            Ahorcado.Menu selected = getSelected();
            this.rb_paises getSelected().rb_paises();
            this.getTxtSurnames().setText(selected.getSurnames());
            this.getTxtDni().setText(selected.getDni());
            this.getDpBirthDate().setValue(LocalDate.parse(selected.getBirthDate()));
            this.getTxtAddress().setText(selected.getAddress());
            this.getTxtEmail().setText(selected.getEmail());
            this.getCbxState().setSelected((selected.isActive().equalsIgnoreCase("si")));*/


            /*try {

               /* if ( new ToggleGroup rb_paises).ToggleGroup (rb_capitales(););){
                    Alert alerta = new Alert(Alert.AlertType.ERROR);
                    alerta.setTitle("Error de Aplicacion");
                    alerta.setHeaderText("Fecha incorrecta: antes de hoy");
                    alerta.setContentText("Intenta nuevamente.");
                    alerta.showAndWait();
                    return;
                }
                if (sal.isBefore(ing)) {
                    Alert alerta = new Alert(Alert.AlertType.ERROR);
                    alerta.setTitle("Error de Aplicacion");
                    alerta.setHeaderText("Fecha incorrecta: antes de ingreso");
                    alerta.setContentText("Intenta nuevamente.");
                    alerta.showAndWait();
                    return;
                }
            } catch (NullPointerException e) {
                Alert alerta = new Alert(Alert.AlertType.ERROR);
                alerta.setTitle("Error de Aplicacion");
                alerta.setHeaderText("Fecha incorrecta: valores nulos");
                alerta.setContentText("Intenta nuevamente.");
                alerta.showAndWait();
                return;
            }*/

            Stage stage;
            stage = (Stage) bt_continuar.getScene().getWindow();
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("juego.fxml"));
            Parent root = null;

            try {
                root = (Parent) fxmlLoader.load();
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


        public Menu() {
            //this.cantidad = word;
           // String [] word;
    /*      S

            public String generaPalabra ( int categoria){
                boolean n = false;
                int n1 = (int) (Math.random() * 4.0D);
                return (categoria == 0) this.paises[n1] : this.capitales[n1];
            }

        public boolean checaLetra(char letra, String palabra) {
            boolean mensaje = false;

            for (int i = 0; i < palabra.length(); ++i) {
                if (letra == palabra.charAt(i)) {
                    mensaje = true;
                    break;
                }

                mensaje = false;
            }

            return mensaje;
        }

        public Set letrasEnPalabra(String palabra) {
            HashSet letras = new HashSet();

            for (int i = 0; i < palabra.length(); ++i) {
                if (palabra.charAt(i) != 32) {
                    letras.add(Character.valueOf(palabra.charAt(i)));
                }
            }

            return letras;
        }
            /*
            public boolean checaGanaste(Set conjunto, Set correctas) {
                return conjunto.size() == correctas.size();
            }

            public boolean checaPerdiste(Set incorrectas, int intentos) {
                return incorrectas.size() == intentos;
            }

            public String actualizaVisible(Set correctas, String palabra, String visible) {
                visible = "";
                boolean bandera = false;
                Iterator it = correctas.iterator();

                for(int i = 0; i < palabra.length(); ++i) {
                    while(it.hasNext()) {
                        char a = it.next().toString().charAt(0);
                        System.out.println(" " + a + "  " + palabra.trim().charAt(i));
                        if(a == palabra.trim().charAt(i)) {
                            visible = visible + a;
                            bandera = true;
                            break;
                        }
                    }

                    if(!bandera) {
                        visible = visible + "_";
                    }

                    bandera = false;
                    it = correctas.iterator();
                }

                return visible;
            }

        }*/
            // hasta aqui llega

        }


        public void paises(ActionEvent actionEvent) {

                Stage stage;
                stage = (Stage) rb_paises.getScene().getWindow();


                String[] paises = new String[]{"PANAMA", "FRANCIA", "AUSTRALIA", "PARAGUAY", "JAPON", "SUECIA"};
                //System.out.printf("%s%n", (paises[5]));


                this.word = paises;



                try {
                } catch (Exception e) {
                    Alert alerta = new Alert(Alert.AlertType.ERROR);
                    alerta.setTitle("Error de Aplicacion");
                    alerta.setHeaderText("Mira, hubo un error...");
                    alerta.setContentText("Lo siento. Llama al administrador.");
                    alerta.showAndWait();
                    Platform.exit();
                }
            }


        public void capitales(ActionEvent actionEvent) {
            Stage stage;
            stage = (Stage) rb_paises.getScene().getWindow();


            String[] capitales = new String[]{"PARIS", "CARACAS", "MADRID", "BOGOTA", "SAN JOSE", "LIMA"};

            //PrintStream printf = System.out.printf("%s%n", (capitales[5]));
            this.word = capitales;

           // System.out.printf("%s%n", (word[2]));
            try {

            } catch (Exception e) {
                Alert alerta = new Alert(Alert.AlertType.ERROR);
                alerta.setTitle("Error de Aplicacion");
                alerta.setHeaderText("Mira, hubo un error...");
                alerta.setContentText("Lo siento. Llama al administrador.");
                alerta.showAndWait();
                Platform.exit();
            }

        }



        public boolean uno(ActionEvent actionEvent) {

           this.cantidad = word ;

            int i;
            for (i=0;i<1;i++){
                this.cantidad [i] = word [i];
                this.cantidad = word;
               // System.out.printf("%s%n", (word[i]));
                System.out.printf("%s%n","----" + (cantidad[i]));

               // System.out.printf("%s%n", (cantidad[3]));

            }

            //System.out.printf("%s%test****", (cantidad[3]));
            return word [i] == cantidad [i];
           // System.out.printf("%s%n","****" +(cantidad[4]));
           //System.out.printf("%s%n", "****" +(cantidad[5]));

        }


        public void dos(ActionEvent actionEvent) {

            // int i;
            int i;
            for (i = 0; i < 2; i++) {
                this.cantidad [1] = word [1];
                // System.out.printf("%s%n", (word[i]));
                System.out.printf("%s%n", (cantidad[i]));
                //this.cantidad  = word ;
                // System.out.printf("%s%n", (cantidad));
            }
        }

        public void tres(ActionEvent actionEvent) {
            this.cantidad = word;
            int i;
            for (i=0;i<3;i++){

               // System.out.printf("%s%n", (word[i]));
            }
            System.out.printf("%s%n", (cantidad));
        }

        public void cuatro(ActionEvent actionEvent) {
            this.cantidad = word;
            int i;
            for (i=0;i<4;i++){

              //  System.out.printf("%s%n", (word[i]));
            }
            System.out.printf("%s%n", (cantidad));
        }

        public void cinco(ActionEvent actionEvent) {
            this.cantidad = word;
            int i;
            for (i=0;i<5;i++){

              //  System.out.printf("%s%n", (word[i]));
            }
            System.out.printf("%s%n", (cantidad));
        }

        public void seis(ActionEvent actionEvent) {
          //  this.cantidad = word;
            int i;
            for (i=0;i<6;i++){

               // System.out.printf("%s%n", (word[i]));
            }
            System.out.printf("%s%n", (cantidad));
        }



    }










