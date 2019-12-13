
import Interface.Ventana;
import java.awt.*;
import java.awt.event.KeyEvent;
import javax.imageio.ImageIO;
import javax.swing.*;



public class Personaje {
    
    Laberinto lab = new Laberinto();
    private int x=40;
    private int y=40;
    private int ancho=40;
    private int alto=40;
    private int mov=40;
    

    public void paint (Graphics gr){
        
        gr.setColor(Color.red);
        gr.fillOval(x, y, ancho, alto);
        gr.setColor(Color.black);
        gr.drawOval(x, y, alto, ancho);
        
    }
    
    public void movimiento(KeyEvent evento){
        int [][] laberinto = lab.ObtenerLab();
        
        if(evento.getKeyCode()==37){ //IZQUIERDA
            if(laberinto[y/40][(x/40)-1]!=1){
                x=x-mov;
                
            }
        }
        if(evento.getKeyCode()==39){ //DERECHA
            if(laberinto[y/40][(x/40)+1]!=1){
                x=x+mov;
                //System.out
                        
            }
        }
        if(evento.getKeyCode()==38){ //ARRIBA
            if(laberinto[(y/40)-1][x/40]!=1){
                y=y-mov;
            }
        }
        if(evento.getKeyCode()==40){ //ABAJO
            if(laberinto[(y/40)+1][x/40]!=1){
                y=y+mov;
            }
        }
        if(evento.getKeyCode()==39){ //DERECHA
            if(laberinto[y/40][(x/40)]==2){
                
                Icon icono;
                icono = new ImageIcon(getClass().getResource("/imagen/FELICIDADES.png"));
                Ventana ven =new Ventana();
                ven.setVisible(true);
                
            }
            
        }
    }
}
