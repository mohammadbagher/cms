/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package event;

import java.io.Serializable;
import java.util.ArrayList;
import operation.OperationCatalogue;

/**
 *
 * @author ali
 */
public class EventCatalogue  implements Serializable{
    private static final long serialVersionUID = 1L;
    
    private static EventCatalogue instance = null;
    
    private ArrayList<Event> events = new ArrayList<>();
    
    private EventCatalogue(){
        try{
            Event event = new Event(OperationCatalogue.getInstace().getOperations().get(0));
            event.setName("بلای آسمانی");
            addEvent(event);
        }catch(Exception e){}
    }
    
    public static EventCatalogue getInstace(){
        if(instance == null)
            instance = new EventCatalogue();
        return instance;
    }
    
    public void addEvent(Event event){
        events.add(event);
    }
    
    public Boolean remove(Event event){
        return events.remove(event);
    }
    
    public ArrayList<Event> getEvents(){
        return events;
    }

    public void setEvents(ArrayList<Event> events) {
        this.events = events;
    }
}
