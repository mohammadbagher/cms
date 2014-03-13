/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asset;

import java.util.ArrayList;

/**
 *
 * @author bagher
 */
public class Asset {

    private String name;
    private String UID;
    private ArrayList<Asset> subAssets = new ArrayList<Asset>();
    private boolean isHuman;
    private boolean isComposite;
    private boolean isPlace;
    private boolean isPhysical;
    
    public String getUID() {
        return UID;
    }

    public void setUID(String UID) {
        this.UID = UID;
    }

    public ArrayList<Asset> getSubAssets() {
        return subAssets;
    }

    public void setSubAssets(ArrayList<Asset> subAssets) {
        this.subAssets = subAssets;
    }

    public boolean isIsHuman() {
        return isHuman;
    }

    public void setIsHuman(boolean isHuman) {
        this.isHuman = isHuman;
    }

    public boolean isIsComposite() {
        return isComposite;
    }

    public void setIsComposite(boolean isComposite) {
        this.isComposite = isComposite;
    }

    public boolean isIsPlace() {
        return isPlace;
    }

    public void setIsPlace(boolean isPlace) {
        this.isPlace = isPlace;
    }

    public boolean isIsPhysical() {
        return isPhysical;
    }

    public void setIsPhysical(boolean isPhysical) {
        this.isPhysical = isPhysical;
    }
    
    
    public void setName(String name) {
        this.name = name;
    }
    public String getName(){
        return this.name;
    }

    @Override
    public String toString() {
        return name;
    }
    
}
