module com.example.listexample {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.example.listexample to javafx.fxml;
    exports com.example.listexample;
}