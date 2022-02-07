module online.icekylin.week1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens online.icekylin.week1 to javafx.fxml;
    exports online.icekylin.week1;
}