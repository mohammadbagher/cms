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
public class BooleanLabelType extends LabelType{

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
    
}
