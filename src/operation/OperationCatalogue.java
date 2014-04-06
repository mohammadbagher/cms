/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package operation;

import asset.AssetCatalogue;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author ali
 */
public class OperationCatalogue  implements Serializable{
    private static final long serialVersionUID = 1L;
    
    private static OperationCatalogue instance = null;
    
    private ArrayList<Operation> operations = new ArrayList<>();
    
    private OperationCatalogue(){
        /*mocking*/
        Operation operation = new Operation();
        operation.setName("تخریب برج آزادی");
        operations.add(operation);
        operation.setAsset(AssetCatalogue.getInstace().getAssets().get(0));
        operation.setAttachedLabel(AssetCatalogue.getInstace().getAssets().get(0).getAttachedLabels()[0]);
        operation = new Operation();
        operation.setName("تعمیر برج آزادی");
        operation.setAsset(AssetCatalogue.getInstace().getAssets().get(0));
        operation.setAttachedLabel(AssetCatalogue.getInstace().getAssets().get(0).getAttachedLabels()[0]);
        operations.add(operation);
        operation = new Operation();
        operation.setName("تزئین برج آزادی");
        operation.setAsset(AssetCatalogue.getInstace().getAssets().get(0));
        operation.setAttachedLabel(AssetCatalogue.getInstace().getAssets().get(0).getAttachedLabels()[0]);
        operations.add(operation);
    }
    
    public static OperationCatalogue getInstace(){
        if(instance == null)
            instance = new OperationCatalogue();
        return instance;
    }
    
    public void addOperation(Operation operation){
        operations.add(operation);
    }
    
    public Boolean remove(Operation operation){
        return operations.remove(operation);
    }
    
    public ArrayList<Operation> getOperations(){
        return operations;
    }

    public void setOperations(ArrayList<Operation> operations) {
        this.operations = operations;
    }
}
