module com.example.desafio01 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;
    requires java.logging;


    opens com.example.desafio01 to javafx.fxml;
    exports com.example.desafio01;
}