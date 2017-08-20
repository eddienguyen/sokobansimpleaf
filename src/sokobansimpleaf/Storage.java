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
public class Storage extends Actor {

    char storageToken = 'S';
    
    @Override
    public char getToken() {
        return storageToken;
    }

    @Override
    public void setToken(char storageToken) {
        this.storageToken = storageToken;
    }

    public Storage(int x, int y) {
        super(x, y);
    }
    
    
}
