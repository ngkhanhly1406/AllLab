module com.example.optapjava {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.example.optapjava to javafx.fxml;
    exports com.example.optapjava;
}