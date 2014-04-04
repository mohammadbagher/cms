/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ood;

import asset.Asset;
import asset.AssetCatalogue;
import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.UIManager;
import label.Label;
import label.LabelCatalogue;
import rule.ApplyRule;
import rule.ConsistencyRules;

/**
 *
 * @author Bagher
 */
public class OOD implements Serializable {

    ArrayList<Asset> assets;
    ArrayList<Label> labels;
    ArrayList<ApplyRule> applyRules;

    private OOD() {
        assets = AssetCatalogue.getInstace().getAssets();
        labels = LabelCatalogue.getInstace().getLabels();
        applyRules = ConsistencyRules.getInstance().getApplyRules();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            System.out.println("Error setting native LAF: " + e);
        }
    }
}
