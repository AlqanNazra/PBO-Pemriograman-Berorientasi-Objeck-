package com.test2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class Flight {                                       
    private String id;
    protected List<Passengers> passengers = new ArrayList<>(); // Ubah ke protected

    public Flight(String id) {
       this.id = id;
    }

    public String getId() {
       return id;
    }

    public List<Passengers> getPassengersList() {
       return Collections.unmodifiableList(passengers);
    }

    public abstract boolean addPassenger(Passengers passenger);            
    public abstract boolean removePassenger(Passengers passenger);         
}
