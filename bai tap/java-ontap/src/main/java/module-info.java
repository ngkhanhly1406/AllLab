module com.example.javaontap {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javaontap to javafx.fxml;
    exports com.example.javaontap;
}