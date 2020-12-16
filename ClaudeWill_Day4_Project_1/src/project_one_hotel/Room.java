package project_one_hotel;

import java.util.ArrayList;

public class Room  {
	private int roomNum;
	private String bedType;
	private double rate;
	protected String occupantName;
	private char smoking;
	private boolean occupied;
	
	public Room() {
		this.roomNum = 0;
		this.bedType = "";
		this.rate = 0.0;
		this.occupantName = "Not Occupied";
		this.smoking = 'n';
		this.occupied = false;
		
	}
	
	public Room(int roomNum, String bedType,char smoking, double rate)
	{
		
		this.roomNum = roomNum;
		this.bedType = bedType;
		this.smoking = smoking;
		this.rate = rate;
		
	}
	// get and set roomNum
	public int getRoomNum() {
		return this.roomNum;
	}
	
	public void setRoomNum(int roomNum) {
		this.roomNum = roomNum;
	}
	// get and set bed type
	public String getBedType() {
		return this.bedType;
	}
	public void setBedType(String bedType) {
		this.bedType = bedType;
	}
	// get and set room rate
	public double getRate() {
		return this.rate;
	}
	public void setRate(double rate) {
		this.rate = rate;
	}
	// get and set occupantName
	public String getOccupantName() {
		return occupantName;
	}
	public void setOccupantName(String occupantName) {
		this.occupantName = occupantName;
	}
	// get and set smoking
	public char getSmoking() {
		return this.smoking;
	}
	public void setSmoking(char smoking) {
		this.smoking = smoking;
	}
	
	// get and set occupied
	public boolean getOccupied() {
		return this.occupied;
	}
	public void setOccupied(boolean occupied) {
		this.occupied = occupied;
	}
	
	// isOccupied() Method
	public boolean isOccupied() {
		return (this.occupied == true ? true : false);
	}
	@Override
	public String toString() {
		/*
		 * return room information for each room out of 5 rooms at the hotel
		 * includes the roomNumber, occupant name, the bed type, smoking or non smoking (char(s or n), the room rate, and whether the room is occupied
		 */
		return ("Room Number :"+this.roomNum+'\n'+"Occupant Name: "+this.occupantName+'\n'+"Bed Type: "+this.bedType+'\n'+"Smoking: "+this.smoking+
				'\n'+"Rate: "+this.rate+'\n'+'\n');
				
	}
}
