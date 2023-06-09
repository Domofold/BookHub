package com.example.bookhub;

import javafx.scene.image.Image;
import javafx.scene.paint.ImagePattern;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Rectangle;

public class Book extends Rectangle {
    private String titleG = "", authorG = "", yearG = "", rateG = "", genreG = "", descriptionG = "", pathG = "";

    private boolean infoStatus = false;

    public void setInfoStatus() {
        infoStatus = true;
    }

    public Book(String fill, String stroke, String title, String author, String year,
                String rate, String genre, String description, String path) {
        super(200, 300);

        titleG = title;
        authorG = author;
        yearG = year;
        rateG = rate;
        genreG = genre;
        descriptionG = description;
        pathG = path;

        setFill(Paint.valueOf(fill));
        setStroke(Paint.valueOf(stroke));

        BookInfo info = new BookInfo(titleG, authorG, yearG, rateG, genreG, descriptionG, pathG);
        setOnMouseClicked(e -> {
            if (infoStatus)
                info.show();
        });
    }


}
