/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rule;

import java.util.ArrayList;
import asset.Asset;
import java.io.Serializable;
import label.AttachedLabel;

/**
 *
 * @author bagher
 */
public class ApplyRule  implements Serializable{
    private static final long serialVersionUID = 1L;
    private int importance;
    public static final String[] importanceComment = {"بحرانی-امن","بحرانی","مهم","عادی"};
    public int getImportance() {
        return importance;
    }

    public void setImportance(int importance) {
        this.importance = importance;
    }
    private int rule;
    private Asset inMeasureAsset;
    private Asset baseAsset;
    private int inMeasurePropertyNumber = -1;
    private int basePropertyNumber = -1;
    private AttachedLabel inMeasureLabel;
    private AttachedLabel baseLabel;

    public void setRule(int rule) {
        this.rule = rule;
    }

    public void setInMeasureAsset(Asset inMeasureAsset) {
        this.inMeasureAsset = inMeasureAsset;
    }

    public void setBaseAsset(Asset baseAsset) {
        this.baseAsset = baseAsset;
    }

    public void setInMeasurePropertyNumber(int inMeasurePropertyNumber) {
        this.inMeasurePropertyNumber = inMeasurePropertyNumber;
    }

    public void setBasePropertyNumber(int basePropertyNumber) {
        this.basePropertyNumber = basePropertyNumber;
    }

    public void setInMeasureLabel(AttachedLabel inMeasureLabel) {
        this.inMeasureLabel = inMeasureLabel;
    }

    public void setBaseLabel(AttachedLabel baseLabel) {
        this.baseLabel = baseLabel;
    }

    public ApplyRule(Asset inMeasureAsset, Asset baseAsset, int inMeasurePropertyNumber, int basePropertyNumber, AttachedLabel inMeasureLabel, AttachedLabel baseLabel, int rule, int importance) {
        this.rule = rule;
        this.importance = importance;
        this.baseAsset= baseAsset;
        this.baseLabel=baseLabel;
        this.basePropertyNumber= basePropertyNumber;
        this.inMeasureAsset = inMeasureAsset;
        this.inMeasureLabel = inMeasureLabel;
        this.inMeasurePropertyNumber= inMeasurePropertyNumber;
    }

    public int getRule() {
        return rule;
    }

    public Asset getInMeasureAsset() {
        return inMeasureAsset;
    }

    public Asset getBaseAsset() {
        return baseAsset;
    }

    public int getInMeasurePropertyNumber() {
        return inMeasurePropertyNumber;
    }

    public int getBasePropertyNumber() {
        return basePropertyNumber;
    }

    public AttachedLabel getInMeasureLabel() {
        return inMeasureLabel;
    }

    public AttachedLabel getBaseLabel() {
        return baseLabel;
    }

    public boolean verify(double inMeasure, double base) {
        switch (rule+1) {
            case 1: {
                return (base == inMeasure);
            }
            case 2: {
                return ((inMeasure - base) > 0);
            }
            case 3: {
                return ((base - inMeasure) > 0);
            }
            case 4: {
                return ((inMeasure - base) >= 0);
            }
            case 5: {
                return ((base - inMeasure) >= 0);
            }
            case 10: {
                return (base != inMeasure);
            }
        }
        return false;
    }

    public boolean verify(int inMeasure, int base) {
        return verify((double) inMeasure, (double) base);
    }

    public boolean verify(int inMeasure, double base) {
        return verify((double) inMeasure, (double) base);
    }

    public boolean verify(double inMeasure, int base) {
        return verify((double) inMeasure, (double) base);
    }

    public boolean verify(Object inMeasure, ArrayList<Object> base) {
        switch (rule+1) {
            case 6: {
                return (base.contains(inMeasure));
            }
            case 8: {
                return !(base.contains(inMeasure));
            }
        }
        return false;
    }

    public boolean verify(ArrayList<Object> inMeasure, Object base) {
        switch (rule+1) {
            case 7: {
                return (inMeasure.contains(base));
            }
            case 9: {
                return !(inMeasure.contains(base));
            }
        }
        return false;
    }

    public boolean verify(boolean inMeasure, boolean base) {
        switch (rule+1) {
            case 1: {
                return (base == inMeasure);
            }
            case 10: {
                return (base != inMeasure);
            }
        }
        return false;
    }
}
