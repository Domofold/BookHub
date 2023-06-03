package com.example.bookhub;

import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.HashMap;

public class GUI {

    private static int currRow = 0;
    private static int currColumn = 1;
    private static GridPane gP;

    public static int getRow() {
        return currRow;
    }

    public static int getColumn() {
        return currColumn;
    }

    public static void setRow(int row) {
        currRow = (currRow + 1 % 5);
    }

    public static void setColumn(int row) {
        currColumn = (currColumn % 5) + 1;
    }

    public static GridPane getGrid() {
        return gP;
    }


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



}
