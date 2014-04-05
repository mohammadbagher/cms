/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package snapshot;

import java.io.Serializable;

/**
 *
 * @author bagher
 */
public class CMSSpnt implements Serializable{
    String name;
    String time;
    public CMSSpnt(String name,String time){
        this.name= name;
        this.time=time;
    }

    @Override
    public String toString() {
        return name; //To change body of generated methods, choose Tools | Templates.
    }

    public String getName() {
        return name;
    }

    public String getTime() {
        return time;
    }
   
}
