package com.infy.finalTask;

public class Tester {
	public static void main(String args[]) {
		RoomDetails client1 = new RoomDetails("Navin", "Cottage", 1, 10);
		RoomDetails client2 = new RoomDetails("Vinu", "eluxe", 0, 5);
		RoomDetails client3 = new RoomDetails("Parthipan", "Standard", 2, 1);
		
		float billAmount;
		
		RoomDetails[] clients = {client1,client2,client3};
		
		for(RoomDetails s:clients) {
			
			try {
				billAmount = s.calculateBill();
				System.out.println("BillId: "+s.getBillId());
				System.out.println("Customer Name: "+s.getCustomerName());
				System.out.println("No.of days of stay: "+s.getNoOfDaysStay());
				System.out.println("Total Bill: "+billAmount);
			}
			
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
			System.out.println("*****************\n");
		}
	}
}

