/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rule;

/**
 *
 * @author bagher
 */
public class Rule {

    private String comment;
    private int type;

    public Rule(String comment, int type) {
        this.comment = comment;
        this.type = type;
    }
//    public String getComment() {
//        return comment;
//    }
//
//    public int getType() {
//        return type;
//    }

    public String getComment() {
        return comment;
    }

    public int getType() {
        return type;
    }

    
    public String toString() {
        return this.comment;
    }

    public boolean verify(Object base, Object inMeasure) {
        switch (this.type) {
            case 1: {
                return base.equals(inMeasure);
            }
            case 2: {
                if (((double) base - (double) inMeasure) > 0) {
                    return true;
                } else {
                    return false;
                }
            }
            case 3: {
                if (((double) base - (double) inMeasure) < 0) {
                    return true;
                } else {
                    return false;
                }
            }
            case 4: {
                if (((double) base - (double) inMeasure) >= 0) {
                    return true;
                } else {
                    return false;
                }
            }
            case 5: {
                if (((double) base - (double) inMeasure) <= 0) {
                    return true;
                } else {
                    return false;
                }
            }
            case 6: {
                break;
            }
            case 7: {
                break;
            }
            case 8: {
                break;
            }
            case 9: {
                break;
            }
            case 10: {
                break;
            }
        }

        return false;
    }
}
