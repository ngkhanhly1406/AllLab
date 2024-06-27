module com.example.lap15 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.lap15 to javafx.fxml;
    exports com.example.lap15;
}