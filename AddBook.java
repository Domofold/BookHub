package com.example.bookhub;

import javafx.scene.control.Button;

public class AddBook extends Button {

    public AddBook(String str) {
        super(str);

        setOnAction(e -> {
            for (int i = 0; i < 7; i++) {
                for (int j = 0; j < 5; j++) {
                    if ( i == 0 || i == 6)
                        GUI.getGrid().add(new Book("#ffffff", "#ffffff"), i, j);
                    else
                        GUI.getGrid().add(new Book("#000000", "#123456"), i, j);
                }
            }
        });
    }

}
