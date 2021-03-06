/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package label;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author ali
 */
public class Label  implements Serializable{
    private static final long serialVersionUID = 1L;

    private String name;
    private ArrayList<Object> values;
    private LabelType type;
    private boolean isAssetKind=false;

    public void setIsAssetKind(boolean isAssetKind) {
        this.isAssetKind = isAssetKind;
    }

    public boolean isIsAssetKind() {
        return isAssetKind;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public LabelType getType() {
        return type;
    }

    public void setType(LabelType type) {
        values = new ArrayList<>();
        this.type = type;
    }
    
    public boolean isValidValue(String input){
        for(Object value: values){
            try {
                System.out.println(type);
                if(type.inRangeOrEqual(input, value))
                    return true;
            } catch (Exception e) {}
        }
        return false;
    }
    
    public void addVaule(String value) throws Exception {
        Object o = type.convertValue(value);
        values.add(o);
    }
    
    public Boolean removeValue(Object value){
        return values.remove(value);
    }

    public Object[] getValues() {
        return values.toArray();
    }

    @Override
    public String toString() {
        return name;
    }

    
}
