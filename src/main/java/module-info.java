module com.example.mvvmvideo {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.google.gson;

    opens com.example.mvvmvideo to javafx.fxml;
    exports com.example.mvvmvideo;
}