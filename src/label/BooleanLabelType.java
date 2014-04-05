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
public class BooleanLabelType extends LabelType implements Serializable{
    private static final long serialVersionUID = 1L;
    @Override
    public String getTypeName() {
        return "Boolean";
    }

    @Override
    public Boolean isDiscrete() {
        return true;
    }

    @Override
    public Object convertValue(String value) {
        if(value.equals("true") || value.equals("درست") || value.equals("دارد") || value.equals("1") || value.equals("۱"))
            return true;
        if(value.equals("false") || value.equals("نادرست") || value.equals("ندارد") || value.equals("0") || value.equals("۰"))
            return false;
        throw new NumberFormatException();
    }

    @Override
    public boolean inRangeOrEqual(String input, Object value) {
        if(input.equals("true") || input.equals("درست") || input.equals("دارد") || input.equals("1") || input.equals("۱"))
            return value.equals(true);
        if(input.equals("false") || input.equals("نادرست") || input.equals("ندارد") || input.equals("0") || input.equals("۰"))
            return value.equals(false);
        throw new NumberFormatException();
    }
    
}
