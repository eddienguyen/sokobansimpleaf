/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sokobansimpleaf;

import java.awt.Graphics;
import java.awt.GridLayout;
import java.util.ArrayList;
import javax.swing.JPanel;


public class Board extends JPanel{

    int OFFSET,SPACE;
    int h = 300;
    int w = 300;
    ArrayList boxs = new ArrayList();
    ArrayList storages = new ArrayList();
    Player soko;
    
    Slot[][] slots = new Slot[4][4];
    Player p = new Player(1, 1);
    Box b = new Box(2,2);
    Storage s = new Storage(3,2);
    
    
        //do du lieu vao map sao cho da co toa do cua player, boxs, storage
        //1 GridLayOut m la 1 panel chua cac o 
        JPanel m = new JPanel(new GridLayout(4,4,0,0));
        
    public Board(){
        
        
        
        //do du lieu va set token:
        for (int i=0;i<slots.length;i++){
            for (int j=0;j<slots.length;j++){
                m.add(slots[i][j] = new Slot());
                if(i == p.x && j == p.y){
                    slots[i][j].setToken(p.getToken());
                }else if(i == b.x && j == b.y){
                    slots[i][j].setToken(b.getToken());
                }else if(i == s.x && j == s.y){
                    slots[i][j].setToken(s.getToken());
                }
            }
        }
        
        
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
        
        // add Player,Box,Storage vao World theo Map m:
        for (int i =0;i<= slots.length;i++){
            for(int j=0;j<= slots.length;j++){
                char slotToken = slots[i][j].getToken();
                
                
        }
        }
        
    }
    
    public void buildWord(Graphics g){
        
    }
    
}
