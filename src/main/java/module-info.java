module edu.asrasdmesa {
    requires javafx.controls;
    requires javafx.fxml;

    opens edu.asrasdmesa to javafx.fxml;
    exports edu.asrasdmesa;
}
