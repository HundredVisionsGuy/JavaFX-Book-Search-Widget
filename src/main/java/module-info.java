module com.example {
    requires transitive javafx.graphics; // added based on tut
    requires javafx.controls;
    requires javafx.fxml;

    opens com.example to javafx.fxml;
    exports com.example;
}
