/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package label;

import java.io.Serializable;

/**
 *
 * @author ali
 */
public abstract class LabelType  implements Serializable{
    private static final long serialVersionUID = 1L;
    public abstract String getTypeName();
    public abstract Boolean isDiscrete();
    public abstract Object convertValue(String value);
    public abstract boolean inRangeOrEqual(String input, Object value);
//    abstract boolean isGreater(Object o1, Object o2);
}
