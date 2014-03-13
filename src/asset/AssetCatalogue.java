/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package asset;

import java.util.ArrayList;
/**
 *
 * @author bagher
 */
public class AssetCatalogue {
    private static AssetCatalogue instance = null;
    private final ArrayList<Asset> assets = new ArrayList<Asset>();
    
    private AssetCatalogue(){
        /*mocking*/
        int t = 5;
        while(t-- > 0){
            Asset asset = new Asset();
            asset.setName("علی");
            assets.add(asset);
            asset = new Asset();
            asset.setName("چشمه");
            assets.add(asset);
            asset = new Asset();
            asset.setName("احمد");
            assets.add(asset);
            asset = new Asset();
            asset.setName("رضا");
            assets.add(asset);
        }
    }
    
    public static AssetCatalogue getInstace(){
        if(instance == null)
            instance = new AssetCatalogue();
        return instance;
    }
    
    public void addOperation(Asset asset){
        assets.add(asset);
    }
    
    public Boolean remove(Asset asset){
        return assets.remove(asset);
    }
    
    public ArrayList<Asset> getAssets(){
        return assets;
    }
    
}
