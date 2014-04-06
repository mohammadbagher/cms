/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package event;

import exceptions.DuplicatedValueException;
import label.AttachedLabel;
import operation.Operation;

/**
 *
 * @author ali
 */
public class Event {
    private Operation operation;
    private AttachedLabel lastAttachedLabel;
    private AttachedLabel nextAttachedLabel;

    public Event(Operation operation, AttachedLabel attachedLabel) {
        this.operation = operation;
        this.lastAttachedLabel = attachedLabel;
        this.nextAttachedLabel = new AttachedLabel();
        this.nextAttachedLabel.setAsset(attachedLabel.getAsset());
        this.nextAttachedLabel.setLabel(attachedLabel.getLabel());
    }
    
    public Operation getOperation() {
        return operation;
    }

    public void setOperation(Operation operation) {
        this.operation = operation;
    }

    public void setAttachedLabel(AttachedLabel attachedLabel) {
        this.lastAttachedLabel = attachedLabel;
        this.nextAttachedLabel = new AttachedLabel();
        this.nextAttachedLabel.setAsset(attachedLabel.getAsset());
        this.nextAttachedLabel.setLabel(attachedLabel.getLabel());
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
}
