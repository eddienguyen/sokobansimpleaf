
package sokobansimpleaf;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

/**
 *
 * @author Eddie
 */
public class Slot extends JPanel {
    //gia tri cua o
    char token=' ';
    
     //getter and setter:
    public char getToken(){    
        return token;
        
    }

    public void setToken(char c) {
        token = c;
        repaint();
        
    }
    

    //khoi tao cell
    public void paintComponent(Graphics g){
        super.setBorder(new LineBorder(Color.BLACK));
        super.paintComponent(g);
        
        if(token == 'P'){
            
            g.setColor(Color.red);
            g.drawString("P", 35, 35);
        } else if(token =='B'){
            g.setColor(Color.DARK_GRAY);
            g.drawString("B",35, 35);
        } else if(token =='S'){
            g.setColor(Color.MAGENTA);
            g.drawString("S", 35, 35);
        }
        
              
    }
}
    /*
    public void buildSlot(Graphics g){
        for (int i =0;i< slots.length;i++){
            for(int j=0;j< slots.length;j++){
                char slotToken = slots[i][j].getToken();
                if(slotToken == 'P'){
                    g.drawString("P", i,j);
                }
            }
        }
    } */

    
    



