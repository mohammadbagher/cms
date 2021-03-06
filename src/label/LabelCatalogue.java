/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package label;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ali
 */
public class LabelCatalogue  implements Serializable{
    private static final long serialVersionUID = 1L;

    private static LabelCatalogue instance = null;

    private ArrayList<Label> labels = new ArrayList<Label>();

    private LabelCatalogue() {
        /*mocking*/
//        int t = 1;
//        while(t-- > 0){
        try {
            Label label = new Label();
            label.setName("صحیح");
            label.setType(new IntegerLabelType());
            label.addVaule("۱");
            label.addVaule("-2");
            label.addVaule("[-5..-4]");
            labels.add(label);
        } catch (Exception ex) {
            Logger.getLogger(LabelCatalogue.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            Label label = new Label();
            label.setName("دودویی");
            label.setType(new BooleanLabelType());
            label.addVaule("ندارد");
            label.addVaule("درست");
            labels.add(label);
        } catch (Exception ex) {
            Logger.getLogger(LabelCatalogue.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            Label label = new Label();
            label.setName("اعشاری");
            label.setType(new DoubleLabelType());
            label.addVaule("[1..2]");
            label.addVaule("3");
            label.addVaule("-5.5");
            labels.add(label);
        } catch (Exception ex) {
            Logger.getLogger(LabelCatalogue.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            Label label = new Label();
            label.setName("رشته");
            label.setType(new StringLabelType());
            label.addVaule("تست می‌شود.");
            labels.add(label);
        } catch (Exception ex) {
            Logger.getLogger(LabelCatalogue.class.getName()).log(Level.SEVERE, null, ex);
        }
//        }
    }

    public static LabelCatalogue getInstace() {
        if (instance == null) {
            instance = new LabelCatalogue();
        }
        return instance;
    }

    public void addLabel(Label label) {
        labels.add(label);
    }

    public Boolean remove(Label label) {
        return labels.remove(label);
    }

    public ArrayList<Label> getLabels() {
        return labels;
    }
    
    public void setLabels(ArrayList<Label>labels){
        this.labels=labels;
    }
    public ArrayList<Label> getAssetKindLabels(){
        ArrayList<Label> ls = new ArrayList<>();
        for(Label l : LabelCatalogue.getInstace().getLabels()){
            if(l.isIsAssetKind()){
                ls.add(l);
            }
        }
        return ls;
    }
}
