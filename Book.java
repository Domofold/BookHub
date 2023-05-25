package com.example.bookhub;

import javafx.scene.paint.Paint;
import javafx.scene.shape.Rectangle;

public class Book extends Rectangle {

    public Book(String fill, String stroke) {
        super(200, 300);
        setFill(Paint.valueOf(fill));
        setStroke(Paint.valueOf(stroke));
    }
}
