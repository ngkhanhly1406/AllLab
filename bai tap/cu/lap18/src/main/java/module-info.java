module com.example.lap18 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.lap18 to javafx.fxml;
    exports com.example.lap18;
}