/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package label;

import asset.Asset;
import exceptions.DuplicatedValueException;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author ali
 */
public class AttachedLabel implements Serializable{
    private Label label;
    private Asset asset;
    private ArrayList<String> values;

    public AttachedLabel() {
        values = new ArrayList<>();
    }
    
    public boolean addValue(String value) throws DuplicatedValueException {
        if(values.indexOf(value) != -1)
            throw new DuplicatedValueException();
        if(label != null && label.isValidValue(value)){
            values.add(value);
            return true;
        }
        return false;
    }
    
    public Object[] getValues(){
        return values.toArray();
    }

    public Label getLabel() {
        return label;
    }

    public void setLabel(Label label) {
        values = new ArrayList<>();
        this.label = label;
    }

    public Asset getAsset() {
        return asset;
    }

    public void setAsset(Asset asset) {
        this.asset = asset;
    }

    @Override
    public String toString() {
        if(label != null)
            return label.getName();
        else{
            System.err.println(asset);
            System.err.println(label);
            System.err.println(values);
            return "";
        }
            
    }
}
