package com.mycompany.piccross;

import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class TableroVista extends GridPane {

    Tablero tablero;
    final int TAM_X = 40;
    final int TAM_Y = 40;

    public TableroVista(Tablero tablero) {
        this.tablero = tablero;
        int numero1eny[] = {tablero.num_colum};
        for (int y = 0; y <= tablero.num_fila; y++) {
            int numero1 = 0;
            if (y == tablero.num_fila) {
                for (int x = 0; x < tablero.num_colum; x++) {

                    String strNum = String.valueOf(numero1eny[x]);
                    Label label = new Label(strNum);
                    label.setPrefWidth(TAM_X);
                    label.setPrefHeight(TAM_Y);
                    label.setAlignment(Pos.CENTER);
                    this.add(label, x, y);
                }
            } else {
                for (int x = 0; x <= tablero.num_colum; x++) {
                    if (x == tablero.num_colum) {
                        String strNum = String.valueOf(numero1);
                        Label label = new Label(strNum);
                        label.setPrefWidth(TAM_X);
                        label.setPrefHeight(TAM_Y);
                        label.setAlignment(Pos.CENTER);
                        this.add(label, x, y);
                    } else {
                        this.setStyle("-fx-grid-lines-visible: true");
                        Rectangle r = new Rectangle();
                        r.setWidth(TAM_X);
                        r.setHeight(TAM_Y);
                        r.setFill(Color.LIGHTGRAY);
                        this.add(r, x, y);
                        numero1 += tablero.tablero_resuelto1[y][x];
                        numero1eny[y] += tablero.tablero_resuelto1[y][x];
                    }
                }

            }
        }

        this.setMaxWidth(TAM_X * tablero.num_colum);
        this.setMaxHeight(TAM_Y * tablero.num_fila);

    }

    public static void EscribrirTableroJugador() {

    }
}
