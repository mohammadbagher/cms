/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package label;

import exceptions.DuplicatedValueException;
import java.util.HashSet;
import java.util.Set;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ali
 */
public class LabelCatalogue {
    
    private static LabelCatalogue instance = null;
    
    private final Vector<Label> labels = new Vector<Label>();
    
    private LabelCatalogue(){
        /*mocking*/
        int t = 4;
        while(t-- > 0){
            try {
                Label label = new Label();
                label.setName("باقر");
                label.setType(new StringLabelType());
                label.addVaule("تست");
                labels.add(label);
            } catch (DuplicatedValueException ex) {
                Logger.getLogger(LabelCatalogue.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                Label label = new Label();
                label.setName("تبریزی");
                label.setType(new StringLabelType());
                label.addVaule("تست");
                labels.add(label);
            } catch (DuplicatedValueException ex) {
                Logger.getLogger(LabelCatalogue.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                Label label = new Label();
                label.setName("کوهیخیلی");
                label.setType(new StringLabelType());
                label.addVaule("تست");
                labels.add(label);
            } catch (DuplicatedValueException ex) {
                Logger.getLogger(LabelCatalogue.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public static LabelCatalogue getInstace(){
        if(instance == null)
            instance = new LabelCatalogue();
        return instance;
    }
    
    public void addLabel(Label label){
        labels.add(label);
    }
    
    public Boolean remove(Label label){
        return labels.remove(label);
    }
    
    public Vector<Label> getLabels(){
        return labels;
    }
}
