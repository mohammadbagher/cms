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
public class StringLabelType extends LabelType{
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
}
