package com.example.bookhub;

import javafx.geometry.Insets;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.ImagePattern;

public class MyDialog extends Dialog {

    public MyDialog() {
        super();

        setTitle("Add book");

        Label label1 = new Label("Title: ");
        TextField title = new TextField();

        Label label2 = new Label("Author: ");
        TextField author = new TextField();

        Label label3 = new Label("Year: ");
        TextField year = new TextField();

        Label label4 = new Label("Rate: ");
        TextField rate = new TextField();

        Label label5 = new Label("Genre: ");
        TextField genre = new TextField();

        Label label6 = new Label("Description: ");
        TextField description = new TextField();

        Label label7 = new Label("Image path: ");
        TextField image = new TextField();

        GridPane grid = new GridPane();
        grid.add(label1, 1, 1);
        grid.add(title, 2, 1);

        grid.add(label2, 1, 2);
        grid.add(author, 2, 2);

        grid.add(label3, 1, 3);
        grid.add(year, 2, 3);

        grid.add(label4, 1, 4);
        grid.add(rate, 2, 4);

        grid.add(label5, 1, 5);
        grid.add(genre, 2, 5);

        grid.add(label6, 1, 6);
        grid.add(description, 2, 6);

        grid.add(label7, 1, 7);
        grid.add(image, 2, 7);

        Button btn = new Button("Add");
        grid.add(btn, 3, 9);

        grid.setMargin(btn, new Insets(10, 0, 0, 0));
        getDialogPane().setContent(grid);

        ButtonType buttonTypeOk = new ButtonType("Leave", ButtonBar.ButtonData.OK_DONE);
        getDialogPane().getButtonTypes().add(buttonTypeOk);

        btn.setOnAction(e -> {
            Book book = new Book("#000000", "#123456", title.getText(), author.getText(), year.getText(), rate.getText(),
                    genre.getText(), description.getText(), image.getText());
            book.setFill(new ImagePattern(new Image(image.getText())));
            book.setInfoStatus();
            GUI.getGrid().add(book, GUI.getColumn(), GUI.getRow());

            GUI.setColumn();
            if (GUI.getColumn() == 1) {
                GUI.setRow();
            }
        });

    }
}
