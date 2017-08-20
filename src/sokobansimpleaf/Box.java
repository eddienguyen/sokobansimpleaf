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
public class Box extends Actor{

    char boxToken = 'B';
    
    
    @Override
    public char getToken() {
        return boxToken;
    }

    @Override
    public void setToken(char boxToken) {
        this.boxToken = boxToken;
    }

    public Box(int x,int y) {
        super(x, y);
    }
    
    
    
}
