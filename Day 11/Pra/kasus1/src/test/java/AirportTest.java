import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import com.test2.BusinessFlight;
import com.test2.EconomyFlight;
import com.test2.Flight;
import com.test2.Passengers;

public class AirportTest {
    @DisplayName("Given there is an economy flight")                    
    @Nested                                                              
    class EconomyFlightTest {
        private Flight economyFlight;                                    
        @BeforeEach 
        void setUp() {                                                   
            economyFlight = new EconomyFlight("1");                 
        }                                                               
        @Test
        public void testEconomyFlightRegularPassenger() {
            Passengers mike = new Passengers("Mike", false);              
            assertEquals("1", economyFlight.getId());                    
            assertEquals(true, economyFlight.addPassenger(mike));        
            assertEquals(1, economyFlight.getPassengersList().size());   
            assertEquals("Mike",                                         
                    economyFlight.getPassengersList().get(0).getName()); 
            assertEquals(true, economyFlight.removePassenger(mike));     
            assertEquals(0, economyFlight.getPassengersList().size());   
        }
        @Test
        public void testEconomyFlightVipPassenger() {
            Passengers james = new Passengers("James", true);             
            assertEquals("1", economyFlight.getId());                   
            assertEquals(true, economyFlight.addPassenger(james));         
            assertEquals(1, economyFlight.getPassengersList().size());   
            assertEquals("James",                                        
            economyFlight.getPassengersList().get(0).getName()); 
            assertEquals(false, economyFlight.removePassenger(james));  
            assertEquals(1, economyFlight.getPassengersList().size());  
        }
    }
    @DisplayName("Given there is a business flight")                    
    @Nested                                                              
    class BusinessFlightTest {                                         
        private Flight businessFlight;                                  
        @BeforeEach                                                     
        void setUp() {                                                  
            businessFlight = new BusinessFlight("2");            
        }                                                                 
        @Test
        public void testBusinessFlightRegularPassenger() {              
            Passengers mike = new Passengers("Mike", false);               
            assertEquals(false, businessFlight.addPassenger(mike));      
            assertEquals(0, businessFlight.getPassengersList().size());  
            assertEquals(false, businessFlight.removePassenger(mike));   
            assertEquals(0, businessFlight.getPassengersList().size());  
        }
        @Test
        public void testBusinessFlightVipPassenger() {
            Passengers james = new Passengers("James", true);            
            assertEquals(true, businessFlight.addPassenger(james));      
            assertEquals(1, businessFlight.getPassengersList().size());  
            assertEquals(false, businessFlight.removePassenger(james));  
            assertEquals(1, businessFlight.getPassengersList().size());  
        }
    }
}