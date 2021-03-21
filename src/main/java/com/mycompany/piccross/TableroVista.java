package com.mycompany.piccross;

import javafx.geometry.Pos;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.StageStyle;

public class TableroVista extends GridPane {

    Tablero tablero;
    final int TAM_X = 40;
    final int TAM_Y = 40;

    public TableroVista(Tablero tablero) {
        this.tablero = tablero;
        jugar();

        this.mouseController();
    }

    private void mouseController() {
        this.setOnMouseClicked((MouseEvent mouseEvent) -> {

            try {
                System.out.println("\nDetectado clic en X: " + mouseEvent.getX() + ", Y: " + mouseEvent.getY());
                int colClic = (int) (mouseEvent.getX() / TAM_X);
                int filClic = (int) (mouseEvent.getY() / TAM_Y);
                System.out.print("Col: " + colClic + ", Fil: " + filClic);
                boolean valor = tablero.getJugadorBoolPos(filClic, colClic);
                System.out.println(" >>> Número: " + valor);
                if (valor) {
                    this.setStyle("-fx-grid-lines-visible: true");
                    Rectangle r = new Rectangle();
                    r.setWidth(TAM_X);
                    r.setHeight(TAM_Y);
                    r.setFill(Color.GREEN);
                    this.add(r, colClic, filClic);
                } else {
                    Alert alert = new Alert(AlertType.ERROR);
                    alert.setHeaderText(null);
                    alert.initStyle(StageStyle.UTILITY);
                    alert.setContentText("Has Perdido");
                    alert.show();
                    jugar();
                }
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        });
    }

    private void jugar() {
        int numero1eny[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
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
                        numero1eny[x] += tablero.tablero_resuelto1[y][x];

                    }
                }

            }
        }
        this.setMaxWidth(TAM_X * tablero.num_colum);
        this.setMaxHeight(TAM_Y * tablero.num_fila);
    }

}
