/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package operation;

import asset.Asset;
import label.AttachedLabel;

/**
 *
 * @author ali
 */
public class Operation {
    private String name;
    private Asset asset;
    private AttachedLabel attachedLabel;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Asset getAsset() {
        return asset;
    }

    public void setAsset(Asset asset) {
        this.asset = asset;
    }

    public AttachedLabel getAttachedLabel() {
        return attachedLabel;
    }

    public void setAttachedLabel(AttachedLabel attachedLabel) {
        this.attachedLabel = attachedLabel;
    }
    
    
}
