/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asset;

import java.io.Serializable;
import java.util.ArrayList;
import label.AttachedLabel;
import label.Label;
import label.LabelCatalogue;

/**
 *
 * @author bagher
 */
public class AssetCatalogue implements Serializable {
    private static final long serialVersionUID = 1L;
    private static AssetCatalogue instance = null;
    private ArrayList<Asset> assets = new ArrayList<Asset>();

    private AssetCatalogue() {
        Asset asset = new Asset();
        asset.setName("برج آزادی");
        asset.setUID("tower.azadi");
        assets.add(asset);
        ArrayList<Label> labels = LabelCatalogue.getInstace().getLabels();
        AttachedLabel attachedLabel = new AttachedLabel();
        attachedLabel.setAsset(asset);
        attachedLabel.setLabel(labels.get(0));
        asset.attachLable(attachedLabel);
        
        asset = new Asset();
        asset.setName("برج میلاد");
        asset.setUID("tower.milad");
        assets.add(asset);
        asset = new Asset();
        asset.setName("خیابان آزادی");
        asset.setUID("street.azadi");
        assets.add(asset);
        asset = new Asset();
        asset.setName("جرثقیل شماره ۱۲۳");
        asset.setUID("jarsaghil.123");
        assets.add(asset);
        asset = new Asset();
        asset.setName("پایه‌ی جرثقیل شماره ۴۱");
        asset.setUID("payesaghil.41");
        assets.add(asset);
        
//        }
    }

    public static AssetCatalogue getInstace() {
        if (instance == null) {
            instance = new AssetCatalogue();
        }
        return instance;
    }

    public void addOperation(Asset asset) {
        assets.add(asset);
    }

    public Boolean remove(Asset asset) {
        return assets.remove(asset);
    }

    public ArrayList<Asset> getAssets() {
        return assets;
    }
    
    public void setAssets(ArrayList<Asset>assets){
        this.assets=assets;
    }
}
