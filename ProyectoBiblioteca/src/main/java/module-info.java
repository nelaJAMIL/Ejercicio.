module com.example.proyectobiblioteca {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.proyectobiblioteca to javafx.fxml;
    exports com.example.proyectobiblioteca;
}