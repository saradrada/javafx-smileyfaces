package ui;

import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.Circle;

public class Controller {

	@FXML
	private AnchorPane pane;
	private int radius;

	@FXML
	void MouseClicked(MouseEvent event) {

		radius = 35;
		double x = event.getSceneX();
		double y = event.getSceneY();

		Circle face = new Circle(x, y, radius, Color.YELLOW);
		pane.getChildren().add(face);

		Circle leftEye = new Circle(x - 10, y - 10, radius / 9, Color.BLACK);
		pane.getChildren().add(leftEye);

		Circle rigthEye = new Circle(x + 10, y - 10, radius / 9, Color.BLACK);
		pane.getChildren().add(rigthEye);

		Arc smile = new Arc(x, y+2, 20, 20, 180, 180);
		pane.getChildren().add(smile);
		
		Arc teeth = new Arc(x, y+5, 16, 14, 180, 180);
		teeth.setFill(Color.WHITE);
		pane.getChildren().add(teeth);
	}

}
