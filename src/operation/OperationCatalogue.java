/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package operation;

import java.io.Serializable;
import java.util.Vector;

/**
 *
 * @author ali
 */
public class OperationCatalogue  implements Serializable{
    
    private static OperationCatalogue instance = null;
    
    private final Vector<Operation> operations = new Vector<Operation>();
    
    private OperationCatalogue(){
        /*mocking*/
        int t = 4;
        while(t-- > 0){
            Operation operation = new Operation();
            operation.setName("باقر");
            operations.add(operation);
            operation = new Operation();
            operation.setName("تبریزی");
            operations.add(operation);
            operation = new Operation();
            operation.setName("کوهی");
            operations.add(operation);
        }
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
    
    public Vector<Operation> getOperations(){
        return operations;
    }
}
