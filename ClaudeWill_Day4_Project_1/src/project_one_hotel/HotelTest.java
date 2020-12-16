package project_one_hotel;

import java.util.ArrayList;
import java.util.Collection;

public class HotelTest {
public static void main(String[] args) {
	// create hotel at two different locations
	Hotel hotel = new Hotel("Marriot","Houston, Tx");
	
	// add rooms to hotel
	hotel.addRoom(101, "queen", 'n', 90.00);
	hotel.addRoom(102, "double", 's', 95.00);
	hotel.addRoom(103, "queen", 'n', 100.00);
	hotel.addRoom(104, "king", 'n', 115.00);
	hotel.addRoom(105, "king", 's', 110.00);
	
	
	
	
	
	
	
	//call overriden toString methods from Room and Hotel class to diplay hotel and room information after reservation added
	System.out.println(hotel.toString());
			
	for(Room room: hotel.theRooms) {
		System.out.println(room.toString());
	}
	
	//  cancel reservation test
	hotel.cancelReservation("Bob Williams");
	
	// test if reservation exists
	hotel.cancelReservation("Bob Wallace");
	
	// create 5 reservations and test if hotel is full
	hotel.addReservation("Bob Marley", 'n', "queen");
	hotel.addReservation("James Barley", 'n', "queen");
	hotel.addReservation("Wan Williams", 's', "king");
	hotel.addReservation("James Brown", 'n', "king");
	hotel.addReservation("Susan McMillian", 's', "double");
	
	
	
	
	// print current details for hotel with reservations
	System.out.println(hotel.toString());
	
	/*for(Room room: hotel.theRooms) {
		System.out.println(room.toString());
	}
	*/
	// test isFull() method
	System.out.println(hotel.isFull());
	
	// test isEmpty() method
	System.out.println(hotel.isEmpty());
	// test printReservation() method
	System.out.println(hotel.toString());
	hotel.printReservationList();
	
	// test getDailySales() method
	System.out.println("Total Daily Sales: $"+hotel.getDailySales());
	
	// cancel another reservation
	hotel.cancelReservation("Wan Williams");
	
	
	// test occupancyPercentage
	System.out.println("Percentage of Rooms Occupied: "+hotel.occupancyPercentage()+"%.");
	System.out.println(hotel.occupiedCnt);
}
}
