package com.infy.finalTask;

public interface RoomBillComponent {
	double tax=0.12;
	double extra_person_charge=500.0; 
	double food_charge=800.0;

	float calculateBill() throws Exception;
}
