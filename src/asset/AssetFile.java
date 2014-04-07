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
public class AssetFile implements Serializable{
    private final String name;
    private final String address;
    public AssetFile(String name,String address){
        this.address=address;
        this.name= name;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }
    
    
}
