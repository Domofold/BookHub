package com.example.bookhub;

import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class GUI {

    public static GridPane gP;
    public GUI(Stage stage) {

        AddBook btn = new AddBook("Add book");
        GridPane root = new GridPane();
        root.add(btn, 6, 6);

        ScrollPane scroll = new ScrollPane();
        scroll.setContent(root);




        gP = root;

        Scene scene = new Scene(scroll, 1422, 960);
        stage.setTitle("BookHub");
        stage.setScene(scene);
        stage.show();
    }

    public static GridPane getGrid() {
        return gP;
    }


}
