module modulink.modulink {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens modulink.modulink to javafx.fxml;
    exports modulink.modulink;
}