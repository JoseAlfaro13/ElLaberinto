
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;


public class Juego extends JPanel {
    
    Laberinto lab = new Laberinto();
    Personaje pj = new Personaje();
    
    
    public Juego(){
         addKeyListener(new KeyListener(){//se agregan los elementos de este metodo:

             @Override
             public void keyTyped(KeyEvent e) {  
             }

             @Override
             public void keyPressed(KeyEvent e) {//presionar tecla
                 pj.movimiento(e);
             }

             @Override
             public void keyReleased(KeyEvent e) {    
             }
         });
         setFocusable(true);
    }
    
    @Override
    public void paint (Graphics gr){
        lab.paint(gr);
        pj.paint(gr);
 
    }
    
    public static void main(String[] args)  {
        JFrame Ventana = new JFrame("LABERINTO");
        Juego juego = new Juego();
        Ventana.add(juego);
        
        Ventana.setSize(1220,680);
        Ventana.setLocation(70,20);
        Ventana.setVisible(true);
        Ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        while (true){
            try {
                Thread.sleep(10);//milisegundos
            } catch (InterruptedException ex) {
                Logger.getLogger(Juego.class.getName()).log(Level.SEVERE, null, ex);
            }
            juego.repaint();
        }
    }
    
}
