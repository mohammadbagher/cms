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
public class DoubleLabelType extends LabelType{
    @Override
    public String getTypeName() {
        return "Double";
    }

    @Override
    public Boolean isDiscrete() {
        return false;
    }

    @Override
    public Object convertValue(String value) {
        StringBuilder newValue = new StringBuilder(value);
        for(int i = 0; i < newValue.length(); i++)
            if('۱' <= newValue.charAt(i) && newValue.charAt(i) <= '۹')
                newValue.setCharAt(i, (char)(newValue.charAt(i) + '1' - '۱'));
            else if(newValue.charAt(i) == '.')
                newValue.setCharAt(i, '.');
        return Double.parseDouble(newValue.toString());
    }
}
