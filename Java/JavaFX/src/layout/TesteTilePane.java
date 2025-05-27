package layout;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.layout.TilePane;

import java.util.ArrayList;
import java.util.List;

public class TesteTilePane extends TilePane {

    public TesteTilePane() {
        List<Quadrado> quadrados = new ArrayList<>();
        for (int i = 1; i < 9; i++) {
            quadrados.add(new Quadrado(i * 10));
        }
        setTileAlignment(Pos.BOTTOM_CENTER);
        setPadding(new Insets(10));

        setVgap(10);
        setHgap(10);

        getChildren().addAll(quadrados);
    }
}
