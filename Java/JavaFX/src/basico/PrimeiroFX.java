package basico;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class PrimeiroFX extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        Button btn = new Button("A");
        Button btn2 = new Button("B");
        Button btn3 = new Button("C");
        Button btn4 = new Button("SAIR");

        btn.setOnAction(e -> System.out.println("A"));
        btn2.setOnAction(e -> System.out.println("B"));
        btn3.setOnAction(e -> System.out.println("C"));
        btn4.setOnAction(e -> {
            System.out.println("Sair");
            System.exit(0);
        });

        HBox box = new HBox();
        box.setAlignment(Pos.CENTER);
        box.setSpacing(10);
        box.getChildren().addAll(btn, btn2, btn3, btn4);

        Scene cena = new Scene(box, 200, 100);

        primaryStage.setScene(cena);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
