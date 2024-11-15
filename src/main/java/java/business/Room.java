
package java.business;


public class Room {
    private String type;
    private int rent;
    private int roomNo;
public Room()
{
    
}
    public Room(String type, int rent, int roomNo) {
        this.type = type;
        this.rent = rent;
        this.roomNo = roomNo;
    }

    
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getRent() {
        return rent;
    }

    public void setRent(int rent) {
        this.rent = rent;
    }

    public int getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(int roomNo) {
        this.roomNo = roomNo;
    }
    
    
}
