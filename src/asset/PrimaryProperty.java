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
public class PrimaryProperty implements Serializable{
    private final String name;
    private final String value;
    
    public PrimaryProperty(String name, String value){
        this.value =value;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getValue() {
        return value;
    }
}
