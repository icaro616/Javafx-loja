module com.example.jesusbom {
    requires javafx.controls;
    requires javafx.fxml;
            
        requires org.controlsfx.controls;
            requires com.dlsc.formsfx;
    requires java.sql;

    opens com.example.jesusbom to javafx.fxml;
    exports com.example.jesusbom;
}