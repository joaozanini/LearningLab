package layout;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;

public class Caixa extends HBox {

    private static int i = 0;

    private String[] cores = {
            "#c33c5e", "#39aac6", "#28d79a", "#fb750e", "#6657a8", "#f9060e"
    };

    public Caixa() {
        this(100, 100);
    }

    public Caixa(int width, int height) {
        setAlignment(Pos.CENTER);
        setMinSize(width, height);

        BackgroundFill fill = new BackgroundFill(Color.web(cores[i++]), CornerRadii.EMPTY, Insets.EMPTY);
        setBackground(new Background(fill));

        if(i == 6) {
            i=0;
        }
    }

    public Caixa comTexto(String texto) {
        Label label = new Label(texto);
        getChildren().add(label);
        return this;
    }
}
