package project_one_hotel;

import java.util.ArrayList;
import java.util.List;


public class Hotel extends Room{
	static List<Room> theRooms = new ArrayList<Room>();
	protected String name;
	protected String location;
	protected int occupiedCnt;
	protected int numOfRooms;
	private static final int NOT_FOUND = -1;
	// default instructor to initialize Hotel
	public Hotel() {
		
		this.name = "";
		this.location = "";
		this.occupiedCnt = 0;
		this.numOfRooms = 0;
	}
	// parameterized constructor
	public Hotel(String name, String location) {
		this.name = name;
		this.location = location;
		
	}
	// add rooms to hotel
	public void addRoom(int roomNumber, String bedType, char smokeOrNonSmoke, double roomRate) {
		
		theRooms.add(new Room(roomNumber, bedType, smokeOrNonSmoke, roomRate));
		
		this.numOfRooms++;
	}
	 
	// find if all rooms are occupied
	public boolean isFull() {
		
		if(this.occupiedCnt == 5) {
			return true;
		} else
		{
			return false;
		}
	}
	// check if all rooms are unoccupied
	public boolean isEmpty() {
		
		if(this.occupiedCnt == 0) {
			return true;
		} else
		{
			return false;
		}
	}
	
	// create reservation
	public void addReservation(String occupantName, char smoking, String bedType) {
		for(Room room: theRooms) {
			if((room.getOccupied() == false) && (room.getSmoking() == smoking)&& (room.getBedType() == bedType)) {
				room.setOccupantName(occupantName);
				room.setOccupied(true);
				
				break;
			}
		}
		this.occupiedCnt++;
	}
	
	// cancel reservation
	public void cancelReservation(String guestName) {
		
		for(Room room: theRooms) {
			if(this.findReservation(guestName) == 1) {
				room.setOccupantName("Not Occupied");
				this.occupiedCnt--;
				System.out.println("Reservation for: "+guestName+" canceled!\n");
				break;
			}
			System.out.println("No reservation found for: "+guestName+".");
			break;
		}
		
	}
		
	// find a reservation
	private int findReservation(String occupantName) {
		for(Room room: theRooms) {
			if(room.getOccupantName() == occupantName) {
				return 1;
			}
		}
		return Hotel.NOT_FOUND;
	}
	
	// print reservation list
	public void printReservationList() {
		for(Room room: theRooms) {
			if(room.getOccupied() == true) {
				System.out.println(room.toString());
			}
			
		}
	}
	
	// calculate and return daily sales
	public double getDailySales() {
		double total = 0.0;
		for(Room room: theRooms) {
			if(room.getOccupied() == true) {
				total += room.getRate();
			}
		}
		return total;
	}
	
	// get the percent of the hotel which is occupied
	public double occupancyPercentage() {
		return (((double)this.occupiedCnt/this.numOfRooms)*100);

	}
	@Override
	public String toString()
	{		
		return ("Hotel Name: "+this.name+'\n'+"Number of Rooms: "+this.numOfRooms+'\n'+"Number of Occupied Rooms: "+this.occupiedCnt+'\n'+'\n'+
				"Room Details are: "+'\n'+'\n');
		
		
		
	}
	
}
