
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
    public Slot() {
        //duong vien:
        buildSlot(g);
        setBorder(new LineBorder(Color.BLACK));
}
    public void buildSlot(Graphics g){
        for (int i =0;i< slots.length;i++){
            for(int j=0;j< slots.length;j++){
                char slotToken = slots[i][j].getToken();
                if(slotToken == 'P'){
                    g.drawString("P", i,j);
                }
            }
        }
    }
}
