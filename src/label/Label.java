/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package label;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Vector;
import rule.ApplyRule;

/**
 *
 * @author ali
 */
public class Label  implements Serializable{

    private String name;
    private Vector<Object> values;
    private LabelType type;
    private ArrayList<ApplyRule> rules = new ArrayList<ApplyRule>();
    
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

    public ArrayList<ApplyRule> getRules() {
        return rules;
    }

    public void setRules(ArrayList<ApplyRule> rules) {
        this.rules = rules;
    }
    
}
