module avor.homebookkeepingdesktopdemo {
    requires javafx.controls;
    requires javafx.fxml;
        requires javafx.web;
            
        requires org.controlsfx.controls;
            requires com.dlsc.formsfx;
            requires net.synedra.validatorfx;
            requires org.kordamp.ikonli.javafx;
            requires org.kordamp.bootstrapfx.core;
    requires java.sql;

    opens avor.homebookkeepingdesktopdemo to javafx.fxml;
    exports avor.homebookkeepingdesktopdemo;
    exports avor.homebookkeepingdesktopdemo.viewsControllers;
    opens avor.homebookkeepingdesktopdemo.viewsControllers to javafx.fxml;
}