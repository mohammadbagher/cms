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
public class StringLabelType extends LabelType implements Serializable
{
    @Override
    public String getTypeName() {
        return "String";
    }

    @Override
    public Boolean isDiscrete() {
        return true;
    }

    @Override
    public Object convertValue(String value) {
        return value;
    }

    @Override
    public boolean inRangeOrEqual(String input, Object value) {
        if(input.equals(value))
            return true;
        return false;
    }
}
