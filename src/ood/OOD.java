/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ood;

import asset.Asset;
import asset.AssetCatalogue;
import event.Event;
import event.EventCatalogue;
import java.io.Serializable;
import java.util.ArrayList;
import label.Label;
import label.LabelCatalogue;
import operation.Operation;
import operation.OperationCatalogue;
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
    ArrayList<Event> events;
    ArrayList<Operation> operations;
    private static OOD ood;

    private OOD() {
        assets = AssetCatalogue.getInstace().getAssets();
        labels = LabelCatalogue.getInstace().getLabels();
        applyRules = ConsistencyRules.getInstance().getApplyRules();
        events = EventCatalogue.getInstace().getEvents();
        operations = OperationCatalogue.getInstace().getOperations();
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
        EventCatalogue.getInstace().setEvents(events);
        OperationCatalogue.getInstace().setOperations(operations);
    }
}
