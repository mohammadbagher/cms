/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rule;

import asset.Asset;
import java.util.ArrayList;

/**
 *
 * @author bagher
 */
public class ConsistencyRules {

    private ArrayList<Rule> rules = new ArrayList<>();
    private static ConsistencyRules CR;
    private ArrayList<ApplyRule> applyRules = new ArrayList<>();

    public ArrayList<ApplyRule> getApplyRules() {
        return applyRules;
    }

    private ConsistencyRules() {
        Rule rule1 = new Rule("مساوی است با", 1);
        Rule rule2 = new Rule("بزرگتر است از", 2);
        Rule rule3 = new Rule("کمتر است از", 3);
        Rule rule4 = new Rule("بزرگتر مساوی است از", 4);
        Rule rule5 = new Rule("کمتر مساوی است از", 5);
        Rule rule6 = new Rule("وجود دارد در", 6);
        Rule rule7 = new Rule("در خود دارد", 7);
        Rule rule8 = new Rule("وجود ندارد در", 8);
        Rule rule9 = new Rule("در خود ندارد", 9);
        Rule rule10 = new Rule("برابر نیست با", 10);
        rules.add(rule1);
        rules.add(rule2);
        rules.add(rule3);
        rules.add(rule4);
        rules.add(rule5);
        rules.add(rule6);
        rules.add(rule7);
        rules.add(rule8);
        rules.add(rule9);
        rules.add(rule10);
        asset.Asset asset1 = new Asset();
        asset.Asset asset2 = new Asset();
        asset1.setName("علی");
        asset1.setUID("ali.cheshme");
        asset2.setName("باقر");
        asset2.setUID("bagher.tabriz");
        ApplyRule apr = new ApplyRule(asset1, asset2, 1, 1, null, null, 0);
        applyRules.add(apr);
    }

    public static ConsistencyRules getInstance() {
        if (CR == null) {
            CR = new ConsistencyRules();
            return CR;
        } else {
            return CR;
        }
    }

//    String comment;
//    public static final int TYPE_EQUAL=1;
//    public static final int TYPE_BIGGER_THAN=2;
//    public static final int TYPE_LESS_THAN=3;
//    public static final int TYPE_EQUAL_OR_BIGGER_THAN=4;
//    public static final int TYPE_EQUAL_OR_LESS_THAN=5;
//    public static final int TYPE_IS_IN=6;
//    public static final int TYPE_CONTAINS=7;
//    public static final int TYPE_=8;
//    public static final int TYPE_EQUAL=9;
//    public static final int TYPE_EQUAL=10;
    public ArrayList<Rule> getRules() {
        return rules;
    }

    public void addApplyRule(ApplyRule apr) {
        this.applyRules.add(apr);
    }
}
