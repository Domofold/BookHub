package com.example.bookhub;

import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;

public class MyGrid extends GridPane {

    public MyGrid(Button btn) {
        super();

        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 5; j++) {
                Book book = new Book("#ffffff", "#ffffff","", "", "", "", "", "", "");
                add(book, i, j);
            }
        }

        add(btn, 6, 0);
    }
}
