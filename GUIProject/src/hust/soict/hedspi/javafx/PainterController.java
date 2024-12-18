package hust.soict.hedspi.javafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;

public class PainterController {
    @FXML
    private Pane drawingAreaPane;
    @FXML
    private RadioButton penRadioButton;
    @FXML
    private RadioButton eraserRadioButton;
    private ToggleGroup toolToggleGroup = new ToggleGroup();
    private boolean isEraseMode = false;
    @FXML
    public void initialize() {
        penRadioButton.setToggleGroup(toolToggleGroup);
        eraserRadioButton.setToggleGroup(toolToggleGroup);
    }
    @FXML
    void clearButtonPressed(ActionEvent event) {
        drawingAreaPane.getChildren().clear();
    }
    @FXML
    void drawingAreaMouseDragged(MouseEvent event) {
        if (isEraseMode) {
            Circle eraserCircle = new Circle(event.getX(), event.getY(), 10);
            eraserCircle.setFill(javafx.scene.paint.Color.WHITE);
            drawingAreaPane.getChildren().add(eraserCircle);
        } else {
            Circle newCircle = new Circle(event.getX(), event.getY(), 4);
            newCircle.setFill(javafx.scene.paint.Color.BLACK);
            drawingAreaPane.getChildren().add(newCircle);
        }
    }
    @FXML
    void penButtonPressed(ActionEvent event) {
        isEraseMode = false;
    }

    @FXML
    void eraserButtonPressed(ActionEvent event) {
        isEraseMode = true;
    }
}
