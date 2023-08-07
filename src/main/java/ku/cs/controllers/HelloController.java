package ku.cs.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import ku.cs.services.FXRouter;
import java.io.IOException;

public class HelloController {
    @FXML protected Label welcomeTextLabel;
    @FXML protected ImageView sampleImageView;

    @FXML
    protected void initialize() {
        welcomeTextLabel.setText("Hello JavaFX!!");
        Image cat = new Image(getClass().getResource("/image/cat.jpg").toString());
        sampleImageView.setImage(cat);
    }

    @FXML
    protected void onHelloButtonClick() {
        try {
            FXRouter.goTo("student-list");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}