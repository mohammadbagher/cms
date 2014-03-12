/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package label;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author ali
 */
public class IntegerLabelType extends LabelType{
    @Override
    public String getTypeName() {
        return "Integer";
    }

    @Override
    public Boolean isDiscrete() {
        return true;
    }

    @Override
    public Object convertValue(String value) {
        //return Integer.parseInt(value);
        
        StringBuilder newValue = new StringBuilder(value);
        for(int i = 0; i < newValue.length(); i++)
            if('۱' <= newValue.charAt(i) && newValue.charAt(i) <= '۹')
                newValue.setCharAt(i, (char)(newValue.charAt(i) + '1' - '۱'));
            else if(newValue.charAt(i) == '-')
                newValue.setCharAt(i, '-');
        try{
            return Integer.parseInt(newValue.toString());
        }catch(NumberFormatException e){
            Pattern p = Pattern.compile("\\[(\\-?\\d+)[\\.\\s]*(\\-?\\d+)\\]");
            Matcher matcher = p.matcher(value);
            matcher.find();
            Integer start = Integer.parseInt(matcher.group(1));
            Integer end = Integer.parseInt(matcher.group(2));
            return new IntegerRange(start, end);
        }
    }
}

class IntegerRange{
    private Integer start, end;

    public IntegerRange(Integer start, Integer end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public String toString() {
        return "[" + start + " .. " + end + "]"; //To change body of generated methods, choose Tools | Templates.
    }
    
}
