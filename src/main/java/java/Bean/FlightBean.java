
package java.Bean;

import java.util.ArrayList;
import java.util.List;


public class FlightBean 
{
    String flightNumber;
    String destination;
    String departureDate;
    String departureTime;
    int noOfSeats;
    List <SeatBean> seatList = new ArrayList <SeatBean>();

    public FlightBean() {
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setDepartureDate(String departureDate) {
        this.departureDate = departureDate;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public void setNoOfSeats(int noOfSeats) {
        this.noOfSeats = noOfSeats;
    }
    

    

    public void setSeatList(SeatBean obj) {
        seatList.add(obj);
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getDestination() {
        return destination;
    }

    public String getDepartureDate() {
        return departureDate;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public int getNoOfSeats() {
        return noOfSeats;
    }

    public List<SeatBean> getSeatList() {
        return seatList;
    }
    
    
    
}
