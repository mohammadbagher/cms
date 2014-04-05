/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ood;

import asset.Asset;
import asset.AssetCatalogue;
import java.io.Serializable;
import java.util.ArrayList;
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
    String name;
    private static OOD ood;

    private OOD() {
        name = "salam";
        assets = AssetCatalogue.getInstace().getAssets();
        labels = LabelCatalogue.getInstace().getLabels();
        applyRules = ConsistencyRules.getInstance().getApplyRules();
    }

    public static OOD getInstance() {
        if (ood == null) {
            ood = new OOD();
            return ood;
        }
        return ood;
    }

    public void initial(OOD ood) {
        AssetCatalogue.getInstace().setAssets(ood.assets);
        LabelCatalogue.getInstace().setLabels(ood.labels);
        ConsistencyRules.getInstance().setApplyRles(ood.applyRules);
    }
}
