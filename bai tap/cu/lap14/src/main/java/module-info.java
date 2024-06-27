module com.example.lap14 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.example.lap14 to javafx.fxml;
    exports com.example.lap14;
}