
import java.awt.*;


public class Laberinto {
    private int fila=0;
    private int columna=0;
    private int numfil=16;// numero filas
    private int numcol=30;// numero columnas
    private int ancho=40;// ancho bloque
    private int largo=40;// largo bloque
    
    public void paint (Graphics gr){
        int [][] laberinto = ObtenerLab();
        for(fila=0 ; fila<numfil ; fila++){
            for(columna=0 ; columna<numcol ; columna++){
                if(laberinto[fila][columna]==1){
                    gr.setColor(Color.green);
                    gr.fillRect(columna*40, fila*40, ancho, largo);
                    gr.setColor(Color.black);
                    gr.drawRect(columna*40, fila*40, ancho, largo);
                }
            }
        }
        
    }
    
    public int [][] ObtenerLab(){
        int laberinto[][]=
               {   { 1 ,   1,  1,   1,  1,   1,  1,  1,   1,   1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1 },
                   { 1,    0,    0,   1,     0,    0,     0,     0,     0,     0,   0,     0,    0,     0,    0,    0,    0,    1,    1,    1,    1,     1,    1,    1,    1,    1,    1,   1,   1,   1 },
                   { 1 ,   1,    0,    1,     1,     1,     1,     1,      1,     1,    1,     1,     0,     1,     0,    1,    0,    1,    1,    0,    0,    0,   1,    0,    0,   0,   1,   1,   1,   1 },
                   { 1 ,   1,    0,    0,    0,     0,    0,      1,     1,     1,    1,     0,     0,    1,     0,    1,    0,    0,    1,    0,    1,    0,   1,    0,    1,   0,   1,   1,   1,   1 },
                   { 1 ,   1,    0,    1,     1,     1,     0,     1,      1,    0,    0,    0,      1,    1,     0,    1,    1,    0,    0,    0,    1,    0,   1,    0,    1,   0,   1,   0,   1,   1 },
                   { 1 ,   1,    0,    1,    0,     1,     0,     0,     0,    0,     1,     1,     1,    0,     0,    0,    1,    1,    1,     1,    1,    0,   1,    0,    1,   0,   0,   0,   1,   1 },
                   { 1 ,   1,    0,    1,    0,     1,      1,      1,    1,     1,     1,    0,     0,    0,     1,    0,     1,   0,    0,    0,   0,    0,    1,    1,    1,   0,   1,   1,   1,   1 },
                   { 1 ,   1,    0,    1,    0,     0,     0,     0,    0,     0,    0,    0,     1,    0,     1,     1,     1,   1,    0,    1,    1,    0,    0,    0,    0,   0,   0,   0,   1,   1 },
                   { 1 ,   1,    0,    0,    0,     1,     1,      1,    1,      1,    1,     1,      1,   0,     1,     0,    0,   0,    0,    1,    1,    1,     1,    1,    1,   1,   1,   0,   1,   1 },
                   { 1 ,   1,    0,    1,     1,     1,     0,     0,     0,    0,    0,    1,     1,    0,     0,    0,    1,    1,    0,    0,    0,    1,    1,    0,    0,   0,   0,   0,   1,   1 },
                   { 1 ,   1,    0,    0,    0,     0,    0,     1,      1,    1,     0,    0,    0,     0,     1,     1,    1,    1,    1,     1,    1,    1,     1,    1,    1,   1,   1,   1,   1,   1 },
                   { 1 ,   1,    1,     1,    1,     0,    1,       1,      1,    1,     1,    0,    1,     1,     1,     1,    0,   0,    0,    0,    0,    0,   0,    0,    1,   1,   1,   1,   1,   1 },
                   { 1 ,   1,    1,     1,    1,     0,    0,      0,     0,    0,     1,    0,    0,    0,     0,    0,    0,   1,    0,     1,    1,    0,    1,    0,    0,   0,   0,   0,   1,   1 },
                   { 1 ,   1,    1,     1,    0,     0,    1,      1,      1,    0,     1,    0,    1,     1,     1,     1,    1,    1,    0,    0,    0,    0,    1,    1,    1,    1,   1,   0,   1,   1 },
                   { 1 ,   1,    0,    0,    0,     1,    0,      0,     0,    0,     1,    0,    0,    0,     0,    0,    1,    0,    0,    1,    1,    0,    0,    0,   0,    0,   1,   0,   0,   2 },
                   { 1 ,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1 },
                   
               };
        return laberinto;
        
    }
    
    
}