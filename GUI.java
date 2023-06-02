package com.example.bookhub;

import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.HashMap;

public class GUI {

    private int currRow = 0;
    private int currColumn = 1;

    public int getRow() {
        return currRow;
    }

    public int getColumn() {
        return currColumn;
    }

    public void setRow(int row) {
        currRow = (currRow + 1 % 5);
    }

    public void setColumn(int row) {
        currColumn = (currColumn % 5) + 1;
    }

    private static GridPane gP;
    public GUI(Stage stage) {

        AddBook btn = new AddBook("Add book");
        MyGrid root = new MyGrid(btn);

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
