/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.piccross;

/**
 *
 * @author Pablo
 */


public class Tablero {
    protected int num_colum;
    protected int num_fila;
    protected int tablero_jugador[][]= {{0,0,0,0,0,0,0,0,0,0},
                                {0,0,0,0,0,0,0,0,0,0},
                                {0,0,0,0,0,0,0,0,0,0},
                                {0,0,0,0,0,0,0,0,0,0},
                                {0,0,0,0,0,0,0,0,0,0}};
    
    protected int tablero_resuelto1[][] ={  {0,0,1,1,1,1,1,1,0,0},
                                            {0,0,1,1,1,1,1,1,0,0},
                                            {0,0,1,1,1,1,1,1,0,0},
                                            {0,0,1,1,1,1,1,1,0,0},
                                            {0,0,1,1,1,1,1,1,0,0}
                                    };
    
    public Tablero() {
        this.num_colum = 10;
        this.num_fila = 5;
        
    }
    
    
    
    
   
    
    
    public void mostrarPorConsola() {
        for(int fila=0;fila<this.num_fila;fila++){  //Para las filas
        
            for(int columna=0;columna<this.num_colum;columna++){ //para las columnas 
                System.out.print(this.tablero_jugador[fila][columna]+ " ");
            }
            System.out.println();
        }
            
    }
    
    public boolean getJugadorBoolPos(int x, int y) {
        boolean respuesta = false;
        if(tablero_resuelto1[x][y] == 1){
            respuesta = true;
        }
        return respuesta;
    }
        
    
    
    public static void main(String[] args) {
        Tablero ta1 = new Tablero();
        ta1.mostrarPorConsola();
    }
    
}