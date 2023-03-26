module com.example.lap12 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.example.lap12 to javafx.fxml;
    exports com.example.lap12;
}