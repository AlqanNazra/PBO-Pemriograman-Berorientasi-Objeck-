package com.test2;

public class EconomyFlight extends Flight {                         
    public EconomyFlight(String id) {                                     
       super(id);                                                         
    }

    @Override
    public boolean addPassenger(Passengers passenger) {                   
       return passengers.add(passenger); // Langsung gunakan daftar passengers
    }                                                                   

    @Override
    public boolean removePassenger(Passengers passenger) {                 
       if (!passenger.isVip()) {                                          
          return passengers.remove(passenger); // Langsung gunakan daftar passengers
       }                                                                  
       return false;                                                     
    }                                                                   
}
