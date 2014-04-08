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
import rule.ApplyRule;

/**
 *
 * @author ali
 */
public class AttachedLabel implements Serializable {

    private static final long serialVersionUID = 1L;
    private Label label;
    private Asset asset;
    private ArrayList<String> values;
    private ArrayList<ApplyRule> rules = new ArrayList<>();

    public AttachedLabel() {
        values = new ArrayList<>();
    }

    public boolean addValue(String value) throws DuplicatedValueException {
        if (values.indexOf(value) != -1) {
            throw new DuplicatedValueException();
        }
        if (label != null && label.isValidValue(value)) {
            values.add(value);
            return true;
        }
        return false;
    }
    
    public boolean removeValue(String value){
        return values.remove(value);
    }

    public Object[] getValues() {
        return values.toArray();
    }
    
    public String getHumanReadableValues(){
        if(values.isEmpty())
            return "مقداری تعیین نشده است.";
        if(values.size() == 1)
            return values.get(0);
        String ret = values.get(0);
        for(int i = 1; i < values.size(); i++)
            ret += ", " + values.get(i);
        return ret;
    }

    public Label getLabel() {
        return label;
    }

    public void clearValues() {
        values = new ArrayList<>();
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
        if (label != null) {
            return label.getName() + ": " + getHumanReadableValues();
        } else {
            System.err.println(asset);
            System.err.println(label);
            System.err.println(values);
            return "";
        }
    }

    public ArrayList<ApplyRule> getRules() {
        return rules;
    }

    public void setRules(ArrayList<ApplyRule> rules) {
        this.rules = rules;
    }

    public void remveApplyRule(ApplyRule apr) {
        this.rules.remove(apr);
    }
}
