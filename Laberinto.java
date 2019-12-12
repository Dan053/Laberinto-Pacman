
package pacman;

import java.awt.Color;
import java.awt.Graphics;


public class Laberinto {
    
    private int fila=0;
    private int columna=0;
    private final int numFilas=15;
    private final int numCol=15;
    private final int anchoBloque=30;
    private final int altoBloque=30;  
    int pepita;  
    
    public void paint(Graphics grafico){
        
        int[][] laberinto = obtieneLaberinto();
        for(fila=0;fila<numFilas;fila++){
            for(columna=0;columna<numCol;columna++){
                if(laberinto[fila][columna]==1){
                    grafico.setColor(Color.RED);
                    grafico.fillRect(columna*30 ,fila*30 , anchoBloque, altoBloque);
                    grafico.setColor(Color.black);
                    grafico.drawRect(columna*30 ,fila*30 , anchoBloque, altoBloque);
                }else{
                    grafico.setColor(Color.YELLOW);
                    grafico.fillOval(columna*30+10, fila*30+10, 10, 10);
                }
            }
        }
    }
    
    public int[][] obtieneLaberinto(){
        int laberinto[][] = 
        {{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
         {1,0,0,0,0,0,0,0,1,0,0,0,0,0,1},
         {1,0,1,1,0,1,1,0,1,0,1,0,1,0,1},  
         {1,0,1,0,0,0,1,0,0,0,0,0,0,0,1},
         {1,0,0,0,1,0,0,0,1,1,0,1,1,1,1},
         {1,0,1,1,1,0,1,0,0,0,0,0,0,0,1},
         {1,0,0,0,1,0,1,1,1,0,1,1,1,0,1},
         {1,1,1,0,0,0,0,1,1,0,1,0,0,0,1},
         {1,0,0,0,1,1,0,0,1,0,1,0,1,0,1},
         {1,0,1,0,0,1,1,0,0,0,0,0,0,0,1},
         {1,0,1,1,0,1,1,0,1,0,1,0,1,0,1},
         {1,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
         {1,0,1,1,0,1,0,1,1,0,1,1,1,0,1},
         {1,0,0,0,0,1,0,0,0,0,0,0,0,0,1},
         {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
        };
        return laberinto;
    }
}
