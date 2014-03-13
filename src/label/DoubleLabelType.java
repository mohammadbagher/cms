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
            else if(newValue.charAt(i) == '-')
                newValue.setCharAt(i, '-');
        try{
            return Double.parseDouble(newValue.toString());
        }catch(NumberFormatException e){
            Pattern p = Pattern.compile("\\[(\\-?\\d+(\\.\\d+)?)[\\.\\s]*(\\-?\\d+(\\.\\d+)?)\\]");
            Matcher matcher = p.matcher(value);
            matcher.find();
            double start = Double.parseDouble(matcher.group(1));
            double end = Double.parseDouble(matcher.group(3));
            return new DoubleRange(start, end);
        }
    }
}

class DoubleRange{
    private double start, end;

    public DoubleRange(double start, double end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public String toString() {
        return "[" + start + " .. " + end + "]"; //To change body of generated methods, choose Tools | Templates.
    }
    
}
