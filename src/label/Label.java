/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package label;

import exceptions.DuplicatedValueException;
import java.util.Vector;

/**
 *
 * @author ali
 */
public class Label {

    private String name;
    private Vector<Object> values;
    private LabelType type;

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
        values = new Vector<>();
        this.type = type;
    }
    
    public void addVaule(String value) throws Exception {
        Object o = type.convertValue(value);
//        if(values.indexOf(o) != -1)
//            throw new DuplicatedValueException();
        values.add(o);
    }
    
    public Boolean removeValue(Object value){
        return values.remove(value);
    }

    public Object[] getValues() {
        return values.toArray();
    }
}
