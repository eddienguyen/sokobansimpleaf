
package sokobansimpleaf;

import java.awt.Color;
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
        
        setBorder(new LineBorder(Color.BLACK));
}
}
