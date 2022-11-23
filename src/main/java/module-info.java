module com.example.gamedevelopment {
    requires javafx.controls;
    requires javafx.fxml;
    requires lwjgl;


    opens com.example.gamedevelopment to javafx.fxml;
    exports com.example.gamedevelopment;
}