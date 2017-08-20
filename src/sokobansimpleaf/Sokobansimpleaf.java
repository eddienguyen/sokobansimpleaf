/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sokobansimpleaf;


import java.awt.HeadlessException;
import javax.swing.JFrame;
/**
 *
 * @author Eddie
 */
public class Sokobansimpleaf extends JFrame {

    int OFFSET = 20;

    public Sokobansimpleaf()  {
        initUI();
        
    }
    
    public void initUI(){
        Board mainboard = new Board();
        add(mainboard);
        
        setTitle("Sokoban the Simple AF version");
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(mainboard.getBoardWidth(), mainboard.getBoardHeight());
        
    }
    
    
    public static void main(String[] args) {
        Sokobansimpleaf maingame = new Sokobansimpleaf();
        
    }
    
}
