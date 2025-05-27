package basico.Contador;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Contador extends Application {

    private int contador = 0;

    @Override
    public void start(Stage primaryStage) throws Exception {

        Label titulo = new Label("Contador");
        Label numero = new Label("0");

        titulo.getStyleClass().add("texto");
        numero.getStyleClass().add("texto");

        Button BotaoDecremento = new Button("-");
        Button BotaoIncremento = new Button("+");

        BotaoIncremento.getStyleClass().add("botao");
        BotaoDecremento.getStyleClass().add("botao");

        BotaoDecremento.setOnAction(e -> {
            contador--;
            numero.setText(String.valueOf(contador));
            if (contador < 0) {
                numero.getStyleClass().add("valorNegativo");
            }
        });

        BotaoIncremento.setOnAction(e -> {
            contador++;
            numero.setText(String.valueOf(contador));
            if (contador >= 0) {
                numero.getStyleClass().remove("valorNegativo");
            }
        });

        VBox boxConteudo = new VBox();
        HBox boxSec = new HBox();

        boxConteudo.setAlignment(Pos.CENTER);
        boxConteudo.getStyleClass().add("conteudo");
        boxSec.setAlignment(Pos.CENTER);
        boxSec.setSpacing(15);
        boxConteudo.setSpacing(10);

        boxSec.getChildren().addAll(BotaoDecremento, numero, BotaoIncremento);
        boxConteudo.getChildren().addAll(titulo, boxSec);

        String cssCaminho = getClass().getResource("/basico/Contador/contador.css").toExternalForm();
        Scene cenaPrincipal = new Scene(boxConteudo, 200, 175);
        cenaPrincipal.getStylesheets().add(cssCaminho);
        cenaPrincipal.getStylesheets().add("https://fonts.googleapis.com/css2?family=Oswald");

        primaryStage.setScene(cenaPrincipal);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
