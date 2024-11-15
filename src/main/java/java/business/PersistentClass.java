package java.business;


import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class PersistentClass {
    private List<Room>hotelRoomList;
    private List<BookedRoom>bookedRoomList;
    
    public BookedRoom searchBookedRoom(int flightBookingNo)
    {
         BookedRoom bookedroom = null;
System.out.println("Retrieving locations");
	Session session =HibernateUtil.getSessionFactory().getCurrentSession();
	Transaction tx = session.beginTransaction();

       Query query = session.createQuery("from BookedRoom");
	// query.list() returns objects, cast to List<Location>
	bookedRoomList = (List<BookedRoom>)query.list( );
	tx.commit();

	//for(Room l : list ) out.printf("%d %s %s\n", 
	//	l.getId(), l.getName(), l.getAddress() );
        
        for (int index=0;index<bookedRoomList.size();index++)
        {
            if (bookedRoomList.get(index).getFlightBookingNo()==flightBookingNo)
                return bookedRoomList.get(index);
        }
	if ( session.isOpen() ) session.close();


        return null;
    }
     public  void saveBookedRoom(BookedRoom bookedRoom) {
		//Location loc1 = new Location( );
		//loc1.setName("Kasetsart University");
		//loc1.setAddress("90 Pahonyotin Rd, Bangkok");
		//Location loc2 = new Location();
		//loc2.setName("UCLA");
		//loc2.setAddress("Westwood, California");
       // Room room=new Room(type,rent,roomNo );
        // BookedRoom bookedRoom=new BookedRoom();//'//(flightBookingNo, room);
        // bookedRoom.setFlightBookingNo(flightBookingNo);
        // bookedRoom.setRoom(room);

		Session session =HibernateUtil.getSessionFactory().getCurrentSession();
		Transaction tx = session.beginTransaction();
		session.saveOrUpdate( bookedRoom );
		//session.saveOrUpdate( loc2 );
		tx.commit();
		System.out.println("Locations saved");
} // func ends
    
    public  void saveRoom(int roomNo, int rent, String type) {
		//Location loc1 = new Location( );
		//loc1.setName("Kasetsart University");
		//loc1.setAddress("90 Pahonyotin Rd, Bangkok");
		//Location loc2 = new Location();
		//loc2.setName("UCLA");
		//loc2.setAddress("Westwood, California");
        Room room=new Room(type,rent,roomNo );

		Session session =HibernateUtil.getSessionFactory().getCurrentSession();
		Transaction tx = session.beginTransaction();
		session.saveOrUpdate( room );
		//session.saveOrUpdate( loc2 );
		tx.commit();
		System.out.println("Locations saved");
} // func ends
    
    public Room getRoomByType(String type) {

        Room room = null;
System.out.println("Retrieving locations");
	Session session =HibernateUtil.getSessionFactory().getCurrentSession();
	Transaction tx = session.beginTransaction();

       Query query = session.createQuery("from Room");
	// query.list() returns objects, cast to List<Location>
	hotelRoomList = (List<Room>)query.list( );
	tx.commit();

	//for(Room l : list ) out.printf("%d %s %s\n", 
	//	l.getId(), l.getName(), l.getAddress() );
        
        for (int index=0;index<hotelRoomList.size();index++)
        {
            if (hotelRoomList.get(index).getType().equalsIgnoreCase(type))
                return hotelRoomList.get(index);
        }
	if ( session.isOpen() ) session.close();


        return null;
    } // func ends
    
} // class ends
