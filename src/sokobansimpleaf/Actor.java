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
public abstract class Actor {
    char token = ' ';
    int x;
    int y;
    
    
    public abstract char getToken() ;
    public abstract void setToken(char token) ;
    
    
    
    /*
    public char getToken() {
        return token;
    }

    public void setToken(char token) {
        this.token = token;
    }
    */

    public Actor(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    
    }
    
    

