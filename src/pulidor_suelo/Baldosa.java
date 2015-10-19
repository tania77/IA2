package pulidor_suelo;

import java.awt.*;
import javax.swing.*;

public class Baldosa extends JPanel{
    boolean obstaculo;
    int posX;
    int posY;
    
    public Baldosa(boolean obstaculo, int x, int y){
        this.obstaculo = obstaculo;
        this.posX = x;
        this.posY = y;
    }
    
    public void setObstaculo(boolean obstaculo){
        this.obstaculo = true;
    }
    
    public boolean getObstaculo(){
        return this.obstaculo;
    }
    
    public void paint (Graphics g){
        if (obstaculo){
            g.setColor(Color.red);
            g.fillRect(posX, posY, 200, 200);
        }
        else{
            if ((posX+posY)%2 == 0){
                g.setColor(Color.white);
                g.fillRect(posX, posY, 200, 200);
            }
            else {
                g.setColor(Color.black);
                g.fillRect(posX, posY, 200, 200);
            }
        }
        
    }
}