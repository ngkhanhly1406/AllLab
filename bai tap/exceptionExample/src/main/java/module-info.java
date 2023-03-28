module com.example.exceptionexample {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.example.exceptionexample to javafx.fxml;
    exports com.example.exceptionexample;
}