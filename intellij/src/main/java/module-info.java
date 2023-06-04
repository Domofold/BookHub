module com.example.bookhub {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.bookhub to javafx.fxml;
    exports com.example.bookhub;
}