
package com.mycompany.piccross;

import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;

public class TableroVista extends GridPane {
    
    public TableroVista(Tablero tablero) {  
        for(int y=0; y<tablero.num_fila; y++) {
            for(int x=0; x<9; x++) {
                int num = tablero.getNumPos(x, y); 
                String strNum = String.valueOf(num);
                Label label = new Label(strNum);
                this.add(label, x, y);
            }
        }
    }
}