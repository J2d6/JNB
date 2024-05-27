module dev.j2d6.demo {
    requires javafx.controls;
    requires javafx.fxml;


    opens dev.j2d6.demo to javafx.fxml;
    exports dev.j2d6.demo;
}