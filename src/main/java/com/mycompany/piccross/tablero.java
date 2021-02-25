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


public class tablero {
    int num_colum = 10;
    int num_fila = 6 ;
    
    int[][] tablero_jugador = { {0,0,0,0,0,0,0,0,0,0},
                                {0,0,0,0,0,0,0,0,0,0},
                                {0,0,0,0,0,0,0,0,0,0},
                                {0,0,0,0,0,0,0,0,0,0},
                                {0,0,0,0,0,0,0,0,0,0},
    };
    int [][] tablero_resuelto3 =  { {0,0,0,0,1,1,0,0,0,0},
                                    {0,0,0,1,1,1,1,0,0,0},
                                    {0,0,1,1,1,1,1,1,0,0},
                                    {0,1,1,1,1,1,1,1,1,0},
                                    {1,1,1,1,1,1,1,1,1,1},
                            
    };
    int [][] tablero_resultado1 ={  {0,0,1,1,1,1,1,1,0,0},
                                    {0,0,1,1,1,1,1,1,0,0},
                                    {0,0,1,1,1,1,1,1,0,0},
                                    {0,0,1,1,1,1,1,1,0,0},
                                    {0,0,1,1,1,1,1,1,0,0},
                            
    };
    int [][] tablero_resuelto2 ={   {0,0,0,0,0,0,0,1,1,1},
                                    {0,0,0,0,1,1,1,0,0,0},
                                    {0,0,0,1,1,1,1,0,0,0},
                                    {0,0,0,0,1,1,0,0,0,0},
                                    {0,0,0,0,1,1,0,0,0,0},
    };
    public void mostrarPorConsola() {
        for(num_fila=0;num_fila<7;num_fila++){  //Para las filas
        
        for(num_colum=0;num_colum<11;num_colum++){ //para las columnas 
            
            System.out.print(tablero_jugador[num_fila][num_colum]);     
            }
            System.out.println();
    }
    }
    
}
