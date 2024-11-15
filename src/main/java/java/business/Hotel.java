
package java.business;

import java.util.ArrayList;
import java.util.List;


public class Hotel {
    private BookRoom bookRoom=new BookRoom();
    private List<BookRoom>bookedRoomList=new ArrayList<BookRoom>();
    private List<Room>roomList=new ArrayList<Room>();
    private Room room;//=new Room();
    private int flightBookingNo;//=1234;
    private static Hotel hotel=null;
    private List <BookedRoom> bookedHotelList=new ArrayList<BookedRoom>();
    private BookedRoom bookedRoom;
    private PersistentClass data=new PersistentClass();
    public static Hotel getHotelInstance()
    {
        if (hotel==null)
           hotel=( hotel=new Hotel());
        
        return hotel;
    }
    
    public Hotel()
    {
        addRoom("deluxe",5000,1);
        addRoom("suite",2500,10);
        addRoom("single", 1200,20);
         DbController obj=new DbController();
       // obj.AddPaymentDB("suite", 12345, 312);
        data.saveRoom(11, 50000, "deluxe");
        data.saveRoom(21, 25000, "single");
        data.saveRoom(1, 10000, "suite");
        
    }
    public void searchBookedRoom(int flightBookingNo)
    {
        
    }
    public void BookRoom(BookedRoom bookedRoom)
    {
        bookedRoomList.add(bookRoom);
        //bookedRoomList.add(room);
    }
    
    public Room searchRoom(String type)
    {
        for (int index=0;index<roomList.size();index++)
        {
            if (roomList.get(index).getType().equalsIgnoreCase(type))
                return roomList.get(index);
        }
        return null;
        
    }
    public void addRoom(String type, int rent, int no)
    {
        room=new Room(type,rent,no);
        roomList.add(room);
    }

    public int getFlightBookingNo() {
        return flightBookingNo;
    }

    public void setFlightBookingNo(int flightBookingNo) {
        this.flightBookingNo = flightBookingNo;
    }
    
    public void bookaRoom()
    {
        // set room attributes
        // set bookroom attributes
        // store bookroom obj in list
        // display back the information
        // go to the main menu and allow search
        
    }
    
    
    
    
} // class ends
