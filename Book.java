package com.example.bookhub;

import javafx.scene.image.Image;
import javafx.scene.paint.ImagePattern;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Rectangle;

public class Book extends Rectangle {
    private String title, author, year, rate, genre, description;

    public Book(String fill, String stroke, int column, int row) {
        super(200, 300);
        //setFill(new ImagePattern(new Image("C:\\Users\\Dominik\\Desktop\\sapiens.jpg")));
        setFill(Paint.valueOf(fill));
        setStroke(Paint.valueOf(stroke));
    }
}
