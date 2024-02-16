module com.example.design_sd2 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.design_sd2 to javafx.fxml;
    exports com.example.design_sd2;
}