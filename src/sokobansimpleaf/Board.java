/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sokobansimpleaf;

import java.util.ArrayList;
import javax.swing.JPanel;


public class Board extends JPanel{

    int OFFSET,SPACE;
    int h = 300;
    int w = 300;
    ArrayList boxs = new ArrayList();
    ArrayList storages = new ArrayList();
    Player soko;
    
    private Slot[][] map = new Slot[4][4]; 
    //do du lieu vao map sao cho da co toa do cua player, boxs, storage
    
    public Board(){
        
        
        initWorld();
        
    }

    public int getBoardHeight() {
        return this.h;
    }

    public void setH(int h) {
        this.h = h;
    }

    public int getBoardWidth() {
        return this.w;
    }

    public void setW(int w) {
        this.w = w;
    }
    public void initWorld(){
        int x = OFFSET;
        int y = OFFSET;
        
        Box box ;
        Storage s;
        
    }
}
