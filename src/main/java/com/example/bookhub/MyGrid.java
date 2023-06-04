package com.example.bookhub;

import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;

public class MyGrid extends GridPane {

    public MyGrid(Button btn) {
        super();

        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 5; j++) {
                if ( i == 0 || i == 6)
                    add(new Book("#ffffff", "#ffffff","", "", "", "", "", "", ""), i, j);
                else
                    add(new Book("#000000", "#123456","", "", "", "", "", "", ""), i, j);
            }
        }
        add(btn, 6, 0);
    }
}
