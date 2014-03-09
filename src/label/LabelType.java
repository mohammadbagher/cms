/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package label;

/**
 *
 * @author ali
 */
public abstract class LabelType {
    public abstract String getTypeName();
    public abstract Boolean isDiscrete();
    public abstract Object convertValue(String value);
//    abstract boolean isGreater(Object o1, Object o2);
}

//class BooleanLabelType extends LabelType{
//    
//}
