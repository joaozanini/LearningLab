module JavaFX {
    requires javafx.controls;
    requires javafx.fxml;

    opens basico;
    opens basico.Contador;
    opens layout;
}