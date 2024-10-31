package com.test2;

public class BusinessFlight extends Flight {                             
   
   public BusinessFlight(String id) {                                    
      super(id);                                                         
   }                                                                    
   @Override
   public boolean addPassenger(Passengers passenger) {                   
      if (passenger.isVip()) {                                           
         return passengers.add(passenger);                               
      }                                                                  
      return false;                                                      
   }                                                                     
   @Override
   public boolean removePassenger(Passengers passenger) {                 
      return false;                                                      
   }                                                                    
}