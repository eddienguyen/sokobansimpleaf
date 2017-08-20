/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sokobansimpleaf;

/**
 *
 * @author Eddie
 */
public class Player extends Actor {
    
    char playerToken = 'P';
    
    
    @Override
    public char getToken() {
        return playerToken;
                }

    @Override
    public void setToken(char playerToken) {
        this.playerToken = playerToken;
    }
    
    
    
    
    public Player(int x,int y){
        super(x, y);
    }
    public void move(){
        
    }
}
