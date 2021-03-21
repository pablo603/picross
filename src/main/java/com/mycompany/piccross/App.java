package com.mycompany.piccross;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;


/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage stage) {
        BorderPane paneRoot = new BorderPane();
        var scene = new Scene(paneRoot, 640, 480);
        stage.setScene(scene);
        stage.show();
        Tablero tablero = new Tablero();
        tablero.mostrarPorConsola();
        TableroVista tablerovista = new TableroVista(tablero);
        paneRoot.setCenter(tablerovista);
    }

    public static void main(String[] args) {
        launch();
    }

}
