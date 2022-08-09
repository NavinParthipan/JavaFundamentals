package com.infy.finalTask;

public class RoomDetails implements RoomBillComponent {
	private int billId, noOfExtraPerson, noOfDaysStay;
	private String customerName, typeOfRoom;
	static int counter=101;
	
	RoomDetails(String customerName, String typeOfRoom, int noOfExtraPersons, int noOfDaysStay){
		this.customerName = customerName;
		this.typeOfRoom = typeOfRoom;
		this.noOfExtraPerson = noOfExtraPersons;
		this.noOfDaysStay = noOfDaysStay;
	}
	
	public int getBillId() {
		billId = counter++;
		return billId;
	}
	
	public String getCustomerName() {
		return customerName;
	}
	
	public String getTypeOfRoom() {
		return typeOfRoom;
	}
	
	public int getNoOfExtraPersons() {
		return noOfExtraPerson;	
	}
	
	public int getNoOfDaysStay() {
		return noOfDaysStay;
	}
	
	public boolean validateNoOfDaysStay() {
		if(noOfDaysStay>0 && noOfDaysStay<16) {
			return true;
		}
		return false;
	}
	
	public boolean validateNoOfExtraPerson() {
		if(noOfExtraPerson>2) {
			return false;
		}
		return true;
	}
	
	public boolean validateTypeOfRoom() {
		if("Standard".equals(typeOfRoom) || "Deluxe".equals(typeOfRoom) || "Cottage".equals(typeOfRoom)) {
			return true;
		}
		return false;
	}
	
	public float calculateBill()throws Exception{
		int baseRoomFare=0;
		if(!validateNoOfExtraPerson()) {
			throw new Exception("Maximum 2 extra persons only allowed");
		}
		else if(!validateNoOfDaysStay()) {
			throw new Exception("Days Stay should be atleast 1 and less than 16");
		}
		else if(!validateTypeOfRoom()) {
			throw new Exception("Please enter correct room type");
		}
		else {
			switch(typeOfRoom) {
			case "Standard" -> baseRoomFare = 2500;
			case "Deluxe" -> baseRoomFare = 3500;
			case "Cottage" -> baseRoomFare = 5500;
			}
		}
		float totalBill = (noOfDaysStay*baseRoomFare) + (noOfDaysStay*(float)food_charge) + ((float)extra_person_charge*noOfExtraPerson);
		totalBill = totalBill + ((float)tax*totalBill);
		return totalBill;
	}
}
