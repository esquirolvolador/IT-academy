module com.example.n1exercici2 {
  requires javafx.controls;
  requires javafx.fxml;


  opens com.example.n1exercici2 to javafx.fxml;
  exports com.example.n1exercici2;
}