package com.example.bookhub;

import javafx.geometry.Insets;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;

public class BookInfo extends Dialog {

    public BookInfo(String title, String author, String year, String rate, String genre, String description, String path ) {
        super();

        setTitle("Book info");

        Label label1 = new Label("Title: " + title);

        Label label2 = new Label("Author: " + author);

        Label label3 = new Label("Year: " + year);

        Label label4 = new Label("Rate: " + rate);

        Label label5 = new Label("Genre: " + genre);

        Label label6 = new Label("Description: " + description);

        GridPane grid = new GridPane();
        grid.add(label1, 1, 1);

        grid.add(label2, 1, 2);

        grid.add(label3, 1, 3);

        grid.add(label4, 1, 4);

        grid.add(label5, 1, 5);

        grid.add(label6, 1, 6);

        Button btn = new Button("Add");

        getDialogPane().setContent(grid);

        ButtonType buttonTypeOk = new ButtonType("close", ButtonBar.ButtonData.OK_DONE);
        getDialogPane().getButtonTypes().add(buttonTypeOk);

    }
}
