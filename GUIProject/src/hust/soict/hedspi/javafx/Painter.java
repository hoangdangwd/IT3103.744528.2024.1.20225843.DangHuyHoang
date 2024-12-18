package hust.soict.hedspi.javafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Painter extends Application {
    @Override
    public void start(Stage stage) {
        try {
            // Load the FXML file
            Parent root = FXMLLoader.load(getClass().getResource("/hust/soict/hedspi/javafx/Painter.fxml"));
            
            // Create and set up the scene
            Scene scene = new Scene(root);
            stage.setTitle("Painter Application");
            stage.setScene(scene);
            
            // Optional: Set window properties
            stage.setResizable(false);  // Disable resizing
            stage.show();
        } catch (Exception e) {
            // Handle exceptions during loading
            System.err.println("Error loading FXML file: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}

