module online.icekylin.pizza {
    requires javafx.controls;
    requires javafx.fxml;


    opens online.icekylin.pizza to javafx.fxml;
    exports online.icekylin.pizza;
}