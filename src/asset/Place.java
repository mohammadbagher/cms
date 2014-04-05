/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package asset;

import java.io.Serializable;

/**
 *
 * @author bagher
 */
public class Place implements Serializable{
    private static final long serialVersionUID = 1L;
    double east;
    double north;
    
    public void setEast(double east) {
        this.east = east;
    }

    public void setNorth(double north) {
        this.north = north;
    }

    public double getEast() {
        return east;
    }

    public double getNorth() {
        return north;
    }
    
}
