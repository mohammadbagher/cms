/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package event;

import exceptions.DuplicatedValueException;
import java.io.Serializable;
import label.AttachedLabel;
import operation.Operation;

/**
 *
 * @author ali
 */
public class Event implements Serializable{
    private static final long serialVersionUID = 1L;
    
    private String name;
    private Operation operation;
    private AttachedLabel lastAttachedLabel;
    private AttachedLabel nextAttachedLabel;

    public Event(Operation operation) {
        this.operation = operation;
        this.lastAttachedLabel = operation.getAttachedLabel();
        this.nextAttachedLabel = new AttachedLabel();
        this.nextAttachedLabel.setAsset(operation.getAttachedLabel().getAsset());
        this.nextAttachedLabel.setLabel(operation.getAttachedLabel().getLabel());
    }
    
    public Operation getOperation() {
        return operation;
    }

    public void setOperation(Operation operation) {
        this.operation = operation;
        this.lastAttachedLabel = operation.getAttachedLabel();
        this.nextAttachedLabel = new AttachedLabel();
        this.nextAttachedLabel.setAsset(operation.getAttachedLabel().getAsset());
        this.nextAttachedLabel.setLabel(operation.getAttachedLabel().getLabel());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public boolean addValue(String value) throws DuplicatedValueException {
        return nextAttachedLabel.addValue(value);
    }
    
    public void trigger() throws DuplicatedValueException {
        lastAttachedLabel.clearValues();
        for(Object value: nextAttachedLabel.getValues()){
            lastAttachedLabel.addValue(value.toString());
        }
    }
    
    public Object[] getValues(){
        return nextAttachedLabel.getValues();
    }
}
